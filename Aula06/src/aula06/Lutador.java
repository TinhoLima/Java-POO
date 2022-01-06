/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author aliso
 */
public class Lutador {
    private String nome,nacionalidade,categoria;
    private float altura,peso;
    private int idade,vitorias,derrotas,empates;
    

    public Lutador(String nome, String nacionalidade, float altura, float peso, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.categoria = categoria;
        this.altura = altura;
        this.setPeso(peso);
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return this.categoria;
    }
    
    private void setCategoria() {
        if (this.peso<52.5f) {
            this.categoria = "Inválido";
        } else if (this.peso <=70.3f) {
            this.categoria = "leve";
        } else if (this.peso<=83.9f) {
            this.categoria = "medio";
        } else if (this.peso<=120.2f) {
            this.categoria = "pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }
    
    public void apresentar() {
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println("Idade: "+getIdade()+" anos.");
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("\nVitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
        System.out.println("-----------------------------");
    }
    
    public void status() {
        System.out.println("\nStatus dê: "+getNome());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }

    
    
    
}
