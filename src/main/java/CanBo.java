public class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected GioiTinh gioiTinh;
    protected String diachi;

    public CanBo(String hoTen, String diachi, int tuoi, GioiTinh gioiTinh) {
        this.hoTen = hoTen;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoten='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
