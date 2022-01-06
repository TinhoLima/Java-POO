/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author aliso
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Visitante");
        v1.setIdade(26);
        v1.setSexo("masculino");
        
        Aluno a1 = new Aluno();
        a1.setNome("Aluno");
        a1.setIdade(18);
        a1.setCurso("Java");
        a1.setMatricula(0001);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Aleso");
        b1.setCurso("Java");
        b1.setIdade(18);
        b1.setMatricula(0002);
        b1.pagarMensalidade();
    }
    
}
