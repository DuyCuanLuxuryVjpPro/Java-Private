package Baitaptuan1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        
        if (a == b && b == c && c == d)
            System.out.println("Khong ton tai so lon thu 2");
        else{
            int mx = a;
            if (mx < b) mx = b;
            if (mx < c) mx = c;
            if (mx < d) mx = d;
            
            int mx2 = -1;
            if (mx2 < a && a != mx) mx2 = a;
            if (mx2 < b && b != mx) mx2 = b;
            if (mx2 < c && c != mx) mx2 = c;
            if (mx2 < d && d != mx) mx2 = d;
            
            System.out.println(mx2);
        }
    }
}
