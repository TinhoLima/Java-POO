/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author aliso
 */
public class Video implements AcoesVideo{
    private String titulo;
    private int views, curtidas;
    private boolean reproduzindo;
    private int avaliacao;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
        this.avaliacao = 0;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) (this.avaliacao+avaliacao/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    

    @Override
    public void play() {
        System.out.println("Vídeo iniciado.");
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        System.out.println("Vídeo pausado.");
        setReproduzindo(false);
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", views=" + views + ", curtidas=" +
                curtidas + ", reproduzindo=" + reproduzindo + ", avaliacao=" + avaliacao + '}';
    }
    
    
    
}
