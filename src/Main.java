import java.util.Scanner;

public class Main {
    Ifelse ifelse= new Ifelse();

    public static void main(String[] args) {
        char Ingress;
        Ingress='a';
        Scanner muxa = new Scanner(System.in);
        muxa.nextLine();
        System.out.println("hardan");
        String hardan = muxa.nextLine();
        System.out.println("hara");
        String hara= muxa.nextLine();

        int start= 1;
        int end = 8;
        System.out.println("tarix sec");
        int tarixsex = muxa.nextInt();
        int enucuzbilet = 200;


        if (hardan.equals("Azerbaycan")&&hara.equals("Ermenistan")){
            System.out.println("xiar hara gedirsen");
        }
        else {
            System.out.println(enucuzbilet);
        }


        }
    }
