
public class Account {
    private String name,senha; //variavel de instancia
    private int numConta; //variavel de instancia
    private double balance, limite;  //variavel de instancia
    
    //contrutor de account que recebe dois parametros
    public Account(String name,int numConta, double limite){

        this.name = name; //atribui name variavel de intancia name
        this.numConta = numConta;
        this.senha = "0000";
        

        //valida que o balance eh maior que 0.0; se nao for,
        // a variavel de instancia balance mantem seu valor inicial padrão de 0.0
        if (balance > 0.0){ //se o saldo for valido
            this.balance = 0; //o atribui à variavel de intancia balance 
        }
        if (limite > 0.0){ //se o saldo for valido
            this.limite = limite; //o atribui à variavel de intancia balance 
        }
    }

    public Account(){
        this.name = ""; //atribui name variavel de intancia name
        this.numConta = 0;
        this.senha = "";
        

        //valida que o balance eh maior que 0.0; se nao for,
        // a variavel de instancia balance mantem seu valor inicial padrão de 0.0
        if (balance > 0.0){ //se o saldo for valido
            this.balance = 0; //o atribui à variavel de intancia balance 
        }
        if (limite > 0.0){ //se o saldo for valido
            this.limite = 0; //o atribui à variavel de intancia balance 
        }
    }

    //método que deposita (adciona) apenas uma quantia válida no saldo
    public void deposit (double depositAmount){

        if (depositAmount > 0.0){ //se depositAmount for valido
            this.balance = this.balance + depositAmount; //o adiciona saldo    
        }else{System.err.println("Numero Invalido!");}
    }

    //método que saca (retira) apenas uma quantia válida no saldo
    public void withdraw (double withdrawAmount){

        if (withdrawAmount > 0.0){ //se withdrawAmount for valido
            if(((balance - withdrawAmount) > (limite*(-1)))){
                this.balance = this.balance - withdrawAmount; 
            }else{System.err.println("Limite Insuficiente!");}
        }else{System.err.println("Numero Invalido!");}
    }

    public void TrocaSenha (String senhaAnt, String senhaFut){
        if(senha == senhaAnt){
            this.senha = senhaFut;
            System.out.println("Senha Alterada com sucesso!");
        }else{System.err.println("Senha Inválida!");}
    }

    public void Imprime(){
        System.out.println("\nDados:\nNome: " + this.getName() + "\nNumero da conta:" + this.getNumConta() + "\nSaldo: " + this.getBalance() + "\nLimite: " + this.getLimite() + "\n");
    }

    //método retorna o saldo da conta
    public double getBalance(){
        return balance;
    }

    //método que define o nome
    public void setName(String name){
        this.name = name;
    }

    //método que retorna o nome
    public String getName(){
        return name; //retorna o valor de name ao chamador
    }//fim do método getName

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }




} //Fim da classe Account