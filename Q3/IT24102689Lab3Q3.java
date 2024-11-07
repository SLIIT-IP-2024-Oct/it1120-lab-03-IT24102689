import java.util.Scanner;

public class IT24102689Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = input.nextInt();

        int count5000 = amount / 5000;
        amount %= 5000;

        int count1000 = amount / 1000;
        amount %= 1000;

        int count500 = amount / 500;
        amount %= 500;

        int count200 = amount / 200;
        amount %= 200;

        int count100 = amount / 100;
        amount %= 100;

        int count50 = amount / 50;
        amount %= 50;

        int count20 = amount / 20;
        amount %= 20;

        int count10 = amount / 10;
        amount %= 10;

        int count5 = amount / 5;
        amount %= 5;

        int count2 = amount / 2;
        amount %= 2;

        int count1 = amount / 1;
        amount %= 1;
         
        System.out.println("5000 Notes =" + count5000);
        System.out.println("1000 Notes = " + count1000);
        System.out.println("500 Notes = " + count500);
        System.out.println("200 Notes = " + count200);
        System.out.println("100 Notes = " + count100);
        System.out.println("50 Notes = " + count50);
        System.out.println("20 Notes = " + count20);
        System.out.println("10 Coins = " + count10);
        System.out.println("05 Coins = " + count5);
        System.out.println("02 Coins = " + count2);
        System.out.println("01 Coins = " + count1);
    }
}
