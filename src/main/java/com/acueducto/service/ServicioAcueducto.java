package com.acueducto.service;

import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.model.Predio;
import com.acueducto.model.Residencial;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioAcueducto implements IServicioAcueducto {

    private static List<Predio> predios = new ArrayList();
    private static List<Comercial> prediosComerciales = new ArrayList();
    private static List<Residencial> prediosResidenciales = new ArrayList();

    @Override
    public void crearComercial(String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {
        Comercial comercial = new Comercial(tipoComercio, impuesto, representanteLegal, licenciaComercial, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
    }

    @Override
    public Residencial crearResidencial(int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {
        Residencial residencial = new Residencial(subsidio, tipoVivienda, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
        return residencial;
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
    public List <Residencial> getResidencial(){
        return prediosResidenciales;
    }

}
