/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author santi
 */
public class N_doble {
    // Variable en la cual se va a guardar el valor.
    private String num;
    // Variable para enlazar los nodos.
    private N_doble siguiente;
    private N_doble previo;
    
    /**
    
    /**
     * Constructor que inicializamos el valor de las variables y le pasamos el valor del nodo.
     */
    
    N_doble(String x) {
        this.num=x;
        this.siguiente = null;
        this.previo = null;
    }

    
    // Métodos get y set para los atributos.

    public String getNumero() {
        return num;
    }

    public void setNumero(String numero) {
        this.num = numero;
    }
    
    public N_doble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(N_doble siguiente) {
        this.siguiente = siguiente;
    }   

    public N_doble getPrevio() {
        return previo;
    }

    public void setPrevio(N_doble previo) {
        this.previo = previo;
    }
   
}
