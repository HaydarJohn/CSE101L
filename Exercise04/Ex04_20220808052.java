import java.util.Scanner;

public class Ex04_20220808052 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Requirement 1

        final double PI = Math.PI;
        
        int centX,centY,pointX,pointY;
        System.out.println("enter center coordinates");
        centX = scan.nextInt();
        centY = scan.nextInt();
        System.out.println("enter point cordinates");
        pointX = scan.nextInt();
        pointY = scan.nextInt();
        double radius = Math.sqrt(((pointX - centX)*(pointX - centX))
         + ((pointY - centY)*(pointY - centY)));

        
        double area = PI * (radius * radius);
        double perimeter = 2 * PI * radius;

        System.out.println(area);
        System.out.println(perimeter);

        // Requirement 2
        scan.nextLine();
        String nameString = scan.nextLine();
        nameString = nameString.trim();
        int spaceIndex = nameString.indexOf(' ');
        String firstName = nameString.substring(0, spaceIndex);
        String lastName = nameString.substring(spaceIndex+1,nameString.length());
        System.out.println(lastName + "," + firstName);
        
        // Requirement 3

        int dayNum = scan.nextInt();
        switch (dayNum) {
            case 1:
            {
                System.out.println("Monday");
            }break;
            case 2:
            {
                System.out.println("Tuesday");
            }break;
            case 3:
            {
                System.out.println("Wednesday");
            }break;
            case 4:
            {
                System.out.println("Thursday");
            }break;
            case 5:
            {
                System.out.println("Friday");
            }break;
            case 6:
            {
                System.out.println("Saturday");
            }break;
            case 7:
            {
                System.out.println("Sunday");
            }break;
        }

        // Requirement 4
        scan.nextLine();
        System.out.print("Enter the first city: ");
        String city1 = scan.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = scan.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = scan.nextLine();

        String smallest, middle, largest;

        if (city1.compareTo(city2) < 0) {
            if (city1.compareTo(city3) < 0) {
                smallest = city1;
                if (city2.compareTo(city3) < 0) {
                    middle = city2;
                    largest = city3;
                } else {
                    middle = city3;
                    largest = city2;
                }
            } else {
                smallest = city3;
                middle = city1;
                largest = city2;
            }
        } else {
            if (city2.compareTo(city3) < 0) {
                smallest = city2;
                if (city1.compareTo(city3) < 0) {
                    middle = city1;
                    largest = city3;
                } else {
                    middle = city3;
                    largest = city1;
                }
            } else {
                smallest = city3;
                middle = city2;
                largest = city1;
            }
        }

        System.out.println("Cities in ascending order:");
        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);

        // Requirement 5
        double height = scan.nextDouble();
        double base = scan.nextDouble();
        System.out.printf("%.3f",base*height*0.5);

        
    }
}