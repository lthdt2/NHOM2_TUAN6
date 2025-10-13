public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia, int namXB, double gia, String monHoc) {
        super(maSach, tenSach, tacGia, namXB, gia);
        this.monHoc = monHoc;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Môn học: " + monHoc);
    }
}
