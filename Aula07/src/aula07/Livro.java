/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author aliso
 */
public class Livro implements Publicacao {
    private String titulo,autor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        if (this.aberto==false) {
            System.out.println("Seu livro ainda não foi aberto.");
        } else {
        return "======= Livro =====" + "\ntitulo: " + titulo + ", \nautor: " +
                autor + ", \ntotPaginas: " + totPaginas + ", pagAtual: " + pagAtual + ", \naberto: " + aberto 
                + ", \nleitor: " + leitor.getNome();
        }
        return "";
    }
    
    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (this.aberto==false) {
            System.out.println("Seu livro ainda não foi aberto.");
        } else {
            if (p> this.totPaginas) {
                System.out.println("Valor de página inválido.");
            } else {
                this.pagAtual = p;
            }
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto==false) {
            System.out.println("Seu livro ainda não foi aberto.");
        } else {
            this.pagAtual++;
        }
        
    }

    @Override
    public void voltarPag() {
        if (this.aberto==false) {
            System.out.println("Seu livro ainda não foi aberto.");
        } else {
            this.pagAtual--;
        }
        
    }
    
    
}
