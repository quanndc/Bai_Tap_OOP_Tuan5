package Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //int n = 2;
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tran Minh Quan"));
        list.add(new Student("Pham Ich Chuyen"));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).output());
        }
    }
}
