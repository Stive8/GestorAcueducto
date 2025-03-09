package com.acueducto.model;

import java.time.LocalDate;

public class Comercial extends Predio {

    private String tipoComercio;
    private double impuesto;
    private String representanteLegal;
    private LicenciaComercial licenciaComercial;

    public Comercial(double valorFactura, int id, String tipoComercio, double impuesto, String representanteLegal, LicenciaComercial licenciaComercial, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {
        super(valorFactura, id, propietario, direccion, fechaRegistro, estadoCuenta, estrato, consumo);
        this.tipoComercio = tipoComercio;
        this.impuesto = impuesto;
        this.representanteLegal = representanteLegal;
        this.licenciaComercial = licenciaComercial;
    }

    @Override
    public double calcularPago() {
        double tarifa = definirTarifa();
        return tarifa + (tarifa * (impuesto / 100));
    }

    public String getTipoComercio() {
        return tipoComercio;
    }

    public void setTipoComercio(String tipoComercio) {
        this.tipoComercio = tipoComercio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public LicenciaComercial getLicenciaComercial() {
        return licenciaComercial;
    }

    public void setLicenciaComercial(LicenciaComercial licenciaComercial) {
        this.licenciaComercial = licenciaComercial;
    }

}
