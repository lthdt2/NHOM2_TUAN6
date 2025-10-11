public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Thêm sách giáo trình
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giai Tich 1", "Nguyen Van A", 2020, 10, "Toan hoc", "Dai hoc");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Vat Ly Co Ban", "Tran Thi B", 2021, 12, "Vat ly", "Pho thong");

        // Thêm sách tiểu thuyết
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 1997, 20, "Gia tuong", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Nha Gia Kim", "Paulo Coelho", 1988, 15, "Triet ly", false);

        // Thêm vào danh sách quản lý
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        ql.hienThiTatCa();

        System.out.println("\n=== TIM SACH THEO MA 'TT01' ===");
        ql.timTheoMa("TT01");

        System.out.println("\n=== CAP NHAT SO LUONG 'GT02' ===");
        ql.capNhatSoLuong("GT02", 99);
        ql.hienThiTatCa();

        System.out.println("\n=== XOA SACH 'TT02' ===");
        ql.xoaSach("TT02");
        ql.hienThiTatCa();
    }
}

