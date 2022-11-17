package Baitaptuan4;

import java.util.Scanner;

public class SinhVien {

    private static int cnt = 0;

    private int maSV;
    private String hoTen;
    private String diaChi;
    private String dienThoai;
    private double diemSo;

    public SinhVien() {
        maSV = ++cnt;
        hoTen = "No name";
        diaChi = "Sao Hoa";
        dienThoai = "0000000";
        diemSo = 0;
    }

    public SinhVien(int maSV, String hoTen, String diaChi, String dienThoai, double diemSo) {
        this.maSV = ++cnt;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.diemSo = diemSo;
    }

    public void setHoTen(String hoTen) {
        if (hoTen.split("\\s").length < 2) {
            this.hoTen = "toi dai dot";
        } else {
            this.hoTen = hoTen;
        }
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDienThoai(String dienThoai) {
        if (dienThoai.length() != 7) {
            this.dienThoai = "0000000";
        } else {
            this.dienThoai = dienThoai;
        }
    }

    public void setDiemSo(double diemSo) {
        if (diemSo < 0) {
            this.diemSo = 0;
        } else if (diemSo > 10) {
            this.diemSo = 10;
        } else {
            this.diemSo = diemSo;
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Dien thoai: ");
        dienThoai = sc.nextLine();
        System.out.print("Diem so: ");
        diemSo = sc.nextDouble();
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public double getDiemSo() {
        return diemSo;
    }

    @Override
    public String toString() {
        return String.format("%-5d%-25s%-25s%-15s%-10.2f\n",
                maSV, hoTen, diaChi, dienThoai, diemSo);
    }

    public static void inTieuDe() {
        System.out.printf("%-5s%-25s%-25s%-15s%-10s\n",
                "maSV", "hoTen", "diaChi", "dienThoai", "diemSo");
    }

    public static SinhVien[] sapXepTheoDiem(SinhVien[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].getDiemSo() > input[j].getDiemSo()) {
                    SinhVien tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }
        return input;
    }

    public static SinhVien[] sapXepTheoTen(SinhVien[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                String sv1 = input[i].getHoTen();
                String sv2 = input[j].getHoTen();
                int i1 = sv1.length() - 1;
                int i2 = sv2.length() - 1;

                while (i1 != 0 && sv1.charAt(i1 - 1) != ' ') {
                    i1--;
                }
                while (i2 != 0 && sv2.charAt(i2 - 1) != ' ') {
                    i2--;
                }

                if (sv1.charAt(i1) > sv2.charAt(i2)) {
                    SinhVien tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }

        return input;
    }

    public static void timKiemTheoTen(String ten, SinhVien[] input) {
        System.out.println("Danh sach sinh vien co ten " + ten + ": ");
        for (SinhVien x : input) {
            if (x.getHoTen().equals(ten)) {
                System.out.println(x.toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so sinh vien: ");
        SinhVien[] SV = new SinhVien[sc.nextInt()];

        for (int i = 0; i < SV.length; i++) {
            System.out.println("Sinh vien " + (i + 1) + ": ");
            SV[i] = new SinhVien();
            SV[i].nhap();
        }

        int option;
        OUTER:
        while (true) {
            System.out.print(
                    "_______________________________________\n"
                    + "1. Danh sach thu tu dang dan cua diem.\n"
                    + "2. Tim kiem theo ten.\n"
                    + "3. Sap xep danh sach theo ten.\n"
                    + "4. Thoat khoi chuong trinh.\n"
                    + "_______________________________________\n"
                    + "Option: ");
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    SinhVien[] dsSV = SinhVien.sapXepTheoDiem(SV);
                    SinhVien.inTieuDe();
                    for (SinhVien x : dsSV) {
                        System.out.println(x.toString());
                    }   break;
                case 2:
                    System.out.print("Nhap ten can tim kiem: ");
                    
                    sc.nextLine();
                    SinhVien.timKiemTheoTen(sc.nextLine(), SV);
                    break;
                case 3:
                    SV = SinhVien.sapXepTheoTen(SV);
                    System.out.println("Da sap xep.");
                    break;
                default:
                    break OUTER;
            }
        }
    }
}
