package Bai2;

public class Student {
    private static int numOfStudent;

    private int ID;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student(){
        this.ID = 0;
        this.name = "";
    }

    public Student(String name){
        this.name = name;
        this.ID = ++numOfStudent;
    }

    public String output(){
        return String.format("%d    -    %s", this.getID() ,this.getName());
    }




}
