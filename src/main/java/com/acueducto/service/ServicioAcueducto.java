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
    private static List<Comercial> prediosComerciales = new ArrayList<>();
    private static List<Residencial> prediosResidenciales = new ArrayList<>();

    @Override
    public void crearComercial(String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {
        Comercial comercial = new Comercial(tipoComercio, impuesto, representanteLegal, licenciaComercial, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
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

        return new Residencial(subsidio, tipoVivienda, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
    }

    @Override
    public void inhabilitarResidencial(String nombrePropietario) throws PredioException{
        
        for (Residencial predio : prediosResidenciales){
            if (predio.getPropietario().equalsIgnoreCase(nombrePropietario)){
                predio.setEstadoCuenta("INAC");
                return;
            }
        }
        
        throw new PredioException("No se ha encontrado el propietario.");

        
        

    }

    @Override
    public void adicionarComercial(Comercial comercial) {
        predios.add(comercial);
        prediosComerciales.add(comercial);
    }

    @Override
    public void adicionarResidencial(Residencial residencial) {
        predios.add(residencial);
        prediosResidenciales.add(residencial);
    }

    @Override
    public List<Residencial> getResidencial() {
        return prediosResidenciales;
    }

    @Override
    public List<Comercial> getComercial() {
        return prediosComerciales;
    }

}
