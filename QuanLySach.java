import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void hienThiTatCa() {
        System.out.println("=== DANH SACH SACH ===");
        for (Sach s : danhSach) {
            s.hienThiThongTin();
            System.out.println("-----------------------");
        }
    }

    public void timTheoMa(String ma) {
        boolean timThay = false;
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                s.hienThiThongTin();
                timThay = true;
                break;
            }
        }
        if (!timThay)
            System.out.println("Khong tim thay sach co ma: " + ma);
    }

    public void capNhatSoLuong(String ma, int soLuongMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong cho: " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay sach de cap nhat!");
    }

    public void xoaSach(String ma) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(ma)) {
                danhSach.remove(i);
                System.out.println("Da xoa sach co ma: " + ma);
                return;
            }
        }
        System.out.println("Khong tim thay sach de xoa!");
    }
}
