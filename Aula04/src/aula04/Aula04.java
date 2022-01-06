package aula04;
/**
 *
 * @author aliso
 */
public class Aula04 {

    public static void main(String[] args) {
//                                    Add (CONTA, DONO)
        ContaBanco conta1 = new ContaBanco(001,"Coutinho");
        ContaBanco conta2 = new ContaBanco(002,"Lima");
        
        conta2.abrirConta("cp"); //Conta pupança
        conta2.sacar(150);
        conta2.fecharConta();
        conta2.sacar(10);
        conta2.depositar(50);
        
        conta1.abrirConta("cc");
        
    }
    
}
