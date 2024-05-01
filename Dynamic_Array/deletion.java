package JAVA.Dynamic_Array;
import java.io.*;
import java.util.*;

public class deletion {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int size = 5;
        ArrayList<Integer> arr = new ArrayList<>(size);
        System.out.print("Enter the Element to be removed : ");
        int removeNum = sc.nextInt();
        System.out.println(removeNum);
        System.out.println("Enter the Elements into the arraylist :");
        for(int i = 0; i < size ; i++)
        {
            arr.add(sc.nextInt());

            if( i == removeNum)
            arr.remove(arr.get(i));
        }
        System.out.println("the array after removing the element is"+arr);
    }
}
