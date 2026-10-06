import java.util.Scanner;

public class valoresInt {
    public static void main(String[] args) {
        int n1, n2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1= ler.nextInt();
        System.out.println("Digite o segundo número: ");
        n2= ler.nextInt();

        if (n1 > n2){
            System.out.println("o primeiro número é o maior ");
        }
        else if (n2 > n1){
            System.out.println("O segundo número é maior");
        }
        else {
            System.out.println("Os números são iguais");
        }
    }
}


