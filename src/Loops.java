public class Loops {

    public static void main(String[] args) {

        //while - dopóki jakiś warunek zostanie spełniony dopóty ta pętla będzie się wykonywała, na początku sprawdzany
        // jest warunek i jeżeli ten warunek jest prawdziwy to wchodzimy do pętli

        int i = 10;

//        while (i < 20) {
//            System.out.println(i);
//            i++;  // aby uniknąć nieskończonej pętli
//        }



        // do while - zawsze przynajmniej raz wykona kod, który znajduje się w sekcji DO a dopiero potem jest sprawdzany warunek
        do{
            System.out.println("jestem w do");
            System.out.println(i);
            i++;
        } while (i  > 20);


    }
}
