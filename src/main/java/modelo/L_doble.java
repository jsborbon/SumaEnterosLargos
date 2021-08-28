/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 * Clase que define la lista.
 * @author santi
 */

public class L_doble {
    
    N_doble cabeza;
    N_doble q;
    N_doble s;
    int size;
    
    //Constructor
    public L_doble(){
        cabeza=null;
        size=0;
    }
    
    public void crear_Nodo(String x){
        N_doble p = new N_doble(x);
        escribir_hacia_atras();
        if(s==null){
            cabeza=p;
        }
        else{
            s.setSiguiente(p);
            p.setPrevio(s);
        }
        size++;
        }
    
    //Recorre el numero de adelante hacia atras
    public void escribir_hacia_atras(){
        q=cabeza;
        s=null;
        while(q!=null){
            
            System.out.println(q.getNumero());
            s=q;
            q=q.getSiguiente();
        }
        System.out.println("");
        
    }
    
    //Recorre el numero atras hacia adelante
    void escribir_hacia_adelante(){
        escribir_hacia_atras();
        
        while(s!=null){
            
           System.out.println(s.getNumero());
           s=s.getPrevio();
           
    }
    }

    public N_doble getCabeza() {
        return cabeza;
    }

    public int getSize() {
        return size;
    }
    
    
    public void sumar(N_doble A, N_doble B){ //Recibe las cabezas de las dos listas
        int excedente=0;
        N_doble q=A;
        N_doble s =null;
        while(q!=null){
            
            int sumatoria = Integer.parseInt(A.getNumero())+Integer.parseInt(B.getNumero())+excedente;
            if(sumatoria>9999){
                excedente=sumatoria/10000;
                sumatoria=sumatoria-excedente*10000;
            }else{
                excedente=0;
            }
            String valor=String.valueOf(sumatoria);
            
            sumatoria=0;
            while(valor.length()!=4) valor="0"+valor;
             
            q.setNumero(valor); //asigna un nuevo valor al nodo
            A=A.getSiguiente(); //Avanza al siguiente nodo
            B=B.getSiguiente(); //Avanza al siguiente nodo
            s=q;                //Asigna un nuevo valor a una nueva lista
            q=q.getSiguiente(); //Avanza al siguiente nodo
        }
        cabeza=s;               //Asigna la lista a la lista principal
    }
    
}
