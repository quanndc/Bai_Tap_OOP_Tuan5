package Bai6;

public class NgaySangThu {

    public static int chuyenNgangSangThu(int ngay, int thang, int nam){
        if(thang<3){
            thang = thang + 12;
            nam = nam - 1;
        }
        int result = Math.abs(ngay +2*thang + (3*(thang+1)/5) + nam + nam/4)%7;
        switch (result) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("WednesDay");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;  
        }
        return result;
    }
    
}
