package Bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<SanPham> list = new ArrayList<>();
        list.add(new SanPham("Dui ga", 20000, 1));
        list.add(new SanPham("Canh ga", 30000, 1));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).output());
        }

        System.out.println(SanPham.tinhTongTien());
        //System.out.println(sp1.output());
    }
}
