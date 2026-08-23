/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao07;

/**
 *
 * @author guime
 */
import java.util.Scanner;
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        double [] temperatura = new double[12];
        double maior = 0;
        double menor = 0;
        String mes_maior = "";
        String mes_menor = "";
        System.out.println("Escreva as temperaturas:");
        for(int i=0;i<12;i++){
            temperatura[i]=entrada.nextDouble();
            if(i==0){
                maior = temperatura[i];
                menor = temperatura[i];
                mes_maior = mes[i];
                mes_menor = mes[i];
            } else{    
                if (temperatura[i]>maior){
                    maior = temperatura[i];
                    mes_maior = mes[i];
                }
                if(temperatura[i]<menor){
                    menor = temperatura[i];
                    mes_menor = mes[i];
                } 
            }
        }
        System.out.println("Maior: "+ maior + " " + mes_maior);
        System.out.println("Menor: "+ menor + " " + mes_menor);
    }
}
