package com.acueducto.model;

public class Acueducto {

    private String nombre;
    private String nit;
    private String presidente;
    private static Acueducto acueducto;

    private Acueducto() {

    }

    public static Acueducto getAcueducto() {
        if (acueducto == null) {
            acueducto = new Acueducto();
            acueducto.nombre = "Acueducto Ibagué";
            acueducto.nit = "11122233-13";
            acueducto.presidente = "Pepito";
        }

        return acueducto;
    }
    
    public String toString(){
        return "Nombre: " + acueducto.nombre
                + "\n" + "NIT: " + acueducto.nit
                + "\n" + "Presidente: " + acueducto.presidente; 
    }

}
