package Drugs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Drug> drugList = new ArrayList<>();
        initializeList(drugList);

        System.out.println("Search by: 1 - Type; 2 - Price");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.next();
        switch (search) {
            case "1":
                System.out.println("1 - Vitamins; 2 - anti-allergic; 3 - Analgesics");
                String choise = scanner.next();
                SearchManager searchManager = new SearchManager(drugList);

                switch (choise) {
                    case "1":
                        drugList = searchManager.findByType("Vitamins");
                        break;
                    case "2":
                        drugList = searchManager.findByType("anti-allergic");
                        break;
                    case "3":
                        drugList = searchManager.findByType("Analgesics");
                        break;
                    default:
                        return;
                }

                SortManager sortManager = new SortManager(drugList);

                List<Drug> tempResult = sortManager.sortByNumber(true);
                for (Drug r : tempResult) {
                    System.out.println(r);
                }
                System.out.println();
                tempResult = sortManager.sortByPrice(false);
                for (Drug r : tempResult) {
                    System.out.println(r);
                }
                System.out.println();
                tempResult = sortManager.sortByType(false);
                for (Drug r : tempResult) {
                    System.out.println(r);
                }
                System.out.println();
                tempResult = sortManager.sortByName(false);
                for (Drug r : tempResult) {
                    System.out.println(r);
                }
                scanner.close();
                break;
            case "2":
                System.out.println("Enter min price:");
                Float min = Float.valueOf(scanner.next());
                System.out.println("Enter max price:");
                Float max = Float.valueOf(scanner.next());

                SearchManager searchManager2 = new SearchManager(drugList);

                drugList = searchManager2.findByPrice(min,max);
                for (Drug r : drugList) {
                    System.out.println(r);
                }

                System.out.println();
                SortManager sortManager2 = new SortManager(drugList);
                tempResult = sortManager2.sortByType(false);
                for (Drug r : tempResult) {
                    System.out.println(r);
                }
                break;
            default:
                return;
        }
    }
    private static void initializeList (List < Drug > drug) {
        for (int i = 0; i < 3; i++) {
            drug.add(new Aleric(142+i*20));
            drug.add(new Castera(64+30*i));
            drug.add(new Vitamin_A(189-10*i));
        }

        for (int i = 0; i < 2; i++) {
            drug.add(new Vitamin_B(121+10*i));
            drug.add(new Suprastyn(65+20*i));
            drug.add(new Tempalgin(75-5*i));
        }

        drug.add(new Ibunorm(124));
        drug.add(new Nurofen(112));
    }
}
