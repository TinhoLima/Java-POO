/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

/**
 *
 * @author aliso
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("Padrão","Azul",2.5f);
        Caneta c2 = new Caneta("Prime", "Preta",1.5f);
        
        c1.tampar();
        c1.status();
        System.out.println("");
        c2.status();
        
    }
    
}
