package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Funcionario;

import com.p2.TRAB1.interfaces.Diretoria;
import java.util.ArrayList;


public class Presidente extends Funcionario implements Diretoria{
    private int codDIR;
    
    public Presidente(String rg, String cpf, String nome, int cod) {
        super(rg, cpf, nome);
        this.codDIR=cod;
    }
    
    @Override
    public void setRg(String rg) {
        super.setRg(rg); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getRg() {
        return super.getRg(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCpf() {
        return super.getCpf(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setConta(ContaCorrente conta) {
        super.setConta(conta); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public ArrayList<ContaCorrente> getConta() {
        return super.getConta(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNome() {
        return super.getNome(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCodDIR() {
        return codDIR;
    }

    @Override
    public void setCodDIR(int num) {
        this.codDIR= num;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
