import java.util.Scanner;

public class Triangulo {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //Leitura do teclado
        int altura, base;
        float area;

        System.out.print("Informe a altura: ");
        altura = teclado.nextInt();

        System.out.print("Informe a base: ");

        base = teclado.nextInt();
        area = 0.5f * altura * base;
        System.out.println("Área: " + area);
    }
}