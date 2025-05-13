import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoExcecao {
    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        int idade = 0;
        double altura = 0.0;

        try{
            System.out.println("Digite sua idade; ");
            idade = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Insira apenas numeros INTEIROS!");
            scanner.next();
            return;
        }
        
        try {
            System.out.println("Digite sua altura: ");
            altura = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("A altura deve conter ( . ) ao invés de ( , ). Ex: 1.95.");
            scanner.next();
            return;
        }
        

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
    }
}
