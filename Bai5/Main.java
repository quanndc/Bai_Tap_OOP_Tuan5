package Bai5;

public class Main {
    public static void main(String[] args){
        float tong = PhepToan.tong2PhanSo(new PhanSo(1, 2), new PhanSo(1, 2));
        System.out.println(tong);
        float tich = PhepToan.tich2PhanSo(new PhanSo(1, 2), new PhanSo(1, 2));
        System.out.println(tich);
    }
}
