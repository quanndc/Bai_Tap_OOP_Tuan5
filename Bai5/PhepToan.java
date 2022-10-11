package Bai5;

public class PhepToan {
    public static float tong2PhanSo(PhanSo x, PhanSo y){
        return (float) (((float) x.getTuSo()/x.getMauSo()) + ((float) y.getTuSo()/y.getMauSo()));
    }

    public static float tich2PhanSo(PhanSo x, PhanSo y){
        return (float) (((float) x.getTuSo()/x.getMauSo()) * ((float) y.getTuSo()/y.getMauSo()));
    }
}
