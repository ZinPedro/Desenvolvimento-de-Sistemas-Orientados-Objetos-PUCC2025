public class SpecialAccount extends Account{
    double limite;
    public SpecialAccount(String nome, int numConta, Date openingdate, double limite){
        super(nome,numConta,openingdate);
        this.limite = limite; //o atribui à variavel de intancia balance 
        
    } 

    @Override
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0.0){
            if(getBalance() + getLimite() - withdrawAmount > 0.0){
                setBalance(getBalance() - withdrawAmount);
            }else{
                System.out.println("Saldo e Limite Insuficiente!");
            }
        }else{
            System.out.println("Número Inválido");
        }
    }

    @Override
    public void Imprime(){
        super.Imprime();
        System.out.println("Limite: R$ " + String.format("%.2f", limite));
        System.out.println("\n======================\n");
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }
}
