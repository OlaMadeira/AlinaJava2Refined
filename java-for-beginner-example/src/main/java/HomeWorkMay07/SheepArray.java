package HomeWorkMay07;

import animal.Cat;
import animal.Sheep;

import java.util.ArrayList;

public class SheepArray {
    public static void sheepArray() {
        ArrayList<Sheep> sheepArrayList1 = new ArrayList<>();
        sheepArrayList1.add(new Sheep("01"));
        sheepArrayList1.add(new Sheep("02"));
        sheepArrayList1.add(new Sheep("03"));
        sheepArrayList1.add(new Sheep("04"));
        sheepArrayList1.add(new Sheep("05"));
        sheepArrayList1.add(new Sheep("06"));
        sheepArrayList1.add(new Sheep("07"));
        sheepArrayList1.add(new Sheep("08"));
        sheepArrayList1.add(new Sheep("09"));
        sheepArrayList1.add(new Sheep("10"));

        System.out.println("первый массив овец: " + sheepArrayList1.toString());

        ArrayList<String> sheepArrayList2 = new ArrayList<>();

        ArrayList<Sheep> sheepArrayListNew = new ArrayList<>();
        sheepArrayListNew.addAll(sheepArrayList1);
        sheepArrayListNew.add(new Sheep("101"));
        sheepArrayListNew.add(new Sheep("102"));
        sheepArrayListNew.add(new Sheep("103"));
        System.out.println("второй массив овец: " + sheepArrayListNew.toString());

        sheepArrayListNew.set(03, new Sheep("301"));
        sheepArrayListNew.set(04, new Sheep("302"));
        sheepArrayListNew.set(05, new Sheep("303"));
        sheepArrayListNew.set(06, new Sheep("304"));
        sheepArrayListNew.set(07, new Sheep("305"));
        System.out.println("второй массив овец обновлен: " + sheepArrayListNew.toString());

        for (Sheep sheep : sheepArrayListNew){
            System.out.println(sheepArrayListNew.contains(new Sheep("01")));

        }

    }

}


