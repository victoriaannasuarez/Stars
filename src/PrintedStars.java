
    import java.util.Scanner;

    public class PrintedStars {

        public static void main(String[] args) {
            /*
             *
             * ____*
             * ___***
             * __*****
             * _*******
             * *********
             *
             *
             */

            Scanner sc = new Scanner(System.in);
            System.out.println("How many rows of stars?");
            int input = sc.nextInt();

            for(int rows = 1; rows <= input;  rows++) {
                for(int spaces = rows-1; spaces < input; spaces++) {
                    System.out.print(" ");
                }
                for(int stars = (rows + (rows-1)) ; stars> 0 ; stars--) {
                    System.out.print("*");
                }
                System.out.println();
            }



            //logic
            //n = 5
            //			5-1(4)			1 +    (1-1)   =1 star
            //row 1 has n-row spaces and row# + (row -n) of stars

            //			5-2(3)				2 + (2-1) = 3 stars
            //row 2 has n-row spaces and row# + (row-n) of stars

            //			5-3(2)				3 + (3-1) = 5 stars
            //row 3 has n-row spaces and row# + (row-n) of stars

            //			5-4(1)				4 + (4-1) = 7 stars
            //row 4 has n-row spaces and row# +(row-n) stars

            //			5-5(0)             5 + (5-1) = 9 stars
            //row 5 has n-row spaces and row# +(row-n) stars


        }



    }

