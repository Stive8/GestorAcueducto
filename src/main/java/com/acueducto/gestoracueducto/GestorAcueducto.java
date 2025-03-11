package com.acueducto.gestoracueducto;

import com.acueducto.service.ServicioAcueducto;
import com.acueducto.view.GUIPrincipal;

public class GestorAcueducto {

    public static void main(String[] args) {
        
        ServicioAcueducto servicioAcueducto = new ServicioAcueducto();
        GUIPrincipal gui = new GUIPrincipal(servicioAcueducto);
        gui.setVisible(true);
    }
}
