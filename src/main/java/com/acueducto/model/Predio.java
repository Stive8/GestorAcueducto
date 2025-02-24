package com.acueducto.model;

import java.time.*;

public abstract class Predio {

    private String propietario;
    private String direccion;
    private LocalDate fechaRegistro;
    private String estadoCuenta;
    private int estrato;
    private double consumo;

    public Predio(String propietario, String direccion, LocalDate fechaRegistro, String estadoCuenta, int estrato, double consumo) {
        this.propietario = propietario;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.estadoCuenta = estadoCuenta;
        this.estrato = estrato;
        this.consumo = consumo;
    }

    public double definirTarifa() {

        int estrato = this.estrato;
        double tarifa;

        switch (estrato) {
            case 1:

                tarifa = 1000;

                break;

            case 2:
                tarifa = 2000;
                break;

            case 3:
                tarifa = 3000;
                break;

            case 4:
                tarifa = 4000;
                break;

            case 5:
                tarifa = 5000;
                break;

            case 6:
                tarifa = 6000;
                break;
            default:
                tarifa = 0;
                
        }
        
        return tarifa;

    }
    
    public double calcularPago(){
        
        double tarifa = definirTarifa();
        return tarifa*getConsumo();
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

}
