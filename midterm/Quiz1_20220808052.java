public class Quiz1_20220808052 
{

    public static void main(String[] args) 
    {
        //String a = generatePalindrome((int)(Math.random()*25+1));
        //System.out.println(a);
        //System.out.println(isPalindrome(a));
        System.out.println((int)'Z');
    }

    public static String generatePalindrome(int n)
    {
        String palindrome = "";
        boolean nEven = n%2 == 0;
        
        for(int i = 0; i< n/2;i++)
        {
            //65 - 90;
            palindrome = palindrome + (char)((int)(Math.random()*26)+(97));  
    
        }

        if(nEven)
        {
            return palindrome + reverse(palindrome);
        }
        else
        {
            return palindrome + (char)((int)(Math.random()*26)+(97)) + reverse(palindrome);
        }

    }

    public static String reverse(String str)
    {
        String reversed = "";

        for(int i = 0; i < str.length();i++)
        {
            reversed = reversed + str.charAt(str.length()-(i+1));
        }
        return reversed;
    }

    public static boolean isPalindrome(String str)
    {
        for(int i = 0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt((str.length()-1)-i))
            {   return false;   }
        }
        return true;
    }



    public static void compareNames(String name1 , String name2)
    {
        if(name1.length() == name2.length())
        {
            if(name1.equals(name2))
            {
                System.out.println("same");
            }
            else
            {
                System.out.println(name1.charAt(name1.length()-3));
            }
        }
        else
        {
            if(name1.contains(name2))
            {
                System.out.println("could not finish");
            }
            else if(name2.contains(name1))
            {
                System.out.println("could not finish");
            }
            else
            {
                System.out.println(name2.charAt(name2.length()-3));
            }
        }

    }

    public static void cylinder(int x ,int y,int h)
    {
        double radius = distance(x, y);
        double circleCircumference = circumference(radius);
        double circleArea = area(radius);
        double rectArea = area(circleCircumference, h);
        double totalArea = circleArea * 2 + rectArea;
        double volume = circleArea * h;
        double totatPerimeter = circleCircumference * 2 + perimeter(circleCircumference, h);
        System.out.printf("%.2f \t %.3f \t %.2f",totalArea,volume,totatPerimeter);

    }

    public static double calculatePI(int n)
    {
        if(n == -1)
        {   return Math.PI; }
        else if(n == 0)
        {   return 3;   }
        else
        {   
            double x = (int)(Math.PI * Math.pow(10, n));
            return x / Math.pow(10, n);
        }

    }

    public static double distance(int x , int y)
    {
        return Math.sqrt((x*x)+(y*y));
    }

    public static double area(double radius)
    {
        return calculatePI(0)*radius*radius;
    }
    public static double area(double width,double height)
    {
        return width * height;
    }

    public static double circumference(double radius)
    {
        return calculatePI(0) * radius * 2;
    }
    public static double perimeter(double width , double height)
    {
        return 2*(width + height);
    }








    public static boolean isLicensePlateValid(String plateNum)
    {
        // 48 - 57
        // 65 - 90
        int letterCount = 1;
        plateNum = plateNum.toUpperCase();
        if(48>=(int)plateNum.charAt(0)||(int)plateNum.charAt(0)>=57)
        {   return false;   }
        if (48>=(int)plateNum.charAt(1)||(int)plateNum.charAt(1)>=57) {
            return false;
        }
        if((int)plateNum.charAt(0)*10+(int)plateNum.charAt(1) >81 ||(int)plateNum.charAt(0)*10+(int)plateNum.charAt(1)<1)
        {
            return false;
        }

        //Yetistiremedim hocam :*(
        return true;


    }


    public static String weekDay(int n)
    {
        switch (n) {
            case 1:
            {   return "Monday";    }
            case 2:
            {   return "Tuesday";   }
            case 3:
            {   return "Wednesday"; }
            case 4:
            {   return "Thursday";  }
            case 5:
            {   return "Friday";    }
            case 6:
            {   return "Saturday";  }
            case 7:
            {   return "Sunday";    }
            default:
            {   return "invalid";   }
        }
    }




}