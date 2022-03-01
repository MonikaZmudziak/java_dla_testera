package computer;

import computer.Laptop;
import computer.PC;

public class MainAppComputer {

    public static void main(String[] args) {

//
//        PC officeComputer = new PC("Office computer", "HP", 500, 128);
//        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
//        Laptop laptop = new Laptop ("Laptop", "HP", 500, 256, 50);
//
//
//        //Polymorphism
//
//        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
//        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
//        Computer officeComptuer3 = new PC("Office computer 3", "HP", 500, 128);
//        Computer gamingLaptop1 = new Laptop("XGames", "HP GAMES", 500, 256, 50);
//        Computer mcbook = new Laptop("XGames", "HP GAMES", 500, 256, 50);
//
//        Computer[] computers ={officeComputer1, officeComputer2, officeComptuer3,gamingLaptop1, mcbook};
//
//        for(Computer computer: computers){
//            computer.switchOff();
//        }
//        //
//        // Type casting
//
//        ((PC)officeComputer2).showComputerName();
//
//        //
//        //Abstract methods
//        System.out.println(officeComputer1.volumeUp());
//        System.out.println(mcbook.volumeUp());
//
//        System.out.println(officeComputer1.volumeDown());
//        System.out.println(mcbook.volumeDown());
//        //
//
//
//        officeComputer.switchOn();
//        System.out.println(officeComputer.getState());
//
//        officeComputer.setConnected(true);
//        officeComputer.switchOn();
//        System.out.println(officeComputer.getState());
//
//
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getState());
//
//        gamingLaptop.setBatteryLevel(0);
//
//        officeComputer.showComputerName();
//
//
//    // Interface
//
//        laptop.playMusic();
//        laptop.pauseMusic();
//        laptop.stopMusic();
//
//        laptop.sayHello();
//
//
//        laptop.playVideo();
//        laptop.pauseVideo();
//        laptop.stopVideo();
//
//        laptop.sayHello();



        //Composition

        Hdd hdd = new Hdd ("Samsung", 500);
        Ram ram = new Ram("AAA", 128);

        Computer mac = new Laptop("Mac", "Pro", hdd, ram, 100); //an  object created with a composition
        System.out.println(mac.getRam().getSize());

        // or  Computer mac = new Laptop("Mac", "Pro", hdd, new Ram("AAA", 128), 100);

    }
}
