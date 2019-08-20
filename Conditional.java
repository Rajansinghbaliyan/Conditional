import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int flag=0;
        if(n%2==0)
        flag=0;
        else
        flag=1;
        if(flag==1)
        System.out.print("Weird");
        else if (n>2&&n<6)
        System.out.print("Not Weird");
        else if (n>6&&n<21)
        System.out.print("Weird");
        else if (n>20)
        System.out.print("Not Weird");

    }
}
