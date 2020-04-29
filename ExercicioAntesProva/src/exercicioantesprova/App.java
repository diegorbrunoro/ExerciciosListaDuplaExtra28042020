/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioantesprova;

import java.util.Scanner;

/**
 *
 * @author diegorbrunoro
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=0;
        
        Scanner l = new Scanner(System.in);
        
        ListaDupla Ld = new ListaDupla();
        
        for(i=0;i<10;i++){
        
        int valor = l.nextInt();
        
        if (valor >0){
            Ld.insereInicio(valor);
        }
        else
        {
            Ld.insereFim(valor);
        }
        
        }
        
      /*  Nodo nodoAux =prim;
        
        while (nodoAux.next!=null){
            if(nodoAux.dado>60){
                cont++;
            }
            nodoAux=nodoAux.next;
        }
        */
      Ld.mostraLista();
        
        
    }
    
}
