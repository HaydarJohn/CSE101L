import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        //7

        final double PI = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();
        System.out.printf("%.2f \n",Math.pow(radius, 2)*PI);
    
        //8

        System.out.println("1000 max");
        int num = scan.nextInt();
        int total = 0;
        total += num % 10;
        num /= 10;
        total += num % 10;
        num /= 10;
        total += num%10;
        System.out.println(total);
    }
}
