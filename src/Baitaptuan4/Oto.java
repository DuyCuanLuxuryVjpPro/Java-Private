package Baitaptuan4;

import java.util.Scanner;

public class Oto {
    private String chuSH, tenXe, hang;
    private double giaMua;
    private int namSD;
    
    public double getGiaHtai() {
        if (giaMua < 1e9) {
            return giaMua - giaMua*0.07*namSD;
        }
        else if (giaMua <= 2e9) {
            return giaMua - giaMua*0.05*namSD;
        }
        else {
            return giaMua - giaMua*0.04*namSD;
        }
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chu xe: ");
        chuSH = sc.nextLine();
        System.out.print("Ten xe: ");
        tenXe = sc.nextLine();
        System.out.print("Hang: ");
        hang = sc.nextLine();
        System.out.print("Gia mua: ");
        giaMua = sc.nextDouble();
        System.out.print("Nam su dung: ");
        namSD = sc.nextInt();
    }
    
    public void xuat() {
        System.out.printf("%-25s%-15s%-15s%-15f.2%-10d%-15.2f\n",
                chuSH, tenXe, hang, giaMua, namSD, getGiaHtai());
    }
    
    public static void inTieuDe() {
        System.out.printf("%-25s%-15s%-15s%-15s%-10s%-15s\n",
                "chuSH", "tenXe", "hang", "giaMua", "namSD", "giaHtai");
    }
    
    public static Oto[] sapXep(Oto[] input) {
        for (int i = 0; i < input.length; i++) 
            for (int j = i + 1; j < input.length; j++) 
                if (input[i].getGiaHtai() > input[j].getGiaHtai()) {
                    Oto tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
        return input;
    }
    
    public static void inDsXeHetHan(Oto[] input) {
        System.out.println("\nDanh sach xe het han: ");
        Oto.inTieuDe();
        for (Oto x : input) 
            if (x.getGiaHtai() < 0) x.xuat();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so Oto: ");
        Oto[] input = new Oto[sc.nextInt()];
        
        for (int i = 0; i < input.length; i++) {
            input[i] = new Oto();
            System.out.println("Oto " + (i + 1) + ": ");
            input[i].nhap();
        }
        
        System.out.println("\nDanh sach oto sau khi sap xep la: ");
        Oto.inTieuDe();
        input = Oto.sapXep(input);
        for (Oto x : input)
            x.xuat();
        
        Oto.inDsXeHetHan(input);
    }
}
