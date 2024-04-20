package JAVA.Pattern;

public class pattern11 {
    public static void main (String[] args) {
        /*
              1
              10
              101
              1010
              10101
         */
        for(int i=5; i>=1;i--){
            for(int j=i; j<=5;j++){
                if(j%2==0)
                System.out.print(0);
                else
                System.out.print(1);
            }
            System.out.println("");
        }
    }
}
