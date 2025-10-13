import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private double gia;

    // 🔹 Constructor mặc định (rỗng)
    public Sach() {
    }

    // 🔹 Constructor đầy đủ tham số
    public Sach(String maSach, String tenSach, String tacGia, int namXB, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.gia = gia;
    }

    // 🔹 Getter và Setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // 🔹 Nhập thông tin sách
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        namXB = sc.nextInt();
        System.out.print("Nhập giá: ");
        gia = sc.nextDouble();
    }

    // 🔹 Hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("---- Thông tin sách ----");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXB);
        System.out.println("Giá: " + gia);
    }

    // 🔹 Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               ", Tên sách: " + tenSach +
               ", Tác giả: " + tacGia +
               ", Năm XB: " + namXB +
               ", Giá: " + gia;
    }
}
