package homeworks.homework9;

import computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class homeworkNineMainApp {
    public static void main(String[] args) {

        List<Computer> computers=new ArrayList<>();
        computers.add(new Laptop("MB PRO 1","PRO 1",new Hdd("HP", 500), new Ram("HP", 128),100));
        computers.add(new Laptop("MB PRO 2","PRO 2",new Hdd("HP", 500), new Ram("HP", 128),100));
        computers.add(new Laptop("MB PRO 3","PRO 3",new Hdd("HP", 256), new Ram("HP", 128),100));
        computers.add(new Laptop("MB PRO 4","PRO 4",new Hdd("HP", 500), new Ram("HP", 128),100));
        computers.add(new PC("PC 1", "BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 2", "AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));


        //1. Zliczyć wszystkie komputery, które mają więcej niż 128 gb ramu
        //2. Wyświetlić na konsolę wszsytkie typy komputrerów - map
        //3. Wyświetlić komputer, któy ma najwięcej ramu
        //4. Utworzyć nową kolekcję z komuterami, któe mają dysk twardy mniejszy niż 500 gb
        //5. Posortować komputery po nazwie i po typie
        //6. Przećwiczyć optional





        //1. Zliczyć wszystkie komputery, które mają więcej niż 128 gb ramu

        long count = computers.stream()
                .filter(comp->comp.getRam().getSize()>128)
                .count();
        System.out.println(count);

        //2. Wyświetlić na konsolę wszsytkie typy komputrerów - map

        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        //3. Wyświetlić komputer, któy ma najwięcej ramu
        Computer computer =computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Can not find any computer"));
        System.out.println(computer.getName());

        //4. Utworzyć nową kolekcję z komuterami, któe mają dysk twardy mniejszy niż 500 gb

        List<Computer> collect =computers.stream()
                .filter(comp->comp.getHdd().getSize()<500)
                .collect(Collectors.toList());

        for (Computer comp : collect){
            System.out.println(comp.getName() + " " + comp.getHdd());

        }

         //5. Posortować komputery po nazwie i po typie

        List<Computer> sorted = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for(Computer comp : sorted){
            System.out.println(comp.getName() + " " + comp.getType());
        }


    }
}
