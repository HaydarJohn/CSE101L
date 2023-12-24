import java.util.Scanner;

public class Ex0320220808052
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Requirement 1
        


        int mealID = scan.nextInt();
        int drinkID = scan.nextInt();
        int totalPrice = 0;
        String printStuff = "";
        switch(mealID)
        {
            case 1:
            {
                totalPrice +=80;
                printStuff += "Doner ";
            }break;
            case 2:
            {
                totalPrice += 110;
                printStuff += "Kebab ";
            }break;
            case 3:
            {
                totalPrice += 75;
                printStuff += "Lahmacun ";
            }break;
        }
        switch(drinkID)
        {
            case 1:
            {
                totalPrice += 10;
                printStuff += "Ayran ";
            }break;
            case 2:
            {
                totalPrice += 20;
                printStuff += "Kola ";
            }break;
            case 3:
            {
                totalPrice += 15;
                printStuff += "Salgam ";
            }break;
        }

        System.out.println(printStuff + totalPrice + " lira");

        // Requirement 2

        int internetType , internetUsage;
        internetType = scan.nextInt();
        internetUsage = scan.nextInt();
        if(internetType == 1)
        {
            if(internetUsage < 100)
            {
                System.out.println(80 * 1.15);
            }
            else
            {
                System.out.println((80 + (internetUsage - 100) * 3)*1.15);
            }
        }
        else
        {
            if(internetUsage < 200)
            {
                System.out.println(140 * 1.1);
            }
            else
            {
                System.out.println((140 + (internetUsage - 200) * 5)*1.1);
            }
        }

        // Requirement 3

        int attackType = scan.nextInt();
        int totalDamage;
        int coin1 = (int)(Math.random() * 2), coin2 = (int)(Math.random() * 2);
        System.out.println("cointoss: heads 0 tails 1 random 2");
        switch (scan.nextInt())
        {
            case 0:
            {
                coin1 = 1;
            }break;
            case 1:
            {
                coin1 = 0;
            }break;
            case 3:
            {
                
            }break;
        }
        System.out.println("cointoss: heads 0 tails 1 random 2");
        switch (scan.nextInt())
        {
            case 0:
            {
                coin2 = 1;
            }break;
            case 1:
            {
                coin2 = 0;
            }break;
            case 3:
            {
                
            }break;
        }
        if(attackType == 1)
        {
            if(coin1 == 1 && coin2 == 1)
            {
                System.out.println(60);
            }
        }
        else
        {
            totalDamage = 50;
            if(coin1 == 1)
            {
                totalDamage += 20;
                if(coin2 == 1)
                {
                    totalDamage += 20;
                }
            }
            System.out.println(totalDamage);
        }

    }
}