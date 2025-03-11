package com.acueducto.service;

import com.acueducto.exceptions.PredioException;
import com.acueducto.model.Comercial;
import com.acueducto.model.LicenciaComercial;
import com.acueducto.model.Predio;
import com.acueducto.model.Residencial;
import java.time.*;
import java.util.List;

public interface IServicioAcueducto {

    public Comercial crearComercial(String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo);

    public Residencial crearResidencial(int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo);

    public void adicionarComercial(Comercial comercial);

    public void adicionarResidencial(Residencial residencial);

    public List<Predio> getResidencial();

    public List<Predio> getComercial();

    public void inhabilitarPredio(int id) throws PredioException;

    public void actualizarResidencial(int index, int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo);

    public void actualizarComercial(int index, String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, int estrato, double consumo);

    public int incrementarId();

    public Predio buscarPredioPorId(int id);

}
