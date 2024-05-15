public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, String diachi, int tuoi, GioiTinh gioiTinh, String congViec) {
        super(hoTen, diachi, tuoi, gioiTinh);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", diachi='" + diachi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tuoi=" + tuoi +
                ", hoten='" + hoTen + '\'' +
                '}';
    }
}
