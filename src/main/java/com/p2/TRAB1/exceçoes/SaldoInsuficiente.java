/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.exceçoes;

/**
 *
 * @author Eu2020
 */
public class SaldoInsuficiente extends Exception {
        private final double valor;
        
        public SaldoInsuficiente(double valor){
            this.valor= valor;
            System.out.println("Valor muito alto para saque!, saldo atual:" +valor);
        }
        
        public double getValor(){
            return valor;
        }
}
