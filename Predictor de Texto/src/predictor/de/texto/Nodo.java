/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictor.de.texto;

import java.util.ArrayList;

/**
 *
 * @author Fabian Osorio
 */
public class Nodo {
    ArrayList<String> letras = new ArrayList<>();
    Nodo hijo;

    public Nodo() {
        this.letras = null;
        this.hijo = null;
    }
}
