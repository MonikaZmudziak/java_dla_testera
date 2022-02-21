package computer;

public class PC extends Computer{

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram); // wywołanie konstruktora z klasy matki (wraz z parametrami z klasy matki)
    }


    public void showComputerName(){
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        super.switchOn(); // instead of --> state = true; super - wywołanie metody z klasy matki
    }
}
