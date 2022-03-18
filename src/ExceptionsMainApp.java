import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

        // 2. Nie musimy łapać
        // IllegalStateExcetpion();
        // IllegalArgumentException();
        // NullPointerExcetpion();
        // IndexOutOfBoundsException();
        // UnsupportedOperationException();


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




        BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));

    }
}
