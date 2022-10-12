package Bai6;

public class NgayCuaCha {
    private static int result = 0;
    private static int dayOfWeek = 7;
    public static int timNgayCuaCha(int nam) {
        // if (thang < 3) {
        //     thang = thang + 12;
        //     nam = nam - 1;
        //}
        
        int check = Math.abs(1 + 2 * 5 + (3 * (5 + 1) / 5) + nam + nam / 4) % 7;
        switch (check) {
            case 0:
                result = result + 1 + dayOfWeek;
                //System.out.println(result);
                break;
            case 1:
                result =  result + 1 + 6 + dayOfWeek;
                //System.out.println(result);
                break;
            case 2:
                result =  result + 1 + 5 + dayOfWeek;
                //System.out.println(result);
                break;
            case 3:
                result =  result + 1 + 4 + dayOfWeek;
                //System.out.println(result);
                break;
            case 4:
                result =  result + 1 + 3 + dayOfWeek;
                //System.out.println(result);
                break;
            case 5:
                result =  result + 1 + 2 + dayOfWeek;
                //System.out.println(result);
                break;
            case 6:
                result =  result + 1 + 1 + dayOfWeek;
                //System.out.println(result);
                break;
        }
        return result;
    }
}