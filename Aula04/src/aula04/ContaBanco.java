
package aula04;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
//  METODO CONSTRUTOR
    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    
    
// GETTERS AND SETTERS.
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    
//  FUNÇÕES
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String c) {
        this.setStatus(true);
        this.setTipo(c);
        System.out.println("Que legal!\nVocê acaba de abrir uma conta com a gente!");
        if (c=="cc" ){
            this.setSaldo(50);
        } else if (c=="cp") {
            this.setSaldo(150);
        }
        status();
    }
    
    public void fecharConta() {
        if (this.saldo>0) {
            System.out.println("\nSaque obrigatório para encerramento de conta.");
            System.out.println("Saldo ainda disponível: R$ "+getSaldo());
        } else if (this.saldo<0){
            System.out.println("\nSaldo negativado. Não é possível fechar sua conta estando em débito.");
        } else if (this.saldo==0) {
            this.status = false;
            System.out.println("\n============ FECHANDO CONTA =========");
            System.out.println("Conta encerrada com sucesso...");
            System.out.println("---------------------------------------\n");
        }
    }
    
    public void depositar(double x) {
        if (this.status==true) {
            setSaldo(getSaldo()+x);
            System.out.println("\nR$ "+x+" Depositado com sucesso!\nSaldo atual de: R$ "+getSaldo());
        } else {
            System.out.println("ERRO - Não foi possível realizar depósito.");
        }
       
    }
    
    public void sacar(double x) {
        if (this.status==true) {
           if (this.saldo<=0) {
               System.out.println("\nVocê não possui saldo para saques.");
               System.out.println("Saldo negativo atual de R$ "+getSaldo()+"\nQuite seu débito!");
           } else {
               this.saldo = this.saldo-x;
               System.out.println("Saque de R$ "+x+" Realizado com sucesso!");
               System.out.println("Saldo atual: R$ "+getSaldo());
           }
        } else {
            System.out.println("Você ainda não possui conta ou a mesma encontra-se desativada.");
        }
    }
    
    public void pagarMensal() {
        if (this.status==true) {
            if (this.tipo=="cc") {
                this.saldo -= 12;
            } else if (this.tipo=="cp") {
                this.saldo -= 20;
            }
        }
    }
    
    public void status() {
        if (this.status==false) {
            System.out.println("Sua conta está desativada ou você não criou uma conta ainda.");
        } else {
            System.out.println("");
            System.out.println("============ Status da conta ==========");
            System.out.println("Numero da conta: "+getNumConta());
            System.out.println("Tipo: "+getTipo());
            System.out.println("Dono da conta: "+getDono());
            System.out.println("Saldo: R$ "+getSaldo());
            System.out.println("---------------------------------------");
            System.out.println("");
        }
        
    }
}
