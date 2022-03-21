import homeworks.homework3model.Bug;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsMainApp {
    public static void main(String[] args) throws IOException {


        //WYJĄTKI - sytuacja wyjątkowe

        // 1. Dwa typy wyjątków (musimy łapać i nie musimy łapać)
        // 2. Łapanie wyjatkóww
        // 3. Rzucanie wyjątków
        // 4. Dodanie wyjątków do sygnatury metody
        // 5. Tworzenie własnycyh wyjątków

        // 1. Musimy łapać:
        // FileNotFoundException();
        // IOExcetpion();

        // 2. Nie musimy łapać - ale powinny być obsłużone przez programistę (NIE PRZECHWYCONY WYJĄTEK PRZEYRYWA WYKONYWANIE KODU)
        // IllegalStateExcetpion(); - gdy obiekt znajduje się w niepożądanym stanie,
        // UnsupportedOperationException(); - gdy będziemy mieli jakąś metodę natomiast w danej klasie ta metoda bedzie musiała być zapisana ale nie będziemy chcieli jej implementować


        // IllegalStateExcetpion();


        try { // dodajemy tu niebezpieczny kod
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }


 // w catchu może być więcej wpisów

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
            String line = bufferedReader.readLine();

            while(line !=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } // wyjątek będzi rzucony gdy z projektu usuniemy plik test.txt



        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt3"));
            String line = bufferedReader.readLine();

            while(line !=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally { // ten blok jest opcjonalny i wykona się zawsze, np. chcemy zamknąc połaćzenia z bazą danych
            System.out.println("TO WYKONA SIĘ ZAWSZE!!!");
        }



        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));
        } catch (Exception ex) {
            System.out.println(ex);
        }


        //  WYJĄTKI KTÓRYCH NIE TRZEBA ŁAPAĆ
//
//        Bug bug = new Bug("hhhh", new Reporter("a@ap.pl"), 1);
//        System.out.println(Bug.getBugDescription()); // konsola - hhhh
//
//        bug = null;
//        try {
//            System.out.println(Bug.getBugDescription());// konsola - nul pointer, bo referencja jest pusta, nie wskazuje na żaden obiekt
//        } catch(nullPointerException ex){
//            System.out.println("Poleciał null pointer");// konsola - zamiast wyjątka poleciął teskt z nawiasów
//        }



    // IndexOutOfBoundsException();

    List<String> names4 = new ArrayList<>();

    names4.add("Bartek"); // index =0
        System.out.println(names4.get(1)); // konsola - index out of bound excepiton



        List<String> names = new ArrayList<>();
        names.add("Bartek");
        names.add("Tomek");
        names.add("Marcin");

        //IllegalStateException

        names.stream()
                .filter(s->s.startsWith("A"))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Can not find any names with given parameters")); // KONSOLA - MESSAGE Z SOUT



       //IllegalArgumentException
// EXAMPLE
//        public void setEmail(String email) throws IllegalEmailFormatException {
//        if(email.contains("@")){
//            throw new IllegalAccessException("Incorrect email format");// lub throw IllegalFormatExeption - własny wyjątek z paczki exceptions
//        }else{
//            this.email=email;
//        }


//            User user = new User("a", "c", "c",11);
//            user.setEmail("aaa.pl");


//        UnsupportedOperetionException();
//        EXAMPLE
//                public inv volumeLevelUp(intVolumeLevel) {
//                    throw new UnsupportedOperationException("This method is not supported to PC");
//                }

















    }
}
