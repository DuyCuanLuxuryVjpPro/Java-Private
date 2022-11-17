package Baitaptuan4;

import java.util.*;

public class NhanVien2 {

    private String hoTen, gioiTinh, diaChi;
    private int tuoi;
    private double soGio, soTien1h;

    public NhanVien2() {
    }

    public NhanVien2(String hoTen, String gioiTinh, String diaChi, int tuoi, double soGio, double soTien1h) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.soGio = soGio;
        this.soTien1h = soTien1h;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

    public void setSoTien1h(double soTien1h) {
        this.soTien1h = soTien1h;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getSoGio() {
        return soGio;
    }

    public double getSoTien1h() {
        return soTien1h;
    }

    public double getLuong() {
        return Math.min(soGio, 45) + Math.max(soGio - 45, 0) * 3 / 2;
    }

    public double getThue() {
        if (getLuong() > 300) {
            return getLuong() * 0.2;
        }
        return 0;
    }

    public void inThongTin() {
        System.out.printf("%-25s%-10d%-10s%-25s%-10.2f%-15.2f%-15.2f%-15.2f\n",
                hoTen, tuoi, gioiTinh, diaChi, soGio, soTien1h, getLuong(), getThue());
    }

    public static void inTieuDe() {
        System.out.printf("%-25s%-10s%-10s%-25s%-10s%-15s%-15s%-15s\n",
                "hoTen", "tuoi", "gioiTinh", "diaChi", "soGio", "soTien1h", "luong", "thue");
    }

    public static void themNV(List<NhanVien2> input) {
        NhanVien2 x = new NhanVien2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Thong tin nhan vien: ");

        System.out.print("Ho ten: ");
        x.setHoTen(sc.nextLine());
        System.out.print("Tuoi: ");
        x.setTuoi(sc.nextInt());
        System.out.print("Gioi tinh: ");
        sc.nextLine();
        x.setGioiTinh(sc.nextLine());
        System.out.print("Dia chi: ");
        x.setDiaChi(sc.nextLine());
        System.out.print("So gio: ");
        x.setSoGio(sc.nextDouble());
        System.out.print("So tien tren gio: ");
        x.setSoTien1h(sc.nextDouble());
        input.add(x);
    }

    public static void inDsThongTin(List<NhanVien2> input) {
        System.out.println("Danh sach nhan vien: ");
        NhanVien2.inTieuDe();
        for (NhanVien2 x : input) {
            x.inThongTin();
        }
    }

    public static void timKiemTheoTen(String ten, List<NhanVien2> input) {
        System.out.println("Danh sach nhan vien co ten " + ten + ": ");
        for (NhanVien2 x : input) {
            if (x.getHoTen().equals(ten)) {
                System.out.println(x.toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien2> NV = new ArrayList<>();

        int option;
        OUTER:
        while (true) {
            System.out.print(
                    "_______________________________________\n"
                    + "1. Them nhan vien.\n"
                    + "2. Hien thi danh sach nhan vien.\n"
                    + "3. Top 3 vjppro.\n"
                    + "4. Tim kiem theo ten.\n"
                    + "5. Thoat khoi chuong trinh.\n"
                    + "_______________________________________\n"
                    + "Option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    NhanVien2.themNV(NV);
                    break;
                case 2:
                    NhanVien2.inDsThongTin(NV);
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.print("Nhap ten can tim kiem: ");

                    sc.nextLine();
                    NhanVien2.timKiemTheoTen(sc.nextLine(), NV);
                    break;
                default:
                    break OUTER;
            }
        }
    }
}
