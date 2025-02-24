package com.acueducto.service;

import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.model.Residencial;
import java.time.*;
import java.util.List;

public interface IServicioAcueducto {
    
    public void crearComercial(String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo);
    public void adicionarComercial (Comercial comercial);
    public Residencial crearResidencial(int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo);
    public void adicionarResidencial (Residencial residencial);
    public List <Residencial> getResidencial();
    
    
}
