public class CalculoMedia {
    
    public static void main(String[] args) {
        double nota1 = 10;
        double nota2 = 10;
        double nota3 = 10;

        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        }else if (media >=5 ) {
            System.out.println("Recuperação!");    
        }else{
            System.out.println("Reprovado!");
        }

    
    }
}
