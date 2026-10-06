import java.util.Scanner;

public class PARouIMPAR {

    public static void main (String []args){

        int numero;
        Scanner ler  = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero=ler.nextInt();

        if (numero % 2 ==0){
            System.out.println("o numero é PAR");
        }
        else  {
            System.out.println("o numero é impar");

        }


    }

}
