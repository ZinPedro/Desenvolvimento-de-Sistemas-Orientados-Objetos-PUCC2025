import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class AccountTest{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Account> contas = new ArrayList<>();

        int opcaoUsuario=0, senhaGerente = 1234;

        do {
            System.out.println("\nMenu de Entrada");
            System.out.println("1. Gerente");
            System.out.println("2. Usuario");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoUsuario = input.nextInt();
            input.nextLine();

            switch (opcaoUsuario) {
                case 1:

                    int senhaDigitada;
                    System.out.print("Digite a senha (Gerente): ");
                    senhaDigitada = input.nextInt();
                    input.nextLine();

                    if(senhaDigitada != senhaGerente){
                        System.out.println("Senha Inválida!");
                        break;
                    }

                    int opcaoMenu=0;

                    do {
                        System.out.println("\n=== Menu Gerente ===");
                        System.out.println("1. Criar nova conta");
                        System.out.println("2. Informações de conta existente");
                        System.out.println("3. Lista de contas existentes");
                        System.out.println("4. Trocar senha (Gerente)");
                        System.out.println("5. Aplicar taxa de rendimento");
                        System.out.println("6. Sair");
                        System.out.print("Escolha uma opção: ");
                        opcaoMenu = input.nextInt();
                        input.nextLine(); // Limpar buffer
            
                        switch(opcaoMenu){
                            case 1:
                                //Criar nova conta
                                System.out.print("Informe o nome do cliente: ");
                                String nome = input.nextLine();
            
                                //Gera numero aleatorio para conta 4 digitos
                                int numeroConta = 1000 + random.nextInt(9000);
            
                                // Leitura da data de abertura

                                Date dataAbertura=null;
                                boolean dataValida = false;

                                while(!dataValida){
                                    System.out.println("Informe a data de abertura da conta:");
                                    System.out.print("Dia: ");
                                    int dia = input.nextInt();
                                    System.out.print("Mês: ");
                                    int mes = input.nextInt();
                                    System.out.print("Ano: ");
                                    int ano = input.nextInt(); 
                                    input.nextLine();
                                    try {
                                        dataAbertura = new Date (dia, mes, ano);
                                        dataValida=true;
                                    }catch(IllegalArgumentException e){
                                        System.out.println("Erro: " + e.getMessage());
                                        System.out.println("Tente novamente: ");
                                    }
                                }
            
                                System.out.println("Escolha o tipo da conta");
                                System.out.println("1. Conta Simples");
                                System.out.println("2. Conta Especial");
                                System.out.println("3. Conta Poupança");

                                int opcaoTipoConta = 0;

                                opcaoTipoConta = input.nextInt();
                                input.nextLine();

                                switch(opcaoTipoConta){
                                    case 1:
                                        Account novaContaSimples = new SimpleAccount(nome,numeroConta,dataAbertura);
                                        contas.add(novaContaSimples);
                                        System.out.println("\nConta criada com sucesso! Numero da conta: " + numeroConta);
                                        novaContaSimples.Imprime();
                                    break;

                                    case 2:
                                        //Limite
                                        
                                        double limite;

                                        do{
                                            System.out.print("Informe o limite da conta: ");
                                            limite = input.nextDouble();
                                            input.nextLine();

                                            if(limite < 0){
                                                System.out.println("Limite Inválido!");
                                            }
                                        }while(limite < 0);

                                        Account novaContaEspecial = new SpecialAccount(nome, numeroConta, dataAbertura, limite);
                                        contas.add(novaContaEspecial);
                                        System.out.println("\nConta criada com sucesso! Numero da conta: " + numeroConta);
                                        novaContaEspecial.Imprime();
                                    break;

                                    case 3:
                                        int taxaRendimento;
                                        do{
                                            System.out.print("Digite a taxa de Rendimento(em %): ");
                                            taxaRendimento = input.nextInt();

                                            if(taxaRendimento < 0){
                                                System.out.println("Taxa Inválida!");
                                            }
                                        }while(taxaRendimento < 0);

                                        Account novaContaPoupanca = new SavingsAccount(nome, numeroConta, dataAbertura, taxaRendimento);
                                        contas.add(novaContaPoupanca);
                                        System.out.println("\nConta criada com sucesso! Numero da conta: " + numeroConta);
                                        novaContaPoupanca.Imprime();
                                    break;

                                    default:
                                        System.out.println("Opção Inválida");
                                }  
                                
                                System.out.println("Pressione Enter para continuar...");
                                input.nextLine();  // espera o usuário apertar Enter
            
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

                                contaSelecionada.Imprime();
                                System.out.println("Pressione Enter para continuar...");
                                input.nextLine();  // espera o usuário apertar Enter
                            break;
            
                            case 3:
                                if(contas.isEmpty()){
                                    System.out.println("Não há contas cadastradas!");
                                    break;
                                }

                                System.out.println("== Lista de Contas ==");
                                for (Account acc : contas){
                                    acc.getNumConta();
                                    System.out.print("== "+acc.getNumConta()+" == ");
                                    acc.getName();
                                    System.out.println(acc.getName() + " ==");
                                }
            
                            break;
                                
                            case 4:
                                System.out.print("Digite a senha atual: ");
                                senhaDigitada = input.nextInt();
                                if(senhaDigitada == senhaGerente){
                                    System.out.print("Digite a nova senha: ");
                                    senhaGerente = input.nextInt();
                                }else{
                                    System.out.println("Senha Inválida!");
                                }
                            break;

                            case 5:
                                if(contas.isEmpty()){
                                    System.out.println("Não há contas cadastradas!");
                                    break;
                                }
            
                                System.out.print("Digite o numero da conta para aplicar: ");
                                int numContaBusca1 = input.nextInt();
                                input.nextLine(); //Limpar buffer
            
                                Account contaRendSelecionada = null;
            
                                for (Account acc : contas){
                                    if(acc.getNumConta() == numContaBusca1){
                                        contaRendSelecionada = acc;
                                    }
                                }
            
                                if(contaRendSelecionada == null){
                                    System.out.println("Conta não encontrada!");
                                    break;
                                }

                                if (!(contaRendSelecionada instanceof SavingsAccount)) {
                                    System.out.println("Essa conta não é do tipo Poupança.");
                                    break;
                                }

                                SavingsAccount contaPoupanca = (SavingsAccount) contaRendSelecionada;
                                contaPoupanca.aplicarRendimento();
                                System.out.println("Rendimento aplicado com sucesso!");
                                
                            break;

                            case 6:
                                System.out.println("Saindo do Menu Gerente");
                            break;
            
                            default:
                                System.out.println("Opção Inválida");
                        }
            
                    }while(opcaoMenu != 6);
                    
                break;

                case 2: //Usuario
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
                        }
                    }

                    if(contaSelecionada == null){
                        System.out.println("Conta não encontrada!");
                        break;
                    }

                    for(int i=3;i>0;i--){
                        System.out.print("Digite a senha para entrar ("+ i + " Tentativas): ");
                        String senhaAtual = input.nextLine();

                        if(contaSelecionada.verificaSenha(senhaAtual)){
                            i=0;
                        }

                        if(i == 1){
                            System.err.println("Tentativas esgotadas!");
                            contaSelecionada = null;
                            break;
                        }
                    }

                    if (contaSelecionada == null) {
                        break;
                    }

                    //Menu de Operções de Conta

                    int opcaoConta = 0;

                    do{
                        System.out.println("\n=== Menu Cliente ===");
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
                                break;
                            case 4: 
                                contaSelecionada.Imprime();
                                System.out.println("Pressione Enter para continuar...");
                                input.nextLine();  // espera o usuário apertar Enter
                                break;

                            case 5:
                                System.out.println("Retornando pro menu principal...");
                                break;

                            default:
                                System.out.println("Opção Inválida");
                        }
                    }while(opcaoConta != 5);
                break;

                case 3:
                    System.out.println("Saindo do Sistema...");
                break;
            
                default:
                    System.out.println("Opção Inválida");
            }
        }while(opcaoUsuario != 3);
    input.close();    
    }
}