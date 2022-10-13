/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.normais;

import com.p2.TRAB1.Fila;
import com.p2.TRAB1.abstratas.Funcionario;
import java.util.ArrayList;


public class Professor extends Funcionario {
    private String matricula;
    private Fila<Aluno> fila= new Fila();

    public Professor(String matricula, String rg, String cpf, String nome) {
        super(rg, cpf, nome);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void agendaAluno(Aluno a) {
        fila.enfileirar(a);
    }
    public void atendeAluno(){
        fila.encerrarAtendimento();
    }
    

    public Fila<Aluno> getFila() {
        return fila;
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

