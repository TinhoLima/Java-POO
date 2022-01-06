/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author aliso
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Aleso", "Masculino", 26,"macLovin123");
        g[1] = new Gafanhoto("Jampi", "Masculino", 28, "jml_reidelas");
        
        Video[] v = new Video[3];
        v[0] = new Video("Como fazer gelo.");
        v[1] = new Video("Especial de nenhum inscrito.");
        v[2] = new Video("Estudei e olha no que deu.");
        
        System.out.println("VIDEOS\n------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        
        System.out.println("\nGAFANHOTOS\n-----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        Visualizacao[] view = new Visualizacao[2];
        view[0] = new Visualizacao(g[0], v[0]);
        view[0].avaliar(70f);
        System.out.println(view[0].toString());
        
        view[1] = new Visualizacao(g[0], v[1]);
        view[1].avaliar();
        System.out.println(view[1].toString());
    }
    
}
