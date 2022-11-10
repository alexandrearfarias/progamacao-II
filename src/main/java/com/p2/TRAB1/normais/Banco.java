package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Empresa;
import java.util.ArrayList;


public class Banco extends Empresa {
    private Agencia agencia;

    public Banco(String cnpj, String nomef, String nome) {
        super(cnpj, nomef, nome);
    }
    
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    @Override
    public void setNomef(String nomef) {
        super.setNomef(nomef); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomef() {
        return super.getNomef(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCnpj(String cnpj) {
        super.setCnpj(cnpj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCnpj() {
        return super.getCnpj(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
    public String toString() {
        return this.nomef;
    }
    
}
