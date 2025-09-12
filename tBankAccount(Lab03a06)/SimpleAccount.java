public class SimpleAccount extends Account{
    public SimpleAccount(String nome, int numConta, Date openingdate){
        super(nome,numConta,openingdate);

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

    @Override
    public void Imprime(){
        super.Imprime();
        System.out.println("======================\n");
    }
}