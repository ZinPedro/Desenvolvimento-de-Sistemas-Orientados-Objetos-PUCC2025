public class SavingsAccount extends Account{
    public SavingsAccount(String nome, int numConta, double limite, Date openingdate){
        super(nome,numConta,limite,openingdate);
    }

    @Override
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0.0){
            if(getBalance() - withdrawAmount > 0.0){
                super.withdraw(withdrawAmount);
            }else{
                System.out.println("Saldo Insuficiente!");
            }
        }else{
            System.out.println("Número Inválido");
        }
    }
}