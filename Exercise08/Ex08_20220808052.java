import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08_20220808052{
    /*
     * Change the X's in the both file name and class' name to your own
     * student number and submit your file to the assignment given through
     * Teams.
     * 
     * if you do NOT submit your assignment in time, you will recieve 0
     * if your file has compile time errors, and do not compile you will recieve 10
     * if your file does compile but a runtime error occurs, you will recieve 20
     * You MUST NOT change the method headers and comply with their return types
     * 
     * Main method is just there for you to test your program, you will not be evaluated by your main method
     * You can write any method you like, and use them in suitable places but you will only be graded
     * for your work for the questions
     */
    public static void main(String[] args) {
    }

    // Question 1: Log unspecified number of integers
    public static void intLogger(String filename) {
        /*
         * Write a method that logs all integers entered to the console.
         * Your method must handle FileNotFoundException and 
         * InputMismatchException exceptions. 
         * Exception handling message should take only one line in console.
         * 
         * Each input has to be logged in separate line.
         * If non-integer number entered to the console: log it as
         * "non-integer-input" (without ") to the text file (specified 
         * with filename). And continues to take inputs.
         * Take inputs until 0 entered. (log 0 too.)
         * 
         * Args:
         *      filename: String that specifies the target log file.
         */

         // Your code goes here...

        File printFile = new File(filename);
        try 
        {
            
            PrintWriter printer = new PrintWriter(printFile);
            Scanner scan =  new Scanner(System.in);
            while (true) 
            {
                try
                {
                    int a = scan.nextInt();
                    printer.println(a);
                    if(a == 0)
                    {
                        return;
                    }
                }
                catch (InputMismatchException IME)
                {
                    printer.println("non-integer-input");
                    continue;
                }  
            } 
        }
        catch (FileNotFoundException FNFE) 
        {
            System.out.println(FNFE.getMessage());
        }
    }

    // Question 2: Read Integers from the Log File.
    public static int[] intReader(String filename) {
        /*
         * Write a method that reads all integers from the log file 
         * you created in the previous Question 1.
         * Your method must handle FileNotFoundException and 
         * InputMismatchException exceptions. 
         * Exception handling message should take only one line in console.
         * 
         * Args:
         *      filename: String that specifies the target log file.
         * Returns:
         *      int[]: Integer Array that stores the integers in the
         *          log file.
         */

         // Your code goes here...
         File readFile = new File(filename);
         
        
         try
         {
            int lineCount = countLinesFromFile(readFile);
            if(lineCount == -1)
            {
                throw new FileNotFoundException();
            }
            int[] arr = new int[lineCount];
            Scanner scan = new Scanner(readFile);
            int i = 0;
            while (scan.hasNext())
            { 
                try
                {
                    arr[i] = scan.nextInt();
                    i++;
                }
                catch(InputMismatchException IME)
                {
                    System.out.println(IME.getMessage());
                    continue;
                }   
            }
            return arr;
         }
         catch (FileNotFoundException FNFE)
         {
            System.out.println(FNFE.getMessage());
         }
         return null;
    }

    // Question 3: Replace Specific Numbers in the Log File
    public static void replaceNumbers(String filename, int oldNum, int newNum) {
        /*
         * Write a method that replaces the numbers in the log file
         * you created in Question 1.
         * Your method must handle FileNotFoundException
         * Exception handling message should take only one line in console.
         * Your method must replace the exact numbers into the new number.
         * Example: oldNum=100 newNum=255: All 100s will replaced with
         *  255 but 1000s stays same. (1000 should not be replaced to 2550)
         * 
         * Args:
         *      filename: String that specifies the target log file.
         *      oldNum: The Number to be replaced in the log file.
         *      newNum: The Number to be replaced in the log file.
         */

         // Your code goes here...

        File replaceFile = new File(filename);

        try
        {
            Scanner scan = new Scanner(replaceFile);
            int lineCount = countLinesFromFile(replaceFile);
            if(lineCount == -1)
            {
                throw new FileNotFoundException();
            }
            String[] resultString = new String[lineCount];
            int i = 0;
            while (scan.hasNext())
            {
                String temp = scan.next();
                if(Integer.toString(oldNum).equals(temp))
                {
                    temp = Integer.toString(newNum);
                }
                resultString[i] = temp;
            }
            scan.close();
            PrintWriter filePrinter = new PrintWriter(replaceFile);
            for(i = 0;i<lineCount;i++)
            {
                filePrinter.println(resultString[i]);
            }
            filePrinter.close();
            
        }
        catch(FileNotFoundException FNFE)
        {
            System.out.println(FNFE.getMessage());
        }

         


    }

    /*
     * Example Pokémon Data:
        Name Type1 Type2 HP Attack Defense Sp.Atk Sp.Def Speed
        Bulbasaur Grass Poison 45 49 49 65 65 45
        Ivysaur Grass Poison 60 62 63 80 80 60
        Venusaur Grass Poison 80 82 83 100 100 80
        Charmander Fire null 39 52 43 60 50 65
        Charmeleon Fire null 58 64 58 80 65 80
        Charizard Fire Flying 78 84 78 109 85 100
        Squirtle Water null 44 48 65 50 64 43
        Wartortle Water null 59 63 80 65 80 58
        Blastoise Water null 79 83 100 85 105 78
        Caterpie Bug null 45 30 35 20 20 45
        Metapod Bug null 50 20 55 25 25 30
        Butterfree Bug Flying 60 45 50 90 80 70
        Weedle Bug Poison 40 35 30 20 20 50
        Kakuna Bug Poison 45 25 50 25 25 35
        Beedrill Bug Poison 65 90 40 45 80 75 
        Pidgey Flying Normal 40 45 40 35 35 56
     */

    // Question 4: Read and Sort Pokémon Stats Data 
    public static void readSortPokeStats(String datafile, String sortedfile) {
        /*
         * Write a method that reads pokemon data from a file and sort pokémons
         *  by their total base stats in descending order and writes the sorted
         *  data on a new file in the same format.
         * Data Header in the file is: "Name Type1 Type2 HP Attack Defense Sp.Atk Sp.Def Speed"
         * Your method must handle FileNotFoundException
         * Exception handling message should take only one line in console.
         * 
         * 
         * Args:
         *      datafile: String that specifies the target data file.
         *      sortedfile: String that specifies the new data file that 
         *          will contain the sorted data.
         * 
         */

         // Your code goes here...


         //take from index 0 to 8
    }

    // Question 5: Read and Filter Pokémon Stats Data by Type
    public static String[] readFilterPokeType(String filename, String poketype) {
        /*
         * Write a method that reads pokemon data from a file and filters
         *  the pokémons with the specified type and returns the names
         *  of the pokémons with specified types as String Array
         * Example: For the data above, poketype="Flying": the output 
         *  should be ["Charizard", "Butterfree", "Pidgey"]
         * Exception handling message should take only one line in console.
         * 
         * Args:
         *      filename: String that specifies the target data file.
         *      poketype: String that represents the target Pokémon type.
         *          (Do not print a message for non-existant Pokémon types
         *          just return an empty string array in that case.)
         * 
         * Returns:
         *      String[]: String that contains the Pokémon names of the specified type.
         * 
         */

         // Your code goes here...
    }

    // Question 6: Read and Filter Pokémon Stats Data by Highest Speed Stat
    public static void readFilterPokeStats(String filename) {
        /*
         * Write a method that reads pokemon data from a file and filters
         *  and prints the 5 pokémons with the highest Speed stat along
         *  with the data header to the console.
         * Print them with their stats without sorting.
         * Exception handling message should take only one line in console.
         * 
         * Args:
         *      filename: String that specifies the target data file.
         * 
         */

         // Your code goes here...
    }

    /////////////// HELPER METHODS ////////////////////////////

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }

    public static void display(char[] array) {
        for (int i : array) {
            System.out.printf("%c\t", i);
        }
        System.out.println();
    }

    public static void display2D(int[][] array2D) {
        for (int[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }


    public static void display2D(char[][] array2D) {
        for (char[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static int[][] generateArray2D(int m, int n, int start, int end) {
        int[][] array2D = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = random(start, end);
            }
        }

        return array2D;
    }

    public static int random(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    // MY Helper methods

    public static int countLinesFromFile(File file)
    {
        try
        {
            Scanner scan = new Scanner(file);
            int result = 0;
            while (scan.hasNextLine())
            {
                result++;
                scan.hasNextLine();   
            }    
            return result;
        }
        catch (FileNotFoundException FNFE)
        {
            System.out.println(FNFE.getMessage());
            return -1;
        }
    }
}

//aybuke