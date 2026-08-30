/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classificacao_corporal;

import java.util.Scanner;

/**
 *
 * @author guime
 */
public class Pratica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Pessoa usuario = new Pessoa();
       
       System.out.println("Indique o nome: ");
       String nomeLido = entrada.nextLine();
       usuario.setNome(nomeLido);
       
       System.out.println("Indique o sobrenome: ");
       String sobrenomeLido = entrada.nextLine();
       usuario.setSobrenome(sobrenomeLido);
       
       System.out.println("Indique a idade: ");
       int idadeLida = entrada.nextInt();
       usuario.setIdade(idadeLida);
       
       System.out.println("Indique a altura(ex:1.76): ");
       double alturaLida = entrada.nextDouble();
       usuario.setAltura(alturaLida);
       
       System.out.println("Indique o peso(ex:65.3): ");
       double pesoLido = entrada.nextDouble();
       usuario.setPeso(pesoLido);
       
       double imc = usuario.CalcularIMC(pesoLido,alturaLida);
       System.out.println("Ola " + nomeLido + " " + sobrenomeLido + " , " + "o valor do seu  IMC esta em: " + imc);
       System.out.printf("Seu nivel de peso esta em: " + usuario.InformaObesidade(imc));
    }
    
}
