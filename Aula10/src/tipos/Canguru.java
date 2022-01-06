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
public class Canguru extends Mamifero{
    public void usarBolsa() {
        System.out.println("Item adicionado a sua bolsa.");
    }
    
    @Override
    public void locomover() {
        System.out.println("Pulando, Pulando.");
    }
}
