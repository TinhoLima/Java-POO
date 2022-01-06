/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga = 100;
    boolean tampada;
    
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Destampe a caneta primeiro.");
        } else {
            this.carga -= 10;    
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    void status() {
        System.out.println("A caneta de cor "+this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Sua carga está em: "+this.carga+"%");
    }
}
