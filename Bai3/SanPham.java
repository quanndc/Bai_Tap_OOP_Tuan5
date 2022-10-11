package Bai3;


public class SanPham {
    private static float tongTien;

    private float thanhTien;
    public float getThanhTien() {
        return thanhTien;
    }

    public String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float gia;
    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int soLuong;
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float tinhThanhTien(){
        return this.getGia()*this.getSoLuong();
    }

    public SanPham(String name, float gia, int soLuong){
        this.name = name;
        this.gia = gia;
        this.soLuong = soLuong;
        tongTien += this.tinhThanhTien();
    }

    public static float tinhTongTien(){
        return tongTien ;
    }

    public String output(){
        return String.format("%s      %.2f      %d     %.2f", this.getName(), this.getGia(), this.getSoLuong(), getThanhTien());
    }

}
