/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author aliso
 */
public class Peixe extends Animal{
    private String corEscama;
    
    public void corEscamas() {
        System.out.println("Trocando escamas de peixe...");
    }
    
    public void soltarBolhas() {
        System.out.println("Jato de bolhas!");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("sugando substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("blub blub");
    }
    
}
