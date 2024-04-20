package JAVA.Pattern;

public class pattern8 {
    public static void main(String[] args){
        /*
             *********
              *******
               *****
                ***
                 *
         */

         for(int i = 0 ; i <= 4 ; i++){
            for(int x = 0; x <=i; x++){
                System.out.print(" ");
            }

            for(int y = 9-(2*i); y>=1; y--){
                System.out.print("*");
            }
            System.out.println("");
         }
    }
}
