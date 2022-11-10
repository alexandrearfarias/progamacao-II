package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Empresa;
import java.util.ArrayList;


public class Faculdade extends Empresa{
    private final ArrayList<Curso> cursos = new ArrayList();
    private final ArrayList<Coordenador> coordenadores= new ArrayList();
    private final ArrayList<SecAcademica> secretariosAM= new ArrayList();
    private ArrayList<SecFinanceira> secretariosFN= new ArrayList();
    private Diretor diretor;

    public Faculdade(String cnpj, String nomef, String nome) {
        super(cnpj, nomef, nome);
    }

    public void setCursos(Curso curso) {
        cursos.add(curso);
    }

    public void setCoordenadores(Coordenador c) {
        coordenadores.add(c);
    }

    public void setSecretariosAM(SecAcademica a) {
        secretariosAM.add(a);
    }

    public void setSecretariosFN(SecFinanceira f) {
        secretariosFN.add(f);
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Coordenador> getCoordenadores() {
        return coordenadores;
    }

    public ArrayList<SecAcademica> getSecretariosAM() {
        return secretariosAM;
    }

    public ArrayList<SecFinanceira> getSecretariosFN() {
        return secretariosFN;
    }

    public Diretor getDiretor() {
        return diretor;
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

