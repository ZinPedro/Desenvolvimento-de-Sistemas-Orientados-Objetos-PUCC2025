//import java.util.Scanner;

public class AccountTest{
    public static void main (String[] args){
        Account account1 = new Account("Pedro",1,100.00);
        Account account2 = new Account("Thiago",2,100000.00);
        Account account3 = new Account();
        account1.Imprime();
        account2.Imprime();
        account3.Imprime();
        account1.deposit(50.0);
        account3.deposit(50.0);
        account1.TrocaSenha("0000","1234");
        account1.TrocaSenha("0000","1234");
        account1.TrocaSenha("1234","1212");
        account1.Imprime();
        account1.withdraw(99.0);
        account1.Imprime();
        account1.withdraw(100.0);
        account1.Imprime();
        account3.setName("Sabino");
        account3.Imprime();
        /* 

        //exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n",
            account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
            account2.getName(),account2.getBalance());

        //cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner (System.in);

        System.out.print("Enter deposit amount for account1: "); //prompt
        double depositAmount = input.nextDouble(); //obtém a entrada do usuario
        System.out.printf("%nadding %.2f to account balance %n%n", depositAmount);
        account1.deposit(depositAmount); //adiciona o saldo de account1
        //exibe os saldos
        System.out.printf("%s balance: $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance());
        
        System.out.printf("Enter deposit amount for account2: "); //prompt
        depositAmount = input.nextDouble(); //obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account2 balance %n%n",depositAmount);
        account2.deposit(depositAmount); //Adciona ao saldo de account 2

        //exibe os saldos
        System.out.printf("%s balance: $%.2 %n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",account2.getName(),account2.getBalance());
        */

    }//fim da main
}  //fim da classe AccountTest