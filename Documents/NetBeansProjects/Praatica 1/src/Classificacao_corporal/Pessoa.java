/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classificacao_corporal;

/**
 *
 * @author guime
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
    static double CalcularIMC(double peso,double altura){
        double imc = peso/(Math.pow(altura,2));
        return Math.round(imc * 100.0) / 100.0;
    }
    static String InformaObesidade(double imc){
        String status = "";
        if (imc < 18.5){
            status = "Abaixo do peso";
        } else if(imc > 18.5 && imc < 24.9){
            status = "Peso normal";
        } else if(imc >= 25 && imc < 29.9){
            status = "Sobrepeso";
        } else if(imc >=30 && imc < 34.9){
            status = "Obesidade grau 1";
        } else if(imc >=35 && imc < 39.9){
            status = "Obesidaade grau 2";
        } else{
            status = "Obesidade grau 3";
        }
        return status;
    }
}
