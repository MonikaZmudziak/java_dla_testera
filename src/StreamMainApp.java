import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 ["Bartek", "Antek", "Tomek", "Filip", "Romek", "Franek", "Artur", "Feliks"] -> strem
 wyszukaj imiona zaczynajće się na F -> strem ["Filip", "Franek", "Feliks"]
 wyszukaj imiona, które zawierają literę K -> stream ["Franek", "Feliks"]
 wyszukaj imiona, które konczą się na literę S -> strem ["Feliks"]
 wyświetl wszytkie elementy


 2 Typy metod - metody pośrednie (wykonują jakąś operację i zwracają nowy strem) oraz metody terminalne (tzw. metoda końcowa,
 wykonywana po wszystkich metodach pośrednich, ta metody zwróci albo listę wartości albo wyświetli elementy na konsolę)


 Metody pośrednie - zwracają nowe streamy:
 filter - filtrowanie elementów
 map - przekształcanie elementów

 Metody terminalne - wykonywane jako ostanie, zwracają wartość, pozwalają zebrać wartości do kolekcji
 forEach - wyświetlanie elementów
 min | max | sum
 anyMatch | allMatch | noneMatch - sprawdzanie czy stream zawiera jakieś/wszystkie lub żadne wartości
 count
 collect - zbieranie elementów, ta metoda zwraca nową listę

 */

public class StreamMainApp {
    public static void main(String[] args) {






        List<String> names = new ArrayList<>();

        names.add("Bartek");
        names.add("Antek");
        names.add("Filiip");
        names.add("Tom");
        names.add("Franek");
        names.add("Feliks");
        names.add("Rk");
        names.add("Max");

        names.stream()// zmiana listy na strem
                .filter(str -> str.startsWith("F")) // wszystkie imiona na F
                .filter(str -> str.contains("k")) // imiona zawierające k
                .filter(str->str.endsWith("s")) // elementy konczące się na s
                .forEach(str-> System.out.println(str));


     /*
        LAMBDA
        f(x)=x+2
        f(2)=2+2
        funkcja(x) = x+2
        funckja(str)=str.startsWith("F")
        (str) = str.startWith("F")
        str = str.startWith("F")
        str->str.startWith("F")

      */

        names.stream()
                .map(str->str.toUpperCase()) //każdy element wielką literą
                .forEach(str-> System.out.println(str));


        names.stream()
                .filter(str->str.length()<= 3)
                .map(str-> "Short name: " + str)
                .forEach(str-> System.out.println(str));

        long count = names.stream()
                .filter(str -> str.length() <= 3)
                .count(); //introduce local varialbe - alt + enter
        System.out.println(count);


        //anyMatch

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));// zwraca boolean wiec alt+enter
        System.out.println(anyMatch);

        //allMatch

        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 2);
        System.out.println(allMatch); //Rk name

        //nonMatch
        boolean noneMatch = names.stream()
                .noneMatch(s ->s.endsWith("ski"));
        System.out.println(noneMatch);

        //collect
        List<String> fNames = names.stream()
                .filter(s -> s.startsWith("F"))
                .collect(Collectors.toList());//alt+enter
        System.out.println(fNames);


    }
}
