package com.p2.Exercicios;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Alexandre Farias:201903058945
 */
public class AtvCollections{
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList();
        
        lista.add("F");
        lista.add("E");
        lista.add("I");
        lista.add("T");
        lista.add("O");
        
        //Questao 2
        System.out.println(lista);
        
        //Questao 6
        lista.remove(2);
        System.out.println(lista);
        
        //Questao 10
        Collections.shuffle(lista);
        System.out.println(lista);
        
        //Questao 14
        Collections.swap(lista, 0, 2);
        System.out.println(lista);
        
        //Questao 18
        if(lista.isEmpty()){
            System.out.println("A lista esta vazia");
        } else {
            System.out.println("A lista nao esta vazia");
        }
        
        //Questao 22
        for(int i=0;i<lista.size(); i++){
            System.out.println(i+": "+lista.get(i));
        }
    }    
}
