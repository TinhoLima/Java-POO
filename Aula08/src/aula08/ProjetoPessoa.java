/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08;

/**
 *
 * @author aliso
 */
public class ProjetoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor pf = new Professor();
        Funcionario f = new Funcionario();
        
        p.setNome("Alguem");
        p.setIdade(35);
        
        a.setNome("Aleso");
        a.setCurso("Java");
        
        pf.setNome("Gustavo");
        pf.setSalario(2500f);
        
        f.setNome("Cluadia");
        f.setSexo("Feminino");
        f.setSetor("Secretaria");
        
        System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(pf.toString());
        System.out.println(f.toString());
        
    }
    
}
