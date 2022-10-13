/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.abstratas;

import com.p2.TRAB1.interfaces.PessoaFisica;



public abstract class Funcionario extends Pessoa implements PessoaFisica {
    protected String rg,cpf;

    public Funcionario(String rg, String cpf, String nome) {
        super(nome);
        this.rg = rg;
        this.cpf = cpf;
    }
    
    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf= cpf;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public void setRg(String rg) {
        this.rg= rg;
    }
    
}

