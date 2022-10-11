package Bai4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Pham Ich Chuyen"));
        list.add(new Student("Tran Minh Quan"));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).output());
        }
        Student.getNumOfStudent();
    }
}
