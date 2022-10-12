package Bai6;

public class NgayCuaCha {
    private static int result = 0;
    private static int dayOfWeek = 7;
    public static int timNgayCuaCha(int nam) {
        // if (thang < 3) {
        //     thang = thang + 12;
        //     nam = nam - 1;
        //}
        
        int check = Math.abs(1 + 2 * 6 + (3 * (6 + 1) / 5) + nam + nam / 4) % 7;
        switch (check) {
            case 0:
                result = result + dayOfWeek*2 + 1;
                //System.out.println(result);
                break;
            case 1:
                result =  result + 7 + dayOfWeek*2;
                //System.out.println(result);
                break;
            case 2:
                result =  result + 6 + dayOfWeek*2;
                //System.out.println(result);
                break;
            case 3:
                result =  result + 5 + dayOfWeek*2;
                //System.out.println(result);
                break;
            case 4:
                result =  result + 4 + dayOfWeek*2;
                //System.out.println(result);
                break;
            case 5:
                result =  result + 3 + dayOfWeek*2;
                //System.out.println(result);
                break;
            case 6:
                result =  result + 2 + dayOfWeek*2;
                //System.out.println(result);
                break;
        }
        return result;
    }
}