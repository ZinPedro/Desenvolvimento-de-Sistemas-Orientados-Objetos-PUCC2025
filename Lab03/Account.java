/* 
public class Account1 {
    private String name; //variavel de instancia
    private double balance; //variavel de instancia
    
    //contrutor de account que recebe dois parametros
    public Account1(String name,double balance){

        this.name = name; //atribui name variavel de intancia name

        //valida que o balance eh maior que 0.0; se nao for,
        // a variavel de instancia balance mantem seu valor inicial padrão de 0.0
        if (balance > 0.0) //se o saldo for valido
            this.balance = balance; //o atribui à variavel de intancia balance 
    }

    //método que deposita (adciona) apenas uma quantia válida no saldo
    public void deposit (double depositAmount){

        if (depositAmount > 0.0) //se depositAmount for valido
            balance = balance + depositAmount; //o adiciona saldo
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

} //Fim da classe Account
 */