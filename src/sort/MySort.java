package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MySort {

    static boolean loop = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Shoe> Shoes = new ArrayList<>();

//     
//        while (loop) {
//            mainMenu();
//        }
//
//    }
//
//    private static void mainMenu() {
//        System.out.println("1.SortbyColourA");
//        System.out.println("2.SortbyColourD");
//        System.out.println("3.SortbySizeA");
//        System.out.println("4.SortbySizeD");
//        System.out.println("5.SortbypriceA");
//        System.out.println("6.SortbypriceD");
//        System.out.println("0.Exit");
//        System.out.println("\nmake a choice");
//
//        int choice = sc.nextInt();
//        sc.nextLine();
//
//        switch (choice) {
//            case 0:
//                loop = false;
//                break;
//                
//            case 1: MySort.mainMenu();
//            break;
//            
        Shoes.add(new Shoe(500, "Grey", 41));
        Shoes.add(new Shoe(200, "Pink", 33));
        Shoes.add(new Shoe(300, "Zebra", 32));
        Shoes.add(new Shoe(300, "Black", 56));
        Shoes.add(new Shoe(300, "Yellow", 77));
        Shoes.add(new Shoe(300, "Brown", 99));

        Comparator<Shoe> SortbyColourA = ( o1,  o2) -> o1.colour.compareTo(o2.colour);
        Shoes.sort(SortbyColourA);
        System.out.println("\n=============");
        System.out.println("Sorted by color Accending");
        System.out.println("=============");
        for (Shoe Shoe1 : Shoes) {
            System.out.println(Shoe1);
        }

        Comparator<Shoe> SortbyColourD = ( o1,  o2) -> o2.colour.compareTo(o1.colour);

        Shoes.sort(SortbyColourD);
        System.out.println("\n=============");
        System.out.println("Sorted by color Decending");
        System.out.println("=============");
        for (Shoe Shoe1 : Shoes) {
            System.out.println(Shoe1);
        }

        Comparator<Shoe> SortbySizeA = ( o1,  o2) -> o1.size - (o2.size);
        Shoes.sort(SortbySizeA);
        System.out.println("\n=============");
        System.out.println("Sorted by Size Accending");
        System.out.println("=============");
        for (Shoe Shoe1 : Shoes) {
            System.out.println(Shoe1);
        }

        Comparator<Shoe> SortbySizeD = ( o1,  o2) -> o2.size - (o1.size);
        Shoes.sort(SortbySizeD);
        System.out.println("\n=============");
        System.out.println("Sorted by Size Decending");
        System.out.println("=============");
        for (Shoe Shoe1 : Shoes) {
            System.out.println(Shoe1);
        }

        Comparator<Shoe> SortbyPriceA = ( o1,  o2) -> ( (Double)(o1.price) ).compareTo( (Double)(o2.price) );
        Shoes.sort(SortbyPriceA);
        System.out.println("\n=============");
        System.out.println("Sorted by price Accending");
        System.out.println("=============");
        for (Shoe Shoe1 : Shoes) {
            System.out.println(Shoe1);
        }

        Comparator<Shoe> SortbyPriceD = ( o1,  o2) -> ( (Double)(o2.price) ).compareTo( (Double)(o1.price) );
        Shoes.sort(SortbyPriceD);
        System.out.println("\n=============");
        System.out.println("Sorted by Price Dccending");
        System.out.println("=============");
        for (Shoe Shoe1 : Shoes) {
            System.out.println(Shoe1);
        }
//                Collections.sort(Shoes);

//                Collections.sort(Shoes, new SortbyColourA());
//                System.out.println("\n=============");
//                System.out.println("Sorted by color Accending");
//                System.out.println("=============");
//                for (Shoe Shoe1 : Shoes) {
//                    System.out.println(Shoe1);
//                }
//        Collections.sort(Shoes, new SortbyColourD());
//        System.out.println("\n=============");
//        System.out.println("Sorted by color Deccending");
//        System.out.println("=============");
//        for (Shoe Shoe1 : Shoes) {
//            System.out.println(Shoe1);
//        }
//
//        Collections.sort(Shoes, new SortbySizeA());
//        System.out.println("\n=============");
//        System.out.println("Sorted by Size Accending");
//        System.out.println("=============");
//        for (Shoe Shoe1 : Shoes) {
//            System.out.println(Shoe1);
//        }
//
//        Collections.sort(Shoes, new SortbySizeD());
//        System.out.println("\n=============");
//        System.out.println("Sorted by Size Deccending");
//        System.out.println("=============");
//        for (Shoe Shoe1 : Shoes) {
//            System.out.println(Shoe1);
//        }
//
//        Collections.sort(Shoes, new SortbyPriceA());
//        System.out.println("\n=============");
//        System.out.println("Sorted by Price Accending");
//        System.out.println("=============");
//        for (Shoe Shoe1 : Shoes) {
//            System.out.println(Shoe1);
//        }
//
//        Collections.sort(Shoes, new SortbyPriceD());
//        System.out.println("\n=============");
//        System.out.println("Sorted by Price Deccending");
//        System.out.println("=============");
//        for (Shoe Shoe1 : Shoes) {
//            System.out.println(Shoe1);
//        }
    }

}
