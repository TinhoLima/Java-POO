/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author aliso
 */
public class Cachorro extends Mamifero {
    
    public void reagir(String frase) {
        if (frase.equals("toma comida") || frase.equals("fala garoto")) {
            System.out.println("Abanar o rabinho");
        } else {
            System.out.println("Latir");
        }
        
    }
    
    public void reagir(int hora, int min){
        if (hora<12) {
            System.out.println("hora de passear");
        } else if (hora >= 18) {
            System.out.println("iguinorar");
        } else {
            System.out.println("Dormindo no momento.");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar o rabinho");
        } else {
            System.out.println("rosnar");
        }
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
