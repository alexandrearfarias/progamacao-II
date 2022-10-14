package com.p2.TRAB1;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.interfaces.PessoaFisica;
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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eu2020
 */
@Autores(Nome="Alexandre Farias,Jefferson, Diego Xavier",
         Matricula="201903058945,, 201808197372")
public class Principal {
    static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList();
    static ArrayList<Pessoa> pessoas = new ArrayList();
    
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Aluno> alunos = new ArrayList();
    static ArrayList<Professor> professores = new ArrayList();
    static ArrayList<Presidente> presidentes = new ArrayList();
    static ArrayList<Diretor> diretores = new ArrayList(); 
    static ArrayList<Coordenador> coordenadores = new ArrayList();
    static ArrayList<Gerente> gerentes = new ArrayList();
    static ArrayList<SecAcademica> secretariosAC = new ArrayList();
    static ArrayList<SecFinanceira> secretariosFN = new ArrayList();
    static Faculdade[] faculdades = new Faculdade[1];
    static ArrayList<Curso> cursos = new ArrayList();
    static ArrayList<Disciplina> disciplinas = new ArrayList();
    static Banco[] bancos= new Banco[1];
    static ArrayList<Agencia> agencias = new ArrayList();
    static ArrayList<ContaCorrente> contas= new ArrayList();
    
    @Observacoes(conteudo="Nao tente associar coisas que nao existe, instacie primeiro ou o programa vai dar erro")
    public static void main(String[] args) throws Exception {
        Professor p0 = new Professor("-","-","-","-");
        professores.add(p0);
        Coordenador c0 = new Coordenador("-", "-", "-", 0);
        coordenadores.add(c0);
        
        pessoasFisicas.addAll(alunos);
        pessoasFisicas.addAll(professores);
        pessoasFisicas.addAll(presidentes);
        pessoasFisicas.addAll(diretores);
        pessoasFisicas.addAll(coordenadores);
        pessoasFisicas.addAll(gerentes);
        pessoasFisicas.addAll(secretariosAC);
        pessoasFisicas.addAll(secretariosFN);
        
        
        String[] peoples = {"Aluno","Professor","Presidente","Diretor","Coordenador",
                            "SecAcademico","secFinanceiro","Gerente"};
        int opI,opF,opP,opB,opA,x;
        
        
        do{
        MenuCriacao();
        System.out.println("Escolha uma opcao:(0 para sair)");
        opI= scan.nextInt();
        
        switch(opI){
            case 1:
            {
                System.out.println("quantas pessoas deseja criar:");
                opP= scan.nextInt();
                
                System.out.println();
                
                for(int i=0; i<opP; i++ ){
                   System.out.print("Escolha um dos:");
                    for(int j=0;j<peoples.length;j++){
                        System.out.print(j+"."+peoples[j]+"|");
                    } 
                    x = scan.nextInt();
                    switch(x){
                        case 0:
                        {
                            Metodos.CriaPessoa();
                            System.out.println("Criado com sucesso");
                            break;
                        }   
                        case 1:
                        {
                            Metodos.CriaProfessor();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        case 2:
                        {
                            Metodos.CriaPresidente();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        case 3:
                        {
                            Metodos.CriaDiretor();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        case 4:
                        {
                            Metodos.CriaCoord();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        case 5:
                        {
                            Metodos.CriaSecAC();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        case 6:
                        {
                            Metodos.CriaSecFN();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        case 7:
                        {
                            Metodos.CriaGerente();
                            System.out.println("Criado com sucesso");
                            break;
                        }
                        default:
                           System.out.println("Opcao invalida");
                    
                    }
                }
                AtualizaPF();
                AtualizaP();
                break;
            }
            case 2:
            {
                System.out.print("Escolha um dos:1.Faculdade|2.Curso|3.Disciplina");
                opF= scan.nextInt();
                
                switch(opF){
                    case 1:
                    {
                        if(faculdades[0]!=null){
                            System.out.println("ja existe uma faculdade");
                        }else
                            Metodos.CriaFaculdade();
                        break;
                    }
                    case 2:
                    {
                        Metodos.CriarCurso();
                        break;
                    }
                    case 3:
                    {
                        Metodos.CriarDisciplina();
                        break;
                    }
                    default:
                        System.out.println("Opcao invalida");
                }
                break;
            }
            case 3:
            {
                System.out.println("Escolha um dos:0.Banco|1.Agencia|2.ContaCorrente");
                opB = scan.nextInt();
                
                switch(opB){
                    case 0:
                    {
                        if(bancos[0]!=null){
                            System.out.println("ja existe um banco");
                        }else
                            Metodos.CriaBanco();
                        break;
                    }
                    case 1: 
                    {
                        Metodos.CriaAgencia();
                        break;
                    }
                    case 2:
                    {
                        Metodos.CriaConta();
                        break;
                    }
                }
                break;
            }
            case 4:
            {
                MenuAssociacao();

                System.out.println("Escolha uma opcao:");
                opA= scan.nextInt();
                switch(opA){
                    case 1:
                    {
                        Metodos.AssFaculdade();
                        break;
                    }
                    case 2:
                    {
                        Metodos.AssCurso();
                        break;
                    }
                    case 3:
                    {
                        Metodos.AssDisciplina();
                        break;
                    }
                    case 4:
                    {
                        Metodos.AssAgencia();
                        break;
                    }
                    case 5:
                    {
                        Metodos.assConta();
                        break;
                    }
                    case 6:
                    {
                        Metodos.assBancos();
                        break;
                    }
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 5:
            {
                Metodos.Manipular();
                break;
            }
            default: System.out.println("Opcao invalida!");
        }   
    }while(opI!=0);
}
    
        public static void MenuCriacao(){
        System.out.println("""
                           ====== ABA DE CRIACAO ========
                           |1.Criar pessoas             |
                           |2.Criar faculdade           |
                           |3.Criar bancos              |
                           |4.Associar                  |
                           !5.Manipular                 |
                           ==============================
                           """);
        }
        
        public static void MenuAssociacao(){
            System.out.println("""
                               ========= ASSOCIAR EM: =========
                               |1.Faculdade        4.Agencia  |
                               |2.Curso            5.Conta    |
                               |3.Disciplina       6.Banco    |
                               ================================
                               """);
        }
    
        public static void AtualizaPF(){
        pessoasFisicas.addAll(alunos);
        pessoasFisicas.addAll(professores);
        pessoasFisicas.addAll(presidentes);
        pessoasFisicas.addAll(diretores);
        pessoasFisicas.addAll(coordenadores);
        pessoasFisicas.addAll(gerentes);
        pessoasFisicas.addAll(secretariosAC);
        pessoasFisicas.addAll(secretariosFN);
        }
        public static void AtualizaP(){
        pessoas.addAll(alunos);
        pessoas.addAll(professores);
        pessoas.addAll(presidentes);
        pessoas.addAll(diretores);
        pessoas.addAll(coordenadores);
        pessoas.addAll(gerentes);
        pessoas.addAll(secretariosAC);
        pessoas.addAll(secretariosFN);
        }
}