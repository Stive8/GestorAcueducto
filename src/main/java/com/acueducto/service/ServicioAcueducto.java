package com.acueducto.service;

import com.acueducto.exceptions.PredioException;
import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.model.Predio;
import com.acueducto.model.Residencial;
import com.acueducto.view.ICambiable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioAcueducto implements IServicioAcueducto {

    private static List<Predio> predios = new ArrayList<>();
    private List<ICambiable> guis = new ArrayList<>();
    private static int countId = 1;

    @Override
    public int incrementarId() {
        return countId++;
    }

    @Override
    public Comercial crearComercial(String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {

        Comercial comercial = new Comercial(0, incrementarId(), tipoComercio, impuesto, representanteLegal, licenciaComercial, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
        double valorFactura = comercial.calcularPago();
        comercial.setValorFactura(valorFactura);
        return comercial;
    }

    @Override
    public Residencial crearResidencial(int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {

        Residencial residencial = new Residencial(0, incrementarId(), subsidio, tipoVivienda, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
        double valorFactura = residencial.calcularPago();
        residencial.setValorFactura(valorFactura);
        return residencial;
    }

    @Override
    public void actualizarResidencial(int index, int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {

        Residencial pre = (Residencial) predios.get(index);
        pre.setConsumo(consumo);
        pre.setDireccion(direccion);
        pre.setEstadoCuenta(estadoCuenta);
        pre.setEstrato(estrato);
        pre.setFechaRegistro(fechaRegistro);
        pre.setPropietario(propietario);
        pre.setSubsidio(subsidio);
        pre.setTipoVivienda(tipoVivienda);

        double valorFactura = pre.calcularPago();
        pre.setValorFactura(valorFactura);

        System.out.println("Residencial actualizado: " + pre.getId());
        cambio(); // Notificar cambios

    }

    @Override
    public void actualizarComercial(int index, String tipoComercio, double impuesto, String representanteLegal,
            String propietario, String direccion,
            LocalDate fechaRegistro, int estrato, double consumo) {

        Comercial com = (Comercial) predios.get(index);

        com.setTipoComercio(tipoComercio);
        com.setImpuesto(impuesto);
        com.setRepresentanteLegal(representanteLegal);
        com.setPropietario(propietario);
        com.setDireccion(direccion);
        com.setFechaRegistro(fechaRegistro);
        com.setEstrato(estrato);
        com.setConsumo(consumo);

        double valorFactura = com.calcularPago();
        com.setValorFactura(valorFactura);

        System.out.println("Comercial actualizado: " + com.getId());
        cambio(); // Notificar cambios
    }

    @Override
    public void inhabilitarPredio(int id) throws PredioException {

        for (Predio predio : predios) {
            if (predio.getId() == id) {
                predio.setEstadoCuenta("INAC");
                return;
            }
        }

        throw new PredioException("No se ha encontrado el propietario.");
    }

    @Override
    public void adicionarComercial(Comercial comercial) {
        predios.add(comercial);
        cambio();
    }

    @Override
    public void adicionarResidencial(Residencial residencial) {
        predios.add(residencial);
        cambio();

    }

    @Override
    public List<Predio> getResidencial() {
        List<Predio> residenciales = new ArrayList<>();

        for (Predio pre : predios) {
            if (pre instanceof Residencial) {
                residenciales.add(pre);
            }
        }

        return residenciales;
    }

    @Override
    public List<Predio> getComercial() {
        List<Predio> comerciales = new ArrayList<>();

        for (Predio pre : predios) {
            if (pre instanceof Comercial) {
                comerciales.add(pre);
            }
        }

        return comerciales;
    }

    @Override
    public Predio buscarPredioPorId(int id) {
        for (Predio pre : predios) {
            if (pre.getId() == id) {
                return pre;
            }
        }
        return null;
    }

    public void registarGui(ICambiable gui) {
        guis.add(gui);
    }

    public void desRegistrarGui(ICambiable gui) {
        guis.remove(gui);
    }

    private void cambio() {
        System.out.println("Notificando cambio a las GUI...");
        for (ICambiable gui : guis) {
            gui.cambio();
        }
    }

}
