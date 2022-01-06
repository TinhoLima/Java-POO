/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos;

import aula10.Mamifero;

/**
 *
 * @author aliso
 */
public class Cachorro extends Mamifero {
    
    public void reagir() {
        
    }
    
    public void enterrarOssos() {
        System.out.println("osso enterrado! Ninguem vai acha-lo aqui.");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo.");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
}
