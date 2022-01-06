/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

public class Aula01 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "padrão";
        c1.cor = "Azul";
        c1.ponta = 2.5f;
        c1.tampada = true;
        
        
        c1.rabiscar();
        c1.status();
        
    }
   
    
}
