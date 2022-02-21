package computer;

import computer.Laptop;
import computer.PC;

public class MainAppComputer {

    public static void main(String[] args) {


        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.setConnected(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());


        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

        gamingLaptop.setBatteryLevel(0);

        officeComputer.showComputerName();


    }
}
