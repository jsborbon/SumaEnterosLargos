/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.L_doble;
import modelo.N_doble;


/**
 * Clase que toma los numeros, los divide entre nodos, crea las listas y realiza la operación.
 * @author santi
 */

public class Controlador {

    L_doble ld1 = new L_doble();
    L_doble ld2 = new L_doble();
    L_doble ld3 = new L_doble();

    String numA;
    String numB;
    String total;

    public Controlador() {
        this.numA = "";
        this.numB = "";
        this.total = "";
    }

    public String getNumA() {
        return numA;
    }

    public void setNumA(String numA) {
        this.numA = numA;
    }

    public String getNumB() {
        return numB;
    }

    public void setNumB(String numB) {
        this.numB = numB;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void sumar() {
        crearNodos();
        realizarOperacion();
    }

    private void crearNodos() {

        igualarLongitudCadenas();
        String A;
        String B;

        //Colocamos los numeros en una lista de 4 en 4 digitos (de derecha a izquierda)
        //1° Numero
        while (numA.length() != 0) {
            if (numA.length() >= 4) {
                A = numA.substring(numA.length() - 4, numA.length());
                numA = numA.substring(0, numA.length() - 4);

            } else {
                A = numA;
                numA = "";

            }
            ld1.crear_Nodo(A);

        }

        while (numB.length() != 0) {
            if (numB.length() >= 4) {
                B = numB.substring(numB.length() - 4, numB.length());
                numB = numB.substring(0, numB.length() - 4);

            } else {
                B = numB;
                numB = "";

            }
            
            ld2.crear_Nodo(B);

        }

    }

    private void realizarOperacion() {

        N_doble auxA = ld1.getCabeza();
        N_doble auxB = ld2.getCabeza();

        if (ld1.getSize() > ld2.getSize()) {

            ld3.sumar(auxA, auxB);

        } else {
            ld3.sumar(auxB, auxA);
        }
        N_doble aux = ld3.getCabeza();

        convertirListaAString(aux);

    }

    private void convertirListaAString(N_doble aux) {
        String total="";
        while (aux != null) {
            total = total + aux.getNumero();    //Toma nodo por nodo y lo anexa a un string
            aux = aux.getPrevio();

        }
        StringBuilder resultado = new StringBuilder(total);
        while(resultado.charAt(0)=='0') resultado=resultado.deleteCharAt(0); //Elimina los ceros a la izquierda
    
        
        total=String.valueOf(resultado);
        
        this.total=total;
        
    }

    private void igualarLongitudCadenas() {
        if (numA.length() > numB.length()) {
            int diferencia = numA.length() - numB.length();
            for (int i = 0; i < diferencia; i++) {
                numB = "0" + numB;
            }
        } else {
            int diferencia = (numB.length() - numA.length());
            for (int i = 0; i < diferencia; i++) {
                numA = "0" + numA;
            }
        }
    }

}
