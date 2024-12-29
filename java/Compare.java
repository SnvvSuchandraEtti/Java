package myPackage; 
public class Compare { 
    public int getMax(int m,int n) 
    { 
        return m > n ? m : n; 
    } 
    public int getMin(int m, int n) 
    { 
        return m < n ? m : n; 
    } 
    public void checkEqual(int m, int n) 
    { 
        System.out.println(n == m ? "Equal" : "Not Equal"); 
    } 
}