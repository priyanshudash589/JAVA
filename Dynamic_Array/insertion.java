package JAVA.Dynamic_Array;
import java.io.*;
import java.util.*;

public class insertion {
    public static void main(String[] args){
        int size = 5;
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> arr = new ArrayList<>(size);
        System.out.println("Enter the values into the ArrayList:");
        for(int i = 0; i < size; i++ ){
            arr.add(sc.nextInt());
        }
        System.out.println("The Elements in the arrlist are :-"+arr);
    }
}
