import java.util.*;
public class Main {
    public static void main(String[] args) {
        Konto konto2 = new Konto(2, 10000);
        Konto konto3 = new Konto(3, 10000);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to summoners rift");
        System.out.println("Create a new account? y or n");
        char choice1 = scan.nextLine().charAt(0);
        if(choice1 == 'y') {
            Konto konto1 = new Konto(1, 10000);
            while (true){
                System.out.println("What services would you like to use? 1: abheben | 2: einzahlen | 3: Kontos sehen");
                int choice2 = scan.nextInt();
                if (choice2 == 1){
                    System.out.println("You have "+konto1.getSaldo()+" CS on your account. \nHow much would you have in thy wallet?");
                    int betrag = scan.nextInt();
                    konto1.abheben(betrag);
                } else if(choice2 == 2){
                    System.out.println("How much do you want to einzahlen to your account?");
                    int betrag = scan.nextInt();
                    konto1.einzahlen(betrag);
                } else if(choice2 == 3){
                    System.out.println("Konto1: "+konto1.getKontoNum()+" Saldo: "+ konto1.getSaldo());
                    System.out.println("Konto1: "+konto2.getKontoNum()+" Saldo: "+ konto2.getSaldo());
                    System.out.println("Konto1: "+konto3.getKontoNum()+" Saldo: "+ konto3.getSaldo());
                }
            }
        }else{
            System.exit(0);
        }

    }
}