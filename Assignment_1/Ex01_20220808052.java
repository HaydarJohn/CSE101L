public class Ex01_20220808052 {
    public static void main(String[] args) {

        // exercise 1

        int n = 1;
        System.out.println("a\ta^2\ta^3");
        System.out.println(n+"\t"+n*n+"\t"+n*n*n);
        n = 2;
        System.out.println(n+"\t"+n*n+"\t"+n*n*n);
        n=3;
        System.out.println(n+"\t"+n*n+"\t"+n*n*n);
        n = 4;
        System.out.println(n+"\t"+n*n+"\t"+n*n*n);


        // exercise 2

        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        //exercise 3
        
        System.out.println(4 * (1.0  - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.println(4 * (1.0  - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));

        // exercise 4

        final double PI = ((4 * (1.0  - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11)) 
            + (4 * (1.0  - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13)))/2;


        System.out.println("Area = " + (5.5*5.5*PI));
        System.out.println("Perimeter = "+ (5.5 * 2 *PI));


        
        // exercise 5
 
        //  3.4x + 50.2y = 44.5
        // ---------------------
        //  44.5    44.5
        //
        //  2.1x + .55y = 5.9


       
        System.out.println("x equals to " + ((44.5*0.55 - 50.2 * 5.9)/(3.4*0.55-50.2*2.1)) + "\ny equals to " + ((3.4*5.9-44.5*2.1)/(3.4 * 0.55 - 50.2* 2.1)));
        


 
    }
}
