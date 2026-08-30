/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapeu_seletor;

/**
 *
 * @author guime
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    
    System.out.print("Deseja iniciar a selecao? (sim/nao): ");
    String resposta = entrada.next();
    while (resposta.equalsIgnoreCase("sim")) {
        Aluno aluno = new Aluno();   
        System.out.print("Nome do aluno: ");
        aluno.setNome(entrada.next());

        System.out.print("Idade: ");
        aluno.setIdade(entrada.nextInt());

        System.out.println("Insira os atributos magicos (ex: de 0 a 100)");
            
        System.out.print("Coragem: ");
        aluno.setCoragem(entrada.nextInt());

        System.out.print("Inteligencia: ");
        aluno.setInteligencia(entrada.nextInt());

        System.out.print("Ambicao: ");
        aluno.setAmbicao(entrada.nextInt());

        System.out.print("Lealdade: ");
        aluno.setLealdade(entrada.nextInt());

        System.out.print("Estrategia: ");
        aluno.setEstrategia(entrada.nextInt());

        System.out.print("Criatividade: ");
        aluno.setCriatividade(entrada.nextInt());
         
        aluno.calcularCasa();
        aluno.exibirInformacoes();

        
        System.out.print("\nDeseja classificar outro aluno? (sim/nao): ");
        resposta = entrada.next();
        }
        System.out.print("Sessao encerrada.");
    }   
}
