package enums;

public enum WeekDays {
    // przechowujemy w enumie tylko stałe (pisane wielką literą)
    //Enum - typ wyliczeniowy

    PONIEDZIALEK("Poniedziałek"),
    WTOREK("Wtorek"),
    SRODA("Środa"),
    CZWARTEK("Czwartek"),
    PIATEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String Name;

    WeekDays(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
