public class StaticMethodAndFieldsMainApp {
    public static void main(String[] args) {


//        StaticMethodStringUtils stringUtils = new StaticMethodStringUtils();
//        String monikaTekst = stringUtils.getFormattedText("MonikaTekst");
//        System.out.println(monikaTekst);
//
//
//        String monika = stringUtils.getFormattedText("Monika");
//        System.out.println(monika);


// użycie metod statycznych (bez tworzenia nowych obiektów)
        String monikaTest =StaticMethodStringUtils.getFormattedText("MonikaTekst");
        System.out.println(monikaTest);

        String monika = StaticMethodStringUtils.getFormattedText("Monika");
        System.out.println(monika);



        // static fields

        System.out.println(StaticFieldsWeekUtils.MONDAY);


    }
}
