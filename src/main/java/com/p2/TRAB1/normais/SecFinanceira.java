package com.p2.TRAB1.normais;

import com.p2.TRAB1.Fila;
import com.p2.TRAB1.abstratas.Funcionario;
import com.p2.TRAB1.interfaces.PessoaFisica;
import com.p2.TRAB1.interfaces.Secretaria;
import java.util.ArrayList;



public class SecFinanceira extends Funcionario implements Secretaria {
    private int codSEC;
    private Fila<PessoaFisica> fila= new Fila();
    
    public SecFinanceira(String rg, String cpf, String nome,int cod) {
        super(rg, cpf, nome);
        this.codSEC= cod;
    }

    public Fila<PessoaFisica> getFila() {
        return fila;
    }
    public void addFila(PessoaFisica p){
        fila.enfileirar(p);
    }
    public void removeFila(){
        fila.encerrarAtendimento();
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
    public int getcodSEC() {
        return codSEC;
    }

    @Override
    public void setcodSEC(int num) {
        this.codSEC= num;
    }

}

