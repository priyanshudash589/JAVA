package JAVA.Pattern;

public class pattern12 {
    public static void main(String[] args) {
        /*
         * 1      1
         * 12    21
         * 123  321
         * 12344321 
         */

         for (int i = 1; i<=4; i++){
            for(int x=1; x<=i;x++){
                System.out.print(x);
            }
            for(int y=6 ; y>=0 ; y-=2){
                System.out.print(" ");
            }
            for(int z=1; z<=i; z++){
                System.out.print(z);
            }
            System.out.println("");
         }
    }
}
