import enums.WeekDays;

public class EnumsMainApp {
    public static void main(String[] args) {


        System.out.println(WeekDays.SRODA.getName());

        if("Środa".equals(WeekDays.SRODA.getName())){ // bez .getName brałoby uwagę czy są polskie znaki i nie byłoby OK
            System.out.println("Jest OK");
        }else{
            System.out.println("Nie jest OK");
        }










    }
}
