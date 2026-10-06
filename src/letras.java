import java.util.Scanner;

public class letras {
    public static void main (String [] args){
        char letra;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        letra = ler.next().charAt(0);

        if ( letra =='a' || letra =='e' || letra == 'i' || letra == 'o' || letra =='u'){
            System.out.println("É uma vogal");
        }
        else{
            System.out.println("É uma consoante");
        }
    }

}
