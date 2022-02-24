package computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram); // wywołanie konstruktora z klasy matki (wraz z parametrami z klasy matki)// to musi byc w pierwszej linijce w konstruktorze
        this.batteryLevel = batteryLevel;
    }

    @Override
    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;

        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }

    }


    //Homework


    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
            return volumeLevel;

    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
            return volumeLevel;

    }
    //


    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn(); // instead of -> state = true; super- wywołanie metody z klasy matki)
        } else {
            System.out.println("Battery level to low!");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
