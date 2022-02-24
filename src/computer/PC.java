package computer;

public class PC extends Computer {

    private boolean isConnected;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram); // wywołanie konstruktora z klasy matki (wraz z parametrami z klasy matki)
        isConnected = true;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public void showComputerName() {
        System.out.println(name);
    }
    @Override
    public int volumeUp(){
        return volumeLevel+=1;
    }
    @Override
    public int volumeDown() {
        volumeLevel -=1;

        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }

    }



    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isConnected) {
            super.switchOn(); // instead of --> state = true; super - wywołanie metody z klasy matki
        } else {
            System.out.println("Connect your PC to electricity!");
        }
    }
}
