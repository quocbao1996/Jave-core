public class KySu extends  CanBo {
    private String nghanhDaotao;

    public KySu(String hoten, String diachi, int tuoi, GioiTinh gioiTinh, String nghanhDaotao) {
        super(hoten, diachi, tuoi, gioiTinh);
        this.nghanhDaotao = nghanhDaotao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "hoten='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diachi='" + diachi + '\'' +
                ", nghanhDaotao='" + nghanhDaotao + '\'' +
                '}';
    }
}
