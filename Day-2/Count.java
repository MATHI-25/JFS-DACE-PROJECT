import java.lang.System;
public class Count{
    public static void main(String[] args) {
        int n=1528;
        int count=0;
        for(int i=n;i>0;i=i/10)
        {
            count++;
        }
        System.out.println("Number of digits = " + count);
    }
}