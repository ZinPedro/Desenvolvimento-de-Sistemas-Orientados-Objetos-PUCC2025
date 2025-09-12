public class SavingsAccount extends Account{
    private double taxaRendimento, balance;

    public SavingsAccount(String nome, int numConta, Date openingdate, double taxaRendimento){
        super(nome,numConta,openingdate);
        this.taxaRendimento = taxaRendimento;
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

    public void aplicarRendimento(){
        balance += getBalance() * (taxaRendimento/100);
        setBalance(balance);
    }

    @Override
    public void Imprime(){
        super.Imprime();
        System.out.print("Taxa de Rendimento: " + taxaRendimento);
        System.out.println("\n======================\n");
    }
}