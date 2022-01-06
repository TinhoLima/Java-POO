/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author aliso
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c1 = new Cachorro();
        Lobo l1 = new Lobo();
        
        c1.emitirSom();
        l1.emitirSom();
        c1.reagir("fala garoto");
        c1.reagir(12, 0);
    }
    
}
