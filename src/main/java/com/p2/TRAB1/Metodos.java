package com.p2.TRAB1;

import static com.p2.TRAB1.Principal.agencias;
import static com.p2.TRAB1.Principal.alunos;
import static com.p2.TRAB1.Principal.bancos;
import static com.p2.TRAB1.Principal.contas;
import static com.p2.TRAB1.Principal.coordenadores;
import static com.p2.TRAB1.Principal.cursos;
import static com.p2.TRAB1.Principal.diretores;
import static com.p2.TRAB1.Principal.disciplinas;
import static com.p2.TRAB1.Principal.faculdades;
import static com.p2.TRAB1.Principal.gerentes;
import static com.p2.TRAB1.Principal.pessoas;
import static com.p2.TRAB1.Principal.pessoasFisicas;
import static com.p2.TRAB1.Principal.presidentes;
import static com.p2.TRAB1.Principal.professores;
import static com.p2.TRAB1.Principal.secretariosAC;
import static com.p2.TRAB1.Principal.secretariosFN;
import com.p2.TRAB1.normais.Agencia;
import com.p2.TRAB1.normais.Aluno;
import com.p2.TRAB1.normais.Banco;
import com.p2.TRAB1.normais.ContaCorrente;
import com.p2.TRAB1.normais.Coordenador;
import com.p2.TRAB1.normais.Curso;
import com.p2.TRAB1.normais.Diretor;
import com.p2.TRAB1.normais.Disciplina;
import com.p2.TRAB1.normais.Faculdade;
import com.p2.TRAB1.normais.Gerente;
import com.p2.TRAB1.normais.Presidente;
import com.p2.TRAB1.normais.Professor;
import com.p2.TRAB1.normais.SecAcademica;
import com.p2.TRAB1.normais.SecFinanceira;
import java.util.Scanner;

/**
 *
 * @author Eu2020
 */
public class Metodos {
    static Scanner scan = new Scanner(System.in);

    public static void CriaCoord() {
        String n;
        String cpf;
        String rg;
        int cod;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,CPF,RG,CODIGO DIRETORIA");
        n = Principal.scan.next();
        cpf = Principal.scan.next();
        rg = Principal.scan.next();
        cod = Principal.scan.nextInt();
        Coordenador c = new Coordenador(rg, cpf, n, cod);
        Principal.coordenadores.add(c);
    }

    public static void CriaBanco() {
        String cnpj;
        String nomef;
        String nome;
        System.out.println("Digite os dados do Banco na ordem:CNPJ, NOME FANTASIA,NOME");
        cnpj = Principal.scan.next();
        nomef = Principal.scan.next();
        nome = Principal.scan.next();
        Banco b = new Banco(cnpj, nomef, nome);
        Principal.bancos[0] = b;
    }

    public static void CriaSecAC() {
        String n;
        String cpf;
        String rg;
        int cod,op,op1,op2;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,CPF,RG,CODIGO SECRETARIA");
        n = Principal.scan.next();
        cpf = Principal.scan.next();
        rg = Principal.scan.next();
        cod = Principal.scan.nextInt();
        SecAcademica sac = new SecAcademica(rg, cpf, n, cod);
        Principal.secretariosAC.add(sac);
        System.out.println("Deseja adicionar alunos a fila de atendimento:1.sim");
        op = scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
            System.out.println("Escolha o aluno:");
                for(int j=0;j<alunos.size();j++){
                    System.out.print(j+"."+alunos.get(j)+"|");
                }
                op2= scan.nextInt();
                sac.agendaAluno(alunos.get(op2));
            }
        }
    }

    public static void CriarDisciplina() {
        String nome;
        String sala;
        System.out.println("Digite os dados da Disciplina na ordem:NOME, SALA");
        nome = Principal.scan.next();
        sala = Principal.scan.next();
        Disciplina di = new Disciplina(nome, sala);
        Principal.disciplinas.add(di);
    }

    public static void CriaPresidente() {
        Presidente pr = new Presidente("-", "-", "-", 0);
        String n;
        String cpf;
        String rg;
        int cod;
        System.out.println("Digite as informacoes do Presidente na ordem:NOME,CPF,RG,CODIGO DIRETORIA");
        n = Principal.scan.next();
        pr.setNome(n);
        cpf = Principal.scan.next();
        pr.setCpf(cpf);
        rg = Principal.scan.next();
        pr.setRg(rg);
        cod = Principal.scan.nextInt();
        pr.setCodDIR(cod);
        Principal.presidentes.add(pr);
    }

    public static void CriaPessoa() {
        Aluno a = new Aluno("-", "-", "-", "-");
        String n;
        String cpf;
        String rg;
        String matri;
        System.out.println("Digite as informacoes do Aluno na ordem:NOME,CPF,RG,MATRICULA");
        n = Principal.scan.next();
        a.setNome(n);
        cpf = Principal.scan.next();
        a.setCpf(cpf);
        rg = Principal.scan.next();
        a.setRg(rg);
        matri = Principal.scan.next();
        a.setMatricula(matri);
        Principal.alunos.add(a);
    }

    public static void CriaGerente() {
        String n;
        String cpf;
        String rg;
        String ctb;
        int cod,op,op1,op2, k=0;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,CPF,RG,CARTEIRA TRAB");
        n = Principal.scan.next();
        cpf = Principal.scan.next();
        rg = Principal.scan.next();
        ctb = Principal.scan.next();
        Gerente ger = new Gerente(rg, cpf, n, ctb);
        Principal.gerentes.add(ger);
        System.out.println("Deseja adicionar alguem a fila de atendimento:1.sim");
        op= scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha a pessoa:");
                for(int j=0; j<pessoas.size();j++){
                    System.out.print(j+".("+pessoas.get(i).getNome()+")|");
                }
                op2=scan.nextInt();
                ger.addFila(pessoas.get(op2));
            }
        }
    }

    

    public static void CriaConta() {
        String cod;
        double saldo;
        int escolha;
        System.out.println("Digite os dados da Conta na ordem:SALDO,CODIGO CONTA");
        saldo = Principal.scan.nextDouble();
        cod = Principal.scan.next();
        System.out.println("adicione um gerente:");
        for (int i = 0; i < Principal.gerentes.size(); i++) {
            System.out.print(Principal.gerentes.get(i) + Principal.gerentes.get(i).getNome() + "|");
        }
        escolha = Principal.scan.nextInt();
        System.out.println("O titular foi definido como padrao, associe um titular apos a criacao!");
        ContaCorrente cc = new ContaCorrente(cod, Principal.professores.get(0), Principal.gerentes.get(escolha), saldo);
        Principal.contas.add(cc);
    }

    public static void CriaAgencia() {
        String nome;
        String cod;
        System.out.println("Digite os dados da Agencia na ordem: NOME, CODIGO AGENCIA");
        nome = Principal.scan.next();
        cod = Principal.scan.next();
        Agencia a = new Agencia(nome, cod);
        Principal.agencias.add(a);
    }

    public static void CriaSecFN() {
        String n;
        String cpf;
        String rg;
        int cod,op,op1,op2, k=0;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,CPF,RG,CODIGO SECRETARIA");
        n = Principal.scan.next();
        cpf = Principal.scan.next();
        rg = Principal.scan.next();
        cod = Principal.scan.nextInt();
        SecFinanceira sfn = new SecFinanceira(rg, cpf, n, cod);
        Principal.secretariosFN.add(sfn);
        System.out.println("Deseja adicionar alguem a fila de atendimento:1.sim");
        op= scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha pelo CPF:");
                for(int j=0; j<pessoasFisicas.size();j++){
                    System.out.print(j+".("+pessoasFisicas.get(i).getCpf()+")|");
                }
                op2=scan.nextInt();
                sfn.addFila(pessoasFisicas.get(op2));
            }
        }
    }

    public static void CriaDiretor() {
        String n;
        String cpf;
        String rg;
        int cod;
        System.out.println("Digite as informacoes do Diretor na ordem:NOME,CPF,RG,CODIGO DIRETORIA");
        n = Principal.scan.next();
        cpf = Principal.scan.next();
        rg = Principal.scan.next();
        cod = Principal.scan.nextInt();
        Diretor d = new Diretor(rg, cpf, n, cod);
        Principal.diretores.add(d);
    }

    public static void CriarCurso() {
        String nome;
        String cod;
        System.out.println("Digite os dados do Curso na ordem: NOME, CODIGO CURSO");
        nome = Principal.scan.next();
        cod = Principal.scan.next();
        System.out.println("O coordenador e a disciplina do curso foram definidos como padrao, associe outros apos a criacao!");
        Curso c = new Curso(nome, cod, Principal.coordenadores.get(0));
        Principal.cursos.add(c);
    }

    public static void CriaProfessor() {
        Professor p = new Professor("-", "-", "-", "-");
        int op,op1,op2;
        String n;
        String cpf;
        String rg;
        String matri;
        System.out.println("Digite as informacoes do Professor na ordem:NOME,CPF,RG,MATRICULA");
        n = Principal.scan.next();
        p.setNome(n);
        cpf = Principal.scan.next();
        p.setCpf(cpf);
        rg = Principal.scan.next();
        p.setRg(rg);
        matri = Principal.scan.next();
        p.setMatricula(matri);
        Principal.professores.add(p);
        System.out.println("Deseja colocar algum aluno na fila de atendimento?1.sim");
        op = scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha o aluno:");
                for(int j=0;j<alunos.size();j++){
                    System.out.print(j+"."+alunos.get(j)+"|");
                }
                op2= scan.nextInt();
                p.agendaAluno(alunos.get(op2));
            }
        }
    }

    public static void CriaFaculdade() {
        String cnpj;
        String nomef;
        String nome;
        System.out.println("Digite as informacoes do Faculdade na ordem:NOME,NOME FANTASIA,CNPJ");
        nome = Principal.scan.next();
        nomef = Principal.scan.next();
        cnpj = Principal.scan.next();
        Faculdade facul = new Faculdade(cnpj, nomef, nome);
        Principal.faculdades[0] = facul;
    }
    
    public static void AssFaculdade() {
        int escolha1;
        int escolhaC;
        int escolhaD;
        int escolhaCO;
        int escolhaSA;
        int escolhaSF;
        int x;
        System.out.println("o que deseja associar:1.Curso|2.Diretor|3.Coordenador|4.Secretario");
        escolha1 = Principal.scan.nextInt();
        switch (escolha1) {
            case 1:
            {
                System.out.println("escolha o curso:");
                for (int i = 0; i < Principal.cursos.size(); i++) {
                    System.out.print(i + "." + Principal.cursos.get(i).getNome() + "|");
                }
                escolhaC = Principal.scan.nextInt();
                Principal.faculdades[0].setCursos(Principal.cursos.get(escolhaC));
                break;
            }
            case 2:
            {
                System.out.println("escolha o diretor:");
                for (int i = 0; i < Principal.diretores.size(); i++) {
                    System.out.print(i + "." + Principal.diretores.get(i).getNome() + "|");
                }
                escolhaD = Principal.scan.nextInt();
                Principal.faculdades[0].setDiretor(Principal.diretores.get(escolhaD));
                break;
            }
            case 3:
            {
                System.out.println("escolha o coordenador:");
                for (int i = 0; i < Principal.coordenadores.size(); i++) {
                    System.out.print(i + "." + Principal.coordenadores.get(i).getNome() + "|");
                }
                escolhaCO = Principal.scan.nextInt();
                Principal.faculdades[0].setCoordenadores(Principal.coordenadores.get(escolhaCO));
                break;
            }
            case 4:
            {
                System.out.println("digite o tipo de secretario:1.academico ou 2.financeiro");
                x = Principal.scan.nextInt();
                if (x == 1) {
                    System.out.println("escolha o secAcademico:");
                    for (int i = 0; i < Principal.secretariosAC.size(); i++) {
                        System.out.print(i + "." + Principal.secretariosAC.get(i).getNome() + "|");
                    }
                    escolhaSA = Principal.scan.nextInt();
                    Principal.faculdades[0].setSecretariosAM(Principal.secretariosAC.get(escolhaSA));
                } else {
                    System.out.println("escolha o secFinanceiro:");
                    for (int i = 0; i < Principal.secretariosFN.size(); i++) {
                        System.out.print(i + "." + Principal.secretariosFN.get(i).getNome() + "|");
                    }
                    escolhaSF = Principal.scan.nextInt();
                    Principal.faculdades[0].setSecretariosFN(Principal.secretariosFN.get(escolhaSF));
                }
                break;
            }
            default:
                System.out.println("Opcao invalida!");
        }
    }
    
    public static void AssCurso(){
        int cursoEscolhido,escolha1,escolha2,escolha3;
        
        System.out.println("em qual o curso:");
        for(int i=0;i<cursos.size();i++){
            System.out.print(i+"."+cursos.get(i).getNome());
        }
        cursoEscolhido= scan.nextInt();
        
        System.out.println("O que deseja associar:1.Disciplinas|2.Coordenador");
        escolha1= scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                System.out.println("Escolha as disciplinas:");
                for(int i=0;i<disciplinas.size();i++){
                    System.out.print(i+"."+disciplinas.get(i).getNome()+"|");
                }
                escolha2=scan.nextInt();
                cursos.get(cursoEscolhido).addDisciplina(disciplinas.get(escolha2));
                break;
            }
            case 2:
            {
                System.out.println("Escolha o coordenador:");
                for(int i=0;i<coordenadores.size();i++){
                    System.out.print(i+"."+coordenadores.get(i).getNome()+"|");
                }
                escolha3= scan.nextInt();
                cursos.get(cursoEscolhido).setCoordenador(coordenadores.get(escolha3));
                break;
            }
            default: System.out.println("opcao invalida!");
        }
    }
    
    public static void AssDisciplina() throws Exception{
        int disEscolhida,escolha1,escolha2,escolha3;
        
        System.out.println("em qual o Disciplina:");
        for(int i=0;i<disciplinas.size();i++){
            System.out.print(i+"."+disciplinas.get(i).getNome()+"|");
        }
        disEscolhida= scan.nextInt();
        System.out.println("O que deseja associar:1.Professor|2.Aluno");
        escolha1 = scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                System.out.println("Escolha o professor:");
                for(int i=0;i<professores.size();i++){
                    System.out.print(i+"."+professores.get(i)+"|");
                }
                escolha2= scan.nextInt();
                disciplinas.get(disEscolhida).setProfessor(professores.get(escolha2));
                break;
            }
            case 2:
            {
                System.out.println("Escolha o Aluno:");
                for(int i=0;i<alunos.size();i++){
                    System.out.print(i+"."+alunos.get(i)+"|");
                }
                escolha3= scan.nextInt();
                disciplinas.get(disEscolhida).addAluno(alunos.get(escolha3));
                break;
            }
            default: System.out.println("opcao invalida!");
        }
    }
    
    public static void AssAgencia(){
        int ageEscolhida,escolha1,escolha2;
        
        System.out.println("Em qual agencia:");
        for(int i=0;i<agencias.size();i++){
            System.out.print(i+"."+agencias.get(i)+"|");
        }
        ageEscolhida= scan.nextInt();
        
        System.out.println("O que deseja associar:1.Banco|2.Conta ");
        escolha1= scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                agencias.get(ageEscolhida).setBanco(bancos[0]);
                break;
            }
            case 2:
            {
                System.out.println("Escolha a conta:");
                for(int i=0;i<contas.size();i++){
                    System.out.print(i+"."+contas.get(i)+"|");
                }
                escolha2= scan.nextInt();
                agencias.get(ageEscolhida).addContas(contas.get(escolha2));
                break;
            }
            default: System.out.println("Opcao invalida!");
        }
    }
    
    public static void assConta(){
        int contaEscolhida,escolha1,escolha2,escolha3,escolha4;
        int alun,prof,pres,dir,ger,coor,secAC,secFN;
        
        System.out.println("Em qual conta:");
        for(int i=0;i<contas.size();i++){
            System.out.print(i+"."+contas.get(i)+"|");
        }
        contaEscolhida= scan.nextInt();
        
        System.out.println("o que desja associar:1.Titular|2.Agencia|3.Gerente");
        escolha1= scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                System.out.println("escolha o tipo de titular:"
                        + "1.aluno,2.professor,3.presidente,4.diretor,"
                        + "5.gerente,6.coordenador,7.secAcademico,"
                        + "8.secFinanceiro");
                escolha2= scan.nextInt();
                switch(escolha2){
                    case 1:
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<alunos.size();i++){
                            System.out.print(i+"."+alunos.get(i)+"|");
                        }
                        alun= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(alunos.get(alun));
                        break;
                    case 2:
                        System.out.println("Escolha o professor:");
                        for(int i=0;i<professores.size();i++){
                            System.out.print(i+"."+professores.get(i)+"|");
                        }
                        prof= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(professores.get(prof));
                        break;
                    case 3:
                        System.out.println("Escolha o presidente:");
                        for(int i=0;i<presidentes.size();i++){
                            System.out.print(i+"."+presidentes.get(i)+"|");
                        }
                        pres= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(presidentes.get(pres));
                        break;
                    case 4:
                        System.out.println("Escolha o diretor:");
                        for(int i=0;i<diretores.size();i++){
                            System.out.print(i+"."+diretores.get(i)+"|");
                        }
                        dir= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(diretores.get(dir));
                        break;
                    case 5:
                        System.out.println("Escolha o gerente:");
                        for(int i=0;i<gerentes.size();i++){
                            System.out.print(i+"."+gerentes.get(i)+"|");
                        }
                        ger= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(gerentes.get(ger));
                        break;
                    case 6:
                        System.out.println("Escolha o coordenador:");
                        for(int i=0;i<coordenadores.size();i++){
                            System.out.print(i+"."+coordenadores.get(i)+"|");
                        }
                        coor= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(coordenadores.get(coor));
                        break;
                    case 7:
                        System.out.println("Escolha o secretario Academico:");
                        for(int i=0;i<secretariosAC.size();i++){
                            System.out.print(i+"."+secretariosAC.get(i)+"|");
                        }
                        secAC= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(secretariosAC.get(secAC));
                        break;
                    case 8:
                       System.out.println("Escolha o secretario Financeiro:");
                       for(int i=0;i<secretariosFN.size();i++){
                            System.out.print(i+"."+secretariosFN.get(i)+"|");
                        }
                        secFN= scan.nextInt();
                        contas.get(contaEscolhida).setTitular(secretariosFN.get(secFN));
                        break;
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 2:
            {
                System.out.println("Escolha a agencia:");
                for(int i=0;i<agencias.size();i++){
                    System.out.print(i+"."+agencias.get(i)+"|");
                }
                escolha3= scan.nextInt();
                contas.get(contaEscolhida).setAgencia(agencias.get(escolha3));
                break;
            }
            case 3:
            {
                System.out.println("Escolha o gerente:");
                for(int i=0;i<gerentes.size();i++){
                    System.out.print(i+"."+gerentes.get(i)+"|");
                }
                escolha4= scan.nextInt();
                contas.get(contaEscolhida).setGerente(gerentes.get(escolha4));
                break;
            }
        }
    }
    
    public static void assBancos(){
        int escolha;
        
        System.out.println("Escolha a agencia:");
        for(int i=0;i<agencias.size();i++){
            System.out.print(i+"."+agencias.get(i)+"|");
        }
        escolha= scan.nextInt();
        bancos[0].setAgencia(agencias.get(escolha));    
    }
    
    public static void Manipular() throws Exception{
        int escolha,escolha1;
        int op1,op1C,op1V;
        int op2,op2C,op2V;
        int op3,op3C,op3V;
        int op4,op4C,op4V;
        int op5,op5C,op5V;
        int op6,op6C,op6V;
        int op7,op7C,op7V;
        int op8,op8C,op8V;
        int esc1,escP,SA,SF,G;
        
        System.out.println("Deseja:1.Sacar|2.Depositar|3.Atender");
        escolha= scan.nextInt();
        
        switch(escolha){
            case 1:
            {
                System.out.println("Escolha o tipo de pessoa:");
                System.out.println("1.aluno,2.professor,3.presidente,4.diretor,"
                                + "5.gerente,6.coordenador,7.secAcademico,"
                                + "8.secFinanceiro");   
                escolha1=scan.nextInt();
            
            switch(escolha1){
                case 1:
                {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<alunos.size();i++){
                            System.out.print(i+"."+alunos.get(i)+"|");
                        }
                        op1= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op1C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op1V= scan.nextInt();
                        
                        alunos.get(op1).getConta().get(op1C).sacar(op1V);
                        break;
                }
                    case 2:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<professores.size();i++){
                            System.out.print(i+"."+professores.get(i)+"|");
                        }
                        op2= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op2C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op2V= scan.nextInt();
                        
                        professores.get(op2).getConta().get(op2C).sacar(op2V);
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<presidentes.size();i++){
                            System.out.print(i+"."+presidentes.get(i)+"|");
                        }
                        op3= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op3C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op3V= scan.nextInt();
                        
                        presidentes.get(op3).getConta().get(op3C).sacar(op3V);
                        
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<diretores.size();i++){
                            System.out.print(i+"."+diretores.get(i)+"|");
                        }
                        op4= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op4C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op4V= scan.nextInt();
                        
                        diretores.get(op4).getConta().get(op4C).sacar(op4V);
                        
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<gerentes.size();i++){
                            System.out.print(i+"."+gerentes.get(i)+"|");
                        }
                        op5= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op5C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op5V= scan.nextInt();
                        
                        gerentes.get(op5).getConta().get(op5C).sacar(op5V);
                        
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<coordenadores.size();i++){
                            System.out.print(i+"."+coordenadores.get(i)+"|");
                        }
                        op6= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op6C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op6V= scan.nextInt();
                        
                        coordenadores.get(op6).getConta().get(op6C).sacar(op6V);
                        
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<secretariosAC.size();i++){
                            System.out.print(i+"."+secretariosAC.get(i)+"|");
                        }
                        op7= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op7C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op7V= scan.nextInt();
                        
                        secretariosAC.get(op7).getConta().get(op7C).sacar(op7V);
                        
                        break;
                    }
                    case 8:
                    {
                       System.out.println("Escolha o aluno:");
                        for(int i=0;i<secretariosFN.size();i++){
                            System.out.print(i+"."+secretariosFN.get(i)+"|");
                        }
                        op8= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op8C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op8V= scan.nextInt();
                        
                        secretariosFN.get(op8).getConta().get(op8C).sacar(op8V);
                        
                        break;
                    }
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 2:
            {
                System.out.println("Escolha o tipo de pessoa:");
                System.out.println("1.aluno,2.professor,3.presidente,4.diretor,"
                            + "5.gerente,6.coordenador,7.secAcademico,"
                            + "8.secFinanceiro");   
            escolha1=scan.nextInt();
            
            switch(escolha1){
                case 1:
                {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<alunos.size();i++){
                            System.out.print(i+"."+alunos.get(i)+"|");
                        }
                        op1= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op1C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op1V= scan.nextInt();
                        
                        alunos.get(op1).getConta().get(op1C).depositar(op1V);
                        break;
                        
                }
                    case 2:
                    {
                        System.out.println("Escolha o Profesor:");
                        for(int i=0;i<professores.size();i++){
                            System.out.print(i+"."+professores.get(i)+"|");
                        }
                        op2= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op2C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op2V= scan.nextInt();
                        
                        professores.get(op2).getConta().get(op2C).depositar(op2V);
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Escolha o Presidente:");
                        for(int i=0;i<presidentes.size();i++){
                            System.out.print(i+"."+presidentes.get(i)+"|");
                        }
                        op3= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op3C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op3V= scan.nextInt();
                        
                        presidentes.get(op3).getConta().get(op3C).depositar(op3V);
                        
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Escolha o Diretor:");
                        for(int i=0;i<diretores.size();i++){
                            System.out.print(i+"."+diretores.get(i)+"|");
                        }
                        op4= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op4C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op4V= scan.nextInt();
                        
                        diretores.get(op4).getConta().get(op4C).depositar(op4V);
                        
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Escolha o Gerente:");
                        for(int i=0;i<gerentes.size();i++){
                            System.out.print(i+"."+gerentes.get(i)+"|");
                        }
                        op5= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op5C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op5V= scan.nextInt();
                        
                        gerentes.get(op5).getConta().get(op5C).depositar(op5V);
                        
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Escolha o Coordenador:");
                        for(int i=0;i<coordenadores.size();i++){
                            System.out.print(i+"."+coordenadores.get(i)+"|");
                        }
                        op6= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op6C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op6V= scan.nextInt();
                        
                        coordenadores.get(op6).getConta().get(op6C).depositar(op6V);
                        
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Escolha o Secretario Acad:");
                        for(int i=0;i<secretariosAC.size();i++){
                            System.out.print(i+"."+secretariosAC.get(i)+"|");
                        }
                        op7= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op7C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op7V= scan.nextInt();
                        
                        secretariosAC.get(op7).getConta().get(op7C).depositar(op7V);
                        
                        break;
                    }
                    case 8:
                    {
                       System.out.println("Escolha o Secretario finan:");
                        for(int i=0;i<secretariosFN.size();i++){
                            System.out.print(i+"."+secretariosFN.get(i)+"|");
                        }
                        op8= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<contas.size();i++){
                            System.out.print(i+"."+contas.get(i)+"|");
                        }
                        op8C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op8V= scan.nextInt();
                        
                        secretariosFN.get(op8).getConta().get(op8C).depositar(op8V);
                        
                        break;
                    }
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 3:
            {
                System.out.println("De quem sera atendido:");
                System.out.println("1.Professor|2.Secretario AC|3.Secretario FN|4. Gerente");
                esc1= scan.nextInt();
                switch(esc1){
                    case 1:
                    {
                        System.out.println("Escolha o Profesor:");
                        for(int i=0;i<professores.size();i++){
                            System.out.print(i+"."+professores.get(i)+"|");
                        }
                        escP= scan.nextInt();
                        professores.get(escP).atendeAluno();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Escolha o Secretario Acad:");
                        for(int i=0;i<secretariosAC.size();i++){
                            System.out.print(i+"."+secretariosAC.get(i)+"|");
                        }
                        SA= scan.nextInt();
                        secretariosAC.get(SA).atendeAluno();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Escolha o Secretario finan:");
                        for(int i=0;i<secretariosFN.size();i++){
                            System.out.print(i+"."+secretariosFN.get(i)+"|");
                        }
                        SF= scan.nextInt();
                        secretariosFN.get(SF).removeFila();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Escolha o Gerente:");
                        for(int i=0;i<gerentes.size();i++){
                            System.out.print(i+"."+gerentes.get(i)+"|");
                        }
                        G= scan.nextInt();
                        gerentes.get(G).atendeFila();
                        break;
                    }
                }
                break;
            }
        }     
    }
}
