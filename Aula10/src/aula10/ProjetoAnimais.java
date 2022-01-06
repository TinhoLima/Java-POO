/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

import tipos.Arara;
import tipos.Canguru;
import tipos.Tartaruga;

/**
 *
 * @author aliso
 */
public class ProjetoAnimais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85);
        m.setIdade(5);
        m.setMembros(4);
        
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        
        Tartaruga t = new Tartaruga();
        t.locomover();
        
        Canguru jack = new Canguru();
        
        jack.usarBolsa();
        jack.alimentar();
        jack.locomover();
        
        Arara arara1 = new Arara();
        
        arara1.fazerNinho();
    }
    
}
