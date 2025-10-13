import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    // Thêm sách
    public void themSach(Sach s) {
        danhSach.add(s);
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        danhSach.removeIf(s -> s.getMaSach().equals(maSach));
    }

    // Cập nhật sách
    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equals(maSach)) {
                danhSach.set(i, sachMoi);
                break;
            }
        }
    }

    // Tìm kiếm theo mã
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equals(maSach)) return s;
        }
        return null;
    }

    // Hiển thị tất cả
    public void hienThiDanhSach() {
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}