package alvesmichel.bank;

import java.util.Arrays;

public class App {

    public static  void  main(String[] args){

        Account account = new Account("3287", "1234", "Michel Alves");
        System.out.println(account.getName());
        System.out.println(account.getAg());
        account.deposit(-1000);
        account.deposit(1000);
        account.deposit(1000);
        account.withDraw(600);

    }
}
