/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.interfaces.PessoaFisica;
import java.util.ArrayList;


public class Aluno extends Pessoa implements PessoaFisica{
    private String matricula,cpf,rg;

    public Aluno(String nome, String cpf, String rg, String matricula){
        super(nome);
        this.cpf= cpf;
        this.rg=rg;
        this.matricula=matricula;
    }
    
    
    
    @Override
    public void setConta(ContaCorrente conta) {
        super.setConta(conta); 
    }

    @Override
    public ArrayList<ContaCorrente> getConta() {
        return super.getConta();
    }
    

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        this.rg = rg;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}

