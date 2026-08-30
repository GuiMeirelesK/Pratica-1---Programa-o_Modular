/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapeu_seletor;

/**
 *
 * @author guime
 */
public class Aluno {
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;
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
     * @return the coragem
     */
    public int getCoragem() {
        return coragem;
    }

    /**
     * @param coragem the coragem to set
     */
    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    /**
     * @return the inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @param inteligencia the inteligencia to set
     */
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * @return the ambicao
     */
    public int getAmbicao() {
        return ambicao;
    }

    /**
     * @param ambicao the ambicao to set
     */
    public void setAmbicao(int ambicao) {
        this.ambicao = ambicao;
    }

    /**
     * @return the lealdade
     */
    public int getLealdade() {
        return lealdade;
    }

    /**
     * @param lealdade the lealdade to set
     */
    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }

    /**
     * @return the estrategia
     */
    public int getEstrategia() {
        return estrategia;
    }

    /**
     * @param estrategia the estrategia to set
     */
    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * @return the criatividade
     */
    public int getCriatividade() {
        return criatividade;
    }

    /**
     * @param criatividade the criatividade to set
     */
    public void setCriatividade(int criatividade) {
        this.criatividade = criatividade;
    }

    /**
     * @return the casa
     */
    public String getCasa() {
        return casa;
    }

    /**
     * @param casa the casa to set
     */
    public void setCasa(String casa) {
        this.casa = casa;
    }
    public String calcularCasa(){
        int casaGrif = (2*coragem)+lealdade;
        int casaSons = (2*ambicao)+estrategia;
        int casaCorv = (2*inteligencia)+criatividade;
        int casaLufa = ((2*lealdade)+(coragem))/3;
        
        int grifinoria = (casaGrif * 1000) + 4;
        int sonserina = (casaSons * 1000) + 3;
        int corvinal = (casaCorv * 1000) + 2;
        int lufalufa = (casaLufa * 1000) + 1;
        
        
        if(grifinoria > sonserina && grifinoria > corvinal && grifinoria > lufalufa){
           return "Grifinoria";
        }else if(sonserina > grifinoria && sonserina > corvinal && sonserina > lufalufa){
           return "Sonserina";
        }else if(corvinal > grifinoria && corvinal > sonserina && corvinal > lufalufa){
           return "Corvinal"; 
        }else{
            return "Lufa Lufa";
        }
        
    
    }
    public void exibirInformacoes(){
        
        System.out.println("Ola "+ nome);
        System.out.println("Sua casa é " + calcularCasa());
    }
  }
