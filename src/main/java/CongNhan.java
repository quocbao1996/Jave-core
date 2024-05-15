public class CongNhan extends  CanBo {
    private int bac;

    public CongNhan(String hoTen, String diachi, int tuoi, GioiTinh gioiTinh, int bac) {
        super(hoTen, diachi, tuoi, gioiTinh);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", diachi='" + diachi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tuoi=" + tuoi +
                ", hoten='" + hoTen + '\'' +
                '}';
    }
}
