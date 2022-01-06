/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author aliso
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override // Significa sobrescrever
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()==true) {
            System.out.println("Volume da TV: "+this.getVolume());
            for (int i=0;i<this.getVolume();i+=10) {
                System.out.print("|");
            }
            System.out.println("\nEstá tocando? "+this.getTocando());
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()==true) {
            System.out.println("Fechando menu...");
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()==true) {
            this.setVolume(this.getVolume()+5);
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }        
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()==true) {
            this.setVolume(this.getVolume()-5);
            
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }        
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()==true) {
            this.setVolume(0);
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()==true) {
            if (this.getVolume()==0) {
                this.setVolume(50);
            }
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }        
    }

    @Override
    public void play() {
        if (this.getLigado()==true) {
            this.setTocando(true);
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado()==true) {
            this.setTocando(false);
        } else {
            System.out.println("A Tv não encontra-se ligada no momento.");
        }
    }
    
    
    
}
