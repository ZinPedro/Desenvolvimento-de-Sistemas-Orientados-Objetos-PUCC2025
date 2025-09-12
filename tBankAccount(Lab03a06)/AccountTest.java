import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class AccountTest{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Account> contas = new ArrayList<>();

        int opcao=0;

        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Operar conta existente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // Limpar buffer

            switch(opcao){
                case 1:
                    //Criar nova conta
                    System.out.print("Informe seu nome: ");
                    String nome = input.nextLine();

                    //Gera numero aleatorio para conta 4 digitos
                    int numeroConta = 1000 + random.nextInt(9000);

                    //Limite
                    System.out.print("Informe o limite da conta: ");
                    double limite = input.nextDouble();

                    // Leitura da data de abertura
                    System.out.println("Informe a data de abertura da conta:");
                    System.out.print("Dia: ");
                    int dia = input.nextInt();
                    System.out.print("Mês: ");
                    int mes = input.nextInt();
                    System.out.print("Ano: ");
                    int ano = input.nextInt(); 

                    Date dataAbertura = new Date (dia, mes, ano);
                    Account novaConta = new Account(nome,numeroConta,limite,dataAbertura);
                    contas.add(novaConta);

                    System.out.println("\nConta criada com sucesso! Numero da conta: " + numeroConta);
                    novaConta.Imprime();

                    break;

                case 2:
                    //Operar em conta existente
                    if(contas.isEmpty()){
                        System.out.println("Não há contas cadastradas!");
                        break;
                    }

                    System.out.print("Digite o numero da conta para acessar: ");
                        int numContaBusca = input.nextInt();
                        input.nextLine(); //Limpar buffer

                        Account contaSelecionada = null;

                        for (Account acc : contas){
                            if(acc.getNumConta() == numContaBusca){
                                contaSelecionada = acc;
                                break;
                            }
                        }

                        if(contaSelecionada == null){
                            System.out.println("Conta não encontrada!");
                            break;
                        }

                        //Menu de Operções de Conta

                        int opcaoConta = 0;

                        do{
                            System.out.println("\n=== Menu da Conta ===");
                            System.out.println("1. Depositar");
                            System.out.println("2. Sacar");
                            System.out.println("3. Trocar Senha");
                            System.out.println("4. Imprimir Dados da Conta");
                            System.out.println("5. Voltar ao menu principal");
                            System.out.print("Escolha uma opção: ");
                            opcaoConta = input.nextInt();
                            input.nextLine();

                            switch(opcaoConta){
                                case 1: 
                                    System.out.print("Digite o valor para depositar: ");
                                    double valorDeposito = input.nextDouble();
                                    contaSelecionada.deposit(valorDeposito);
                                    break;

                                case 2:
                                    System.out.print("Digite o valor para sacar: ");
                                    double valorSaque = input.nextDouble();
                                    contaSelecionada.withdraw(valorSaque);
                                    break;

                                case  3:
                                    System.out.print("Digite a senha atual: ");
                                    String senhaAtual = input.nextLine();
                                    System.out.print("Digite a nova senha: ");
                                    String senhaNova = input.nextLine();

                                    contaSelecionada.TrocaSenha(senhaAtual, senhaNova);

                                case 4: 
                                    contaSelecionada.Imprime();
                                    break;

                                case 5:
                                    System.out.println("Retornando pro menu principal...");
                                    break;

                                default:
                                    System.out.println("Opção Inválida");
                            }
                        }while(opcao != 5);
                        break;

                case 3:
                        System.out.println("Saindo do Sistema...");
                        break;

                default:
                        System.out.println("Opção Inválida");
            }

        }while(opcao != 3);
        input.close();
    }
}