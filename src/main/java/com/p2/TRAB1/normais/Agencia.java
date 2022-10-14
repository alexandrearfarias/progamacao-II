package com.p2.TRAB1.normais;

import java.util.ArrayList;

public class Agencia {
    private String nomeAgencia;
    private String codAgencia;
    private Banco banco;
    private final ArrayList<ContaCorrente> contas = new ArrayList();

    public Agencia(String nomeAgencia, String codAgencia) {
        this.nomeAgencia = nomeAgencia;
        this.codAgencia = codAgencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(String codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getContas() {
        return contas.toString();
    }
    
    public void addContas(ContaCorrente c){
        contas.add(c);
    }
}
