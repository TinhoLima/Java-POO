/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author aliso
 */
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho() {
        System.out.println("Criando um novo ninho.");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo minhocas ou insetos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("cantando.");
    }
    
}
