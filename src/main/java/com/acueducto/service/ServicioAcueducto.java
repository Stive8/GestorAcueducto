package com.acueducto.service;

import com.acueducto.exceptions.PredioException;
import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.model.Predio;
import com.acueducto.model.Residencial;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioAcueducto implements IServicioAcueducto {

    private static List<Predio> predios = new ArrayList<>();
    private static int countId = 1;

    @Override
    public int incrementarId() {
        return countId++;
    }

    @Override
    public Comercial crearComercial(String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) throws PredioException {

        if (propietario == null || propietario.trim().isEmpty()) {
            throw new PredioException("El Propietario no puede estar vacío.");
        }

        if (direccion == null || direccion.trim().isEmpty()) {
            throw new PredioException("La direccion no puede estar vacío.");
        }

        if (String.valueOf(estrato).equalsIgnoreCase("Seleccione una opcion")) {
            throw new PredioException("Debe escoger un estrato válido.");
        }

        if (consumo <= 0) {
            throw new PredioException("El consumo debe ser mayor que cero.");
        }

        if (impuesto <= 0) {
            throw new PredioException("El consumo debe ser mayor que cero.");
        }

        if (representanteLegal == null || propietario.trim().isEmpty()) {
            throw new PredioException("El Representante Legal no puede estar vacío.");
        }

        if (tipoComercio == null || propietario.trim().isEmpty()) {
            throw new PredioException("El Tipo de Comercio no puede estar vacío.");
        }

        Comercial comercial = new Comercial(0, incrementarId(), tipoComercio, impuesto, representanteLegal, licenciaComercial, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
        double valorFactura = comercial.calcularPago();
        comercial.setValorFactura(valorFactura);
        return comercial;
    }

    @Override
    public Residencial crearResidencial(int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) throws PredioException {

        if (propietario == null || propietario.trim().isEmpty()) {
            throw new PredioException("El Propietario no puede estar vacío.");
        }

        if (direccion == null || direccion.trim().isEmpty()) {
            throw new PredioException("La direccion no puede estar vacío.");
        }

        if (String.valueOf(estrato).equalsIgnoreCase("Seleccione una opcion")) {
            throw new PredioException("Debe escoger un estrato válido.");
        }

        if (consumo <= 0) {
            throw new PredioException("El consumo debe ser mayor que cero.");
        }

        if (String.valueOf(subsidio).equalsIgnoreCase("Seleccione una opcion")) {
            throw new PredioException("Debe escoger un subsidio válido.");
        }
        if (String.valueOf(subsidio).equalsIgnoreCase("No Aplica")) {
            subsidio = 0;
        }

        if (tipoVivienda == null || tipoVivienda.trim().isEmpty()) {
            throw new PredioException("El tipo de vivienda no puede estar vacío.");
        }

        Residencial residencial = new Residencial(0, incrementarId(), subsidio, tipoVivienda, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
        double valorFactura = residencial.calcularPago();
        residencial.setValorFactura(valorFactura);

        return residencial;
    }

    @Override
    public void actualizarResidencial(int index, int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) throws PredioException {

        if (propietario == null || propietario.trim().isEmpty()) {
            throw new PredioException("El Propietario no puede estar vacío.");
        }

        if (direccion == null || direccion.trim().isEmpty()) {
            throw new PredioException("La direccion no puede estar vacío.");
        }

        if (String.valueOf(estrato).equalsIgnoreCase("Seleccione una opcion")) {
            throw new PredioException("Debe escoger un estrato válido.");
        }

        if (consumo <= 0) {
            throw new PredioException("El consumo debe ser mayor que cero.");
        }

        if (String.valueOf(subsidio).equalsIgnoreCase("Seleccione una opcion")) {
            throw new PredioException("Debe escoger un subsidio válido.");
        }
        if (String.valueOf(subsidio).equalsIgnoreCase("No Aplica")) {
            subsidio = 0;
        }

        if (tipoVivienda == null || tipoVivienda.trim().isEmpty()) {
            throw new PredioException("El tipo de vivienda no puede estar vacío.");
        }

        Residencial pre = (Residencial)predios.get(index);
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
    }

    @Override
    public void adicionarResidencial(Residencial residencial) {
        predios.add(residencial);
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

}
