package Lab;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\nThe text was successfully read from the file\n");
        FileManager.spliter(FileManager.ReadFromFile());
        System.out.println("\nThe program found following tokens\n");
        for (String st:FileManager.final_list) {
            System.out.println(st);
        }
        System.out.println("\nThe program replaced all numbers with a '#' sign\n");
        System.out.println(NumberManager.ChangeNumber());
        System.out.println("\nThe program has removed all the deepest tokens \n");
        FileManager.Remove();
        System.out.println("\nThe tokens that have been deleted \n");
        for (String st:FileManager.list_to_delete) {
            System.out.println(st);
        }
    }
}
