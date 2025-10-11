public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String capHoc , String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capHoc = capHoc;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public String getCapHoc() {
        return capHoc;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monHoc);
        System.out.println("Cap hoc: " + capHoc);
    }
}
