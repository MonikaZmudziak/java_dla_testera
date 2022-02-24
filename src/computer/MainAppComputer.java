package computer;

import computer.Laptop;
import computer.PC;

public class MainAppComputer {

    public static void main(String[] args) {


        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);


        //Polymorphism

        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComptuer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop1 = new Laptop("XGames", "HP GAMES", 500, 256, 50);
        Computer mcbook = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        Computer[] computers ={officeComputer1, officeComputer2, officeComptuer3,gamingLaptop1, mcbook};

        for(Computer computer: computers){
            computer.switchOff();
        }
        //
        // Type casting

        ((PC)officeComputer2).showComputerName();

        //
        //Abstract methods
        System.out.println(officeComputer1.volumeUp());
        System.out.println(mcbook.volumeUp());

        System.out.println(officeComputer1.volumeDown());
        System.out.println(mcbook.volumeDown());
        //


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
