package com.p2.TRAB1.normais;

import com.p2.TRAB1.Fila;
import com.p2.TRAB1.abstratas.Funcionario;
import com.p2.TRAB1.abstratas.Pessoa;
import java.util.ArrayList;


public class Gerente extends Funcionario {
    private String carteiraTRB;
    private Fila<Pessoa> fila= new Fila();
    
    
    public Gerente(String rg, String cpf, String nome, String trb) {
        super(rg, cpf, nome);
        this.carteiraTRB= trb;
    }

    public String getCarteiraTRB() {
        return carteiraTRB;
    }

    public void setCarteiraTRB(String carteiraTRB) {
        this.carteiraTRB = carteiraTRB;
    }

    public Fila<Pessoa> getFila() {
        return fila;
    }
    
    public void addFila(Pessoa p){
        fila.enfileirar(p);
    }
    public void atendeFila(){
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
    
}

