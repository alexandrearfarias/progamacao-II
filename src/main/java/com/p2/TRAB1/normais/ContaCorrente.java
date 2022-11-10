package com.p2.TRAB1.normais;

import com.p2.TRAB1.exceçoes.SaldoInsuficiente;
import com.p2.TRAB1.interfaces.Conta;


public class ContaCorrente<T> implements Conta{
    private String codCC;
    private T titular;
    private Gerente gerente;
    private double saldo;
    private Agencia agencia;

    public ContaCorrente(String codCC, T titular, Gerente gerente, double saldo) {
        this.codCC = codCC;
        this.titular = titular;
        this.gerente = gerente;
        this.saldo = saldo;
    }

    

    public String getCodCC() {
        return codCC;
    }

    public void setCodCC(String codCC) {
        this.codCC = codCC;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    
    public T getTitular() {
        return titular;
    }

    public void setTitular(T titular) {
        this.titular = titular;
    }
    
    public String getAgencia() {
        return agencia.getCodAgencia();
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    
    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(saldo < valor){
            throw new SaldoInsuficiente(saldo);
        }
        else
            System.out.println("saque realizado com sucesso!");
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getCodConta() {
        return codCC;
    }

    @Override
    public void setCodConta(String codC) {
        this.codCC= codC;
    }

    @Override
    public String toString() {
        return this.codCC;
    }
    
}

