/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.abstratas;

import com.p2.TRAB1.normais.ContaCorrente;
import java.util.ArrayList;


public abstract class Pessoa {
    protected String nome;
    protected ArrayList<ContaCorrente> contas = new ArrayList();
    
    public Pessoa(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getConta() {
        return contas;
    }

    public void setConta(ContaCorrente conta) {
        contas.add(conta);
    }
    
}

