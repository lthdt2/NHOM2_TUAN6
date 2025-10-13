public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia, int namXB, double gia, String theLoai) {
        super(maSach, tenSach, tacGia, namXB, gia);
        this.theLoai = theLoai;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thể loại: " + theLoai);
    }
}
