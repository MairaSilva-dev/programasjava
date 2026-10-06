public class Main {
    public static void main (String [] args){

        // ESTRUTURA SWITCH CASE
        // é utilizado quando sabemos qual o resultado da verificação
        // e para cada resultado, podemos realizar uma ação.

        // switch (verifacação) {
        //    case opção 1:
               // executa algum código
        //     break;
        //    case opção 2:
        // executa algum código
        //     break;
        //case opção 3:
         // executa algum código
         //     break;
        // default :
          // caso não entre em nenhuma das opções

        int dia = 2;
        switch (dia){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Não é dia de semana");

    }
    }
}
