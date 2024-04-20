package JAVA.Pattern;

public class pattern7 {
    public static void main(String[] args){
        /*
                 *
                ***
               *****
              *******
             ********* 
         */

         for(int i= 1 ; i <=5; i++){
            for(int x = 5-1-i; x>=0 ; x--){
                System.out.print(" ");
            }
            for(int y = 1 ; y<=2*i-1; y++){
                System.out.print("*");
            }
            for(int x = 1; x>=0 ; x--){
                System.out.print(" ");
            }
            System.out.println("");
         }
    }
}
