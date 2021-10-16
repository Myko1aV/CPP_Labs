package Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private final static String filePath = "E:/test.txt";
    protected static  List<String> final_list = new ArrayList<>();
    protected static List<String> list_to_delete = new ArrayList<>() ;
    protected static String text;

    public static String ReadFromFile() throws FileNotFoundException {
        text="";
        File all_text= new File(filePath);
        Scanner scanner = new Scanner(all_text);
        while (scanner.hasNextLine()){
            String temp = scanner.nextLine();
            text+=temp;
            System.out.println(temp);
        }
        return text;
    }

    public static void spliter(String text){
        int size = text.length();
        int i=0, count =0;
        String recur = "";
            while (i < size) {
                String temp = "";
                if (text.charAt(i) == '(' && i < size) {
                    count++;
                    do {
                        temp += text.charAt(i);
                        i++;
                    } while (text.charAt(i) != '(' && text.charAt(i) != ')');
                    if (text.charAt(i) == ')') {
                        temp += ')';
                        final_list.add(temp);
                    } else recur += temp;
                } else if (text.charAt(i) == ')' && i < size) {
                    count--;
                    if (i==size-1) break;
                    do {
                        if (i == size - 1 || text.charAt(i+1)=='(') break;
                        else i++;
                        temp += text.charAt(i);

                    } while (text.charAt(i) != '(' && text.charAt(i) != ')');
                    recur += temp;
                } else i++;
            }
            if (count!=0){
                System.out.println("Amount of '(' isn't equal amount of ')' " +
                        "Or text starts with ')' Check your text and try again!");
                final_list.clear();
            }
            if (recur != "" && count == 0 ) {
                spliter(recur);
            }
    }

    public static void Remove() throws FileNotFoundException {
        int size = text.length();
        int i = 0;
        String recur = "";
        while (i < size) {
            String temp = "";
            if (text.charAt(i) == '(' && i < size) {
                do {
                    temp += text.charAt(i);
                    i++;
                } while (text.charAt(i) != '(' && text.charAt(i) != ')');
                if (text.charAt(i) == ')') {
                    recur += '(';
                    temp += ')';
                    list_to_delete.add(temp);
                } else recur += temp;
            } else {
                recur +=text.charAt(i);
                i++;
            }
        }
        System.out.println(recur);
    }
}