/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.abstratas;

import com.p2.TRAB1.interfaces.PessoaJuridica;



public abstract class Empresa extends Pessoa implements PessoaJuridica {
    protected String cnpj,nomef;

    public Empresa(String cnpj, String nomef, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.nomef = nomef;
    }
    
    @Override
    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void setCnpj(String cnpj) {
        this.cnpj= cnpj;
    }

    @Override
    public String getNomef() {
        return nomef;
    }

    @Override
    public void setNomef(String nomef) {
        this.nomef=nomef;
    }
    
}

