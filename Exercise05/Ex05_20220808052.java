import java.util.Scanner;

public class Ex05_20220808052 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(computePI(scan.nextInt()));
        System.out.println(factorial(scan.nextInt()));
        System.out.println(isPrime(scan.nextInt()));
        nPrimes(69);
        System.out.println(isPerfect(scan.nextInt()));
        nPerfectNumbers(scan.nextInt());
        displayStatistics(9, scan);
    }

    public static double computePI(int stepNum)
    {
        if(stepNum == 0)
        {   return 3;   }
        double result = 1;
        for(int i = 0;i<stepNum;i++)
        {   
            if(i%2 == 0)
            {
                result -= 1.0/(2.0*(i+2)-1);
            }
            else
            {
                result += 1.0/(2.0*(i+2)-1);
            }
        }
        return 4*result;

    }

    public static int factorial(int num)
    {
        int result = 1;
        for(int i = 0;i<num;i++)
        {
            result *= i+1; 
        }
        return result;
    }

    public static boolean isPrime(int num)
    {   
        int temp = 2;
        if(num == 1)
        {   return false;    }
        if(num == 2)
        {   return true;    }
        while (temp < 1+Math.sqrt(num))
        {
            if(num%temp == 0)
            {
                return false;
            }
            temp++;
        }
        return true;
    }
    public static void nPrimes(int num)
    {
        int counter = 0;
        for(int i = 0;counter<num;i++)
        {
            if(isPrime(i+1))
            {
                System.out.println(i+1);
                counter++;
            }
        }
    }


    

    public static boolean isPerfect(int num)
    {
        
        
        //make a for loop
        //outside of the loop make a temp integer
        //if num divided by i   temp += i
        // stop before our num
        //check if temp == num


        if(num == 1)
        {   return false;   }
        if(num == 2)
        {   return false;   }

        int temp = 0;
        for(int i = 1;i<num;i++)
        {
            if(num%i == 0)
            {   temp += i;  }
        }
        return temp==num;
    }

    public static void nPerfectNumbers(int num)
    {
        int counter = 0;
        for(int i = 0;counter<num;i++)
        {
            if(isPerfect(i+1))
            {
                System.out.println(i+1);
                counter++;
            }
        }

    }

    public static void displayStatistics(int n,Scanner scan)
    {
        double[] nums = new double[n]; 
        double total = 0;
        double mean , deviation;
        for(int i = 0;i<n;i++)
        {
            nums[i] = scan.nextDouble();
            total += nums[i];
        }
        mean = total/n;
        deviation = calcDeviation(n,total, nums);
        System.out.printf("%.2f \t %.5f",mean,deviation);
    }

    public static double calcDeviation(int n,double totalNums,double[] nums)
    {
        double total = 0;
        for(int i = 0;i<n;i++)
        {
            total += Math.pow(nums[i], 2);
        }

        return Math.sqrt((total - Math.pow(totalNums, 2)/n)/(n-1));

    }


}