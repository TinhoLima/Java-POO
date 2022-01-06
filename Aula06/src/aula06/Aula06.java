/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

/**
 *
 * @author aliso
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];
        
        l[0] = new Lutador("Pretty Boy","França",1.75f,68.9f,31);
        l[1] = new Lutador("Aleso", "Brasil", 1.71f, 74.0f, 26);
        l[2] = new Lutador("Putscript","Brasil",1.68f,57.8f,29);
        l[3] = new Lutador("Snapshadow","EUA",1.65f,80.9f,35);
        l[4] = new Lutador("Dead code","Austrália",1.93f,81.6f,28);
        
        Combate ufc = new Combate();
        
        ufc.marcarLuta(l[0], l[2]);
        ufc.lutar();
        
        ufc.marcarLuta(l[0], l[2]);
        ufc.lutar();
        
        l[2].status();
        l[0].status();
    }
}
