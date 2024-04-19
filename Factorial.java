package JAVA;
import java.util.*;
public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Factorial of a Number :");
        int n = sc.nextInt();
        Factorial obj = new Factorial();        
        System.out.println(obj.myFactorial(n));
        
    }

    int myFactorial(int a){
        int f = 1;
        for (int i = 1 ; i <= a ; i++){
            f = f*i;
        }
        return f;

    }
    
}



// import java.util.*;

// public class Factorial {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Factorial of a Number:");        
//         int n;        
//         n = sc.nextInt();                 
//         Factorial obj = new Factorial();
//         System.out.println("Factorial: " + obj.myFactorial(n));
//     }

//     int myFactorial(int a) {
//         int f = 1;
//         for (int i = 1; i <= a; i++) {
//             f = f * i;
//         }
//         return f;
//     }
// }

