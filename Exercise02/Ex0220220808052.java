import java.util.Scanner;

public class Ex0220220808052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Requirement 1

        int input = scan.nextInt();
        input = Math.abs(input);
        input /= 10;
        System.out.println(input%10);

        // Requirement 2

        int minutesSpent = scan.nextInt();
        if(minutesSpent/60 != 0)
        {
            System.out.println(50 *((minutesSpent / 60) + 1));
            System.out.println(60-(minutesSpent % 60));
        }
        else
        {
            System.out.println(50 * (minutesSpent / 60));
            System.out.println(0);
        }

        // Requirement 3

        int trialAmount = scan.nextInt();
        System.out.println("The probabilty of rolling the first 4 on trial "
         +trialAmount+" is" + 
         (Math.pow((1.0- (1.0/6.00)), (trialAmount - 1)) * (1.0/6.0)) );


    }
}
