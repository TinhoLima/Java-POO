/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

/**
 *
 * @author aliso
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Aleso", "masculino", 26);
        p[1] = new Pessoa("Jean", "Masculino", 28);
        p[2] = new Pessoa("Você", "Indefinido", 0);
        
        l[0] = new Livro("Era uma não vez", "Eu", 150, p[0]);
        l[1] = new Livro("Lobo bom", "desconhecido", 200, p[1]);
        l[2] = new Livro("Chapeuzao roxo", "pelé", 350, p[2]);
        
        l[0].abrir();
        l[0].folhear(180);
        l[0].folhear(148);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
    
}
