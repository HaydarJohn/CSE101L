import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quiz2_20220808052
{
    public static void main(String[] args)
    {
        // Question 1
        System.out.println();
        // Question 2
        //lockerPuzzle(null);     // complete not checked
        // Question 3
        //isMarkovMatrix(null);   // complete not checked


        System.out.println(factorial(5));
    }

    public static String sort(String string)
    {
        char[] stringChar = string.toCharArray();
        int[] indexOrder = new int[stringChar.length];
        int tempIndex = (int)stringChar[0];
        for(int i =0;i<indexOrder.length;i++)
        {
            
        }
        return "";
    }

    public static int[] lockerPuzzle(boolean[] lockers)
    {
        for(int i =0; i<lockers.length;i++)
        {
            for(int j = 0; j < lockers.length;j++)
            {
                if(j % i == 0)
                {
                    lockers[j] = !lockers[j];
                }
            }
        }
        int openLockerNumber = 0;
        for(int i =0; i<lockers.length;i++)
        {
            if(lockers[i])
            {
                openLockerNumber++;
            }
        }
        int[] openLockerIndexArray = new int[openLockerNumber];
        int j = 0;
        for(int i =0; i<lockers.length;i++)
        {
            if(lockers[i])
            {
                openLockerIndexArray[j] = i;
                j++;
            }
        }
        return openLockerIndexArray;
    }
    public static boolean isMarkovMatrix(int[][] matrix)
    {
        for(int i =0; i<matrix.length;i++)
        {
            for(int j =0; j<matrix[i].length;j++)
            {
                if(matrix[i][j] <= 0)
                {
                    return false;
                }
            }
        }
        for(int i =0; i<matrix.length;i++)
        {
            int columnTotal = 0;
            for(int j =0; j<matrix[i].length;j++)
            {
                columnTotal += matrix[j][i];
            }
            if(columnTotal != 1)
            {
                return false;
            }
            columnTotal = 0;
        }
        return true;
    }

    public static void movingAverage(String sourceFileName , String destinationFileName,int windowSize)
    {
        try
        {
            File inputFile = new File(sourceFileName);
            File outputFile = new File(destinationFileName);
            Scanner scan = new Scanner(inputFile);
            PrintWriter write = new PrintWriter(outputFile);
            while (scan.hasNext())
            {
                write.print(scan.next() + " ");    
            } 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return factorial(n-1) * n;
    }

    public static boolean isPalindrome(String string)
    {
        if(string.length() < 4)
        {
            return string.charAt(0) == string.charAt(string.length()-1);
        }
        return isPalindrome(string.substring(1, string.length()-1));
    }

    public static String decimalToBinary(int number)
    {
        return "";
    }
}