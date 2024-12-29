import java.util.*;
import java.Arrays ;
import javax.swing.*;
import java.lang.Reflection;



 class Example20 {
    public static void printArray(String[] arr) {

    for (String s: arr){
    System.out.print(s + " ");
}
    }
    public static void printArray(Integer[] arr) {

        for (Integer s: arr){
        System.out.print(s + " ");
    }
        }
        public static void printArray(Double[] arr) {

            for (Double s: arr){
            System.out.print(s + " ");
        }
            }

    public class Main{
        public static void main (String[] args){
            Method[] methods = Example20.class.getDeclaredMethods();
            int cnt =0;
            for(Method n: methods){
                if (m.getName().equals("print Arrays")){
                    cnt++;
                }
            }
            if (cnt > 1){
                throw new RuntimeException("No Overloading is Allowed");
            }
            String[] arr = {"abc","xyz","pqr"};
            Integer[] arr1 = {10,20,30,40};
            Double[] arr2 = {12.6,56.3,99.5};
            Example20.printArray(arr);
            Example20.printArray(arr1);
            Example20.printArray(arr2);
            
            
        }
    } 
    }
