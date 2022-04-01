package sesstion7.Assignment;

public class List {
    public String Ten;
    public Double Gia;
    public String DonVi;
    public Integer SoLuong;

    public List(String Ten, Double Gia, String DonVi, Integer SoLuong){
        this.Ten = Ten;
        this.Gia = Gia;
        this.DonVi = DonVi;
        this.SoLuong = SoLuong;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double gia) {
        Gia = gia;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String donVi) {
        DonVi = donVi;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }
    public String toString(){
        String s = "\n--------------------";
        s += "\n" + getTen();
        s += "\n" + getGia();
        s += getDonVi();
        s += "\n" + getSoLuong();
        return s;
    }
}
