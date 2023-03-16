package alvesmichel.bank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Bank santander = new Bank("0001");
        while(true){

            System.out.println("Please, choose the options below");
            System.out.println("[1]->ACCOUNT CREATE");
            System.out.println("[2]->EXIT");
            String op = scanner.nextLine();
            if(op.equals("1")){

                System.out.println("Fill you name: ");
                String name = scanner.nextLine();
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);

                operateAccount(account);

            }else if(op.equals("2")){

                System.out.println("See you later!");
                break;

            }else{

                System.out.println("Invalid option!");
            }

        }

        List<Account> accountList = santander.getAccounts();
        for (Account cc : accountList){
            System.out.println(cc);
        }
        santander.outputTotal();

    }
    static  void operateAccount(Account account){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please, choose the options below");
            System.out.println("[1]->DEPOSIT");
            System.out.println("[2]->WITHDRAW");
            System.out.println("[3]->EXIT");


            String op = scanner.nextLine();

            if(op.equals("1")){

                System.out.println("What amount will you deposit?");
                double valueD = scanner.nextDouble();
                account.deposit(valueD);

            } else if (op.equals("2")){

                System.out.println("What amount do you want to withdraw?");
                double valueW = scanner.nextDouble();
                account.withDraw(valueW);

            }else if(op.equals("3")){

                System.out.println("See you later!");
                break;

            }else{

                System.out.println("Invalid option!");
            }

            System.out.println((account));
            scanner = new Scanner(System.in);
        }

    }
}
