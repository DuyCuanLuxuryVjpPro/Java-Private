package Baitaptuan4;

import java.util.Scanner;

public class NhanVien1 {

    public static int cnt = 0;

    public int id;
    public String hoTen;
    public String kieuNV;
    public int ngayLam;
    public int namVao;

    public NhanVien1() {
        id = ++cnt;
    }

    public int getLuong() {
        if (kieuNV.equals("sx")) {
            return ngayLam * 350;
        }
        return ngayLam * 400;
    }

    public int getTroCap() {
        return (2023 - namVao) * 200 - 100;
    }

    public int getTongTien() {
        return getLuong() + getTroCap();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Kieu NV: ");
        kieuNV = sc.nextLine();
        System.out.print("Ngay lam: ");
        ngayLam = sc.nextInt();
        System.out.print("Nam vao: ");
        namVao = sc.nextInt();
    }

    public void xuat() {
        System.out.printf("%-5d%-25s%-20s%-10d%-10d%-10d%-10d%-10d\n",
                id, hoTen, kieuNV, ngayLam, namVao, getLuong(), getTroCap(), getTongTien());
    }

    public static void main(String[] args) {
        NhanVien1[] NV = new NhanVien1[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhan vien " + (i + 1) + ": ");
            NV[i] = new NhanVien1();
            NV[i].nhap();
        }
        
        System.out.printf("%-5s%-25s%-20s%-10s%-10s%-10s%-10s%-10s",
                "Id", "Ho ten", "Kieu NV", "Ngay lam", "Nam vao", "Luong", "Phu cap", "Tong");
        for (NhanVien1 x : NV)
            x.xuat();
    }
}
