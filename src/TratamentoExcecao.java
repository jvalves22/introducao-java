import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;

        while (true) {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();

            if (nome.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("O nome deve conter apenas letras!");
            }
        }

        while (true) {
            System.out.println("Digite seu sobrenome: ");
            sobrenome = scanner.next();

            if (sobrenome.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("O sobrenome deve conter apenas letras!");
            }
        }


        while (true) {
            try {
                System.out.println("Digite sua idade: ");
                idade = scanner.nextInt();
                if (idade > 0) {
                    break;
                } else {
                    System.out.println("A idade deve ser maior que 0!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números inteiros!");
                scanner.next(); 
            }
        }


        while (true) {
            try {
                System.out.println("Digite sua altura (em metros, use ponto): ");
                altura = scanner.nextDouble();
                if (altura > 0) {
                    break;
                } else {
                    System.out.println("A altura deve ser maior que 0!");
                }
            } catch (InputMismatchException e) {
                System.out.println("A altura deve conter ( . ) ao invés de ( , ). Ex: 1.75.");
                scanner.next(); 
            }
        }


        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " metros.");

        scanner.close();
    }
}