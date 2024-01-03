public class Lab12
{
    public static void main(String[] args)
    {
        
    }

    public static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n == 1)
        {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static int sumOfArray(int[] arr,int n)
    {
        if(n == 0)
        {
            return arr[0];
        }
        return arr[n] + sumOfArray(arr, n-1);
    }

}
