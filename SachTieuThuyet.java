public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean coSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean coSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.coSeries = coSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public boolean isCoSeries() {
        return coSeries;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("Co series: " + (coSeries ? "Co" : "Khong"));
    }
    
}
