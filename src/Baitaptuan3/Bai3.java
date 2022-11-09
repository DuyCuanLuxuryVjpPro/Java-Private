package Baitaptuan3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int cnt = 0;
        double sum = 0.0;
        for (int i = 0; i < s.length(); i++){
            int x = s.charAt(i);
            if ((int)'0' <= x && x <= (int)'9'){
                sum += x - (int)'0';
                cnt++;
            }
        }
        
        if (cnt == 0)
            System.out.println("false");
        else{
            System.out.println("true\n" + sum/cnt);
        }
    }
}
