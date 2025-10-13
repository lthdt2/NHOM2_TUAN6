public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A", 2022, 10, "Công nghệ thông tin", "Đại học");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Đồi gió hú", "Emily Bronte", 2005, 5, "Lãng mạn", false);

        ql.themSach(gt1);
        ql.themSach(tt1);

        System.out.println("=== Danh sách sách ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== Tìm kiếm mã TT01 ===");
        System.out.println(ql.timKiemSach("TT01"));

        System.out.println("\n=== Xóa sách GT01 và hiển thị lại ===");
        ql.xoaSach("GT01");
        ql.hienThiDanhSach();
    }
}