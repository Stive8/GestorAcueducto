package com.acueducto.model;

import java.time.*;

public class Residencial extends Predio implements ISubsidiable {

    private int subsidio;
    private String tipoVivienda;

    public Residencial(double valorFactura, int id, int subsidio, String tipoVivienda, String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {
        super(valorFactura, id, propietario, direccion, LocalDate.now(), estadoCuenta, estrato, consumo);
        this.subsidio = subsidio;
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public double calcularSubsidio() {
        switch (getSubsidio()) {
            case 1:
                return 0.02;
            case 2:
                return 0.05;
            case 3:
                return 0.08;
            default:
                return 0;
        }
    }

    @Override
    public double calcularPago() {
        double tarifaFinal = definirTarifa() * getConsumo();
        return tarifaFinal * (1 - calcularSubsidio());
    }

    public int getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(int subsidio) {
        this.subsidio = subsidio;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

}
