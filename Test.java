public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // 🔹 Tạo các đối tượng sách (chú ý đúng thứ tự tham số)
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Toán Cao Cấp", "Nguyễn Văn A", 2020, 50000, "Toán học");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 2019, 30000, "Thiếu nhi");

        // 🔹 Thêm sách vào danh sách
        ql.themSach(gt1);
        ql.themSach(tt1);

        System.out.println("=== Danh sách tất cả sách ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== Tìm sách có mã TT01 ===");
        ql.timSach("TT01");

        System.out.println("\n=== Xóa sách GT01 ===");
        ql.xoaSach("GT01");

        System.out.println("\n=== Danh sách sau khi xóa ===");
        ql.hienThiDanhSach();
    }
}
