/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

import java.util.Random;

/**
 *
 * @author aliso
 */
public class Combate {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1!=l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        System.out.println("\n============ HORA DA LUTA ============");
        if (this.aprovada) {
            System.out.println("===== Desafiado ====");
            this.desafiado.apresentar();
            System.out.println("===== Desafiante ====");
            this.desafiante.apresentar();
            
            
            System.out.println("========= RESULTADO DA LUTA =========");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome()+" Vence a luta!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome()+" Vence a luta!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                    
            }
                
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }
    
// get and set
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
