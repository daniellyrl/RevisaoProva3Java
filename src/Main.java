import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matematica op1 = new Matematica();
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        System.out.println("Digite um número: ");
        int y = sc.nextInt();
        System.out.println("A soma entre os dois números cadastrados foi: " + op1.somar(x,y));
        System.out.println("A subtração entre os dois números cadastrados foi: " + op1.diminuir(x,y));
        System.out.println("A multiplicação entre os dois números cadastrados foi: " + op1.multiplicar(x,y));
        System.out.println("A divisão entre os dois números cadastrados foi: " + op1.dividir(x,y));

    }
}