import java.io.InputStreamReader;
import java.io.BufferedReader;

//Classe utilizada para exemplificar o uso da entrada/saida padrão em java atráves das classes
//ImputStreamReader and BufferedReader

public class TesteES {
    //o throws Exeption é necessário no main para que possamos tratar os casos de problemas associados a leitura de dados.
    public static void main(String[] args) throws Exception{

        // Associa o stream reader a entrada padrão - teclado
        InputStreamReader  stream = new InputStreamReader(System.in);

        // Associa o BufferReader ao stream reader
        BufferedReader in = new BufferedReader(stream);

        //Apresenta uma mensagem na saída padrão - vídeo
        System.out.print("Informe uma String: ");
        //Lê uma linha do teclado. readLine retorna uma string
        String teste = in.readLine();
        //Apresenta na tela a String lida
        System.out.println( "A String lida foi: " + teste);

        // Apresenta uma mensagem na saída padrão - vídeo
        System.out.print("Informe um inteiro: ");
        //Lê uma linha do teclado. readLine retorna uma String, necessário converter.
        int numero = Integer.parseInt(in.readLine());
        //Apresenta na tela o inteiro lido
        System.out.println("O inteiro lido foi: " + numero);

    }
}