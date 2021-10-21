package Lab;
import java.util.*;

class Main {
    public final static String filePath1 = "E:/write.txt";
    public final static String filePath2 = "E:/write_2.txt";

    public static void main(String[] args)
    {
        System.out.println("Open file : 1 , 2 or both ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        switch (filename){
            case "1":
                filename=filePath1;
                break;
            case "2":
                filename=filePath2;
                break;
            case "both":
                MapManager.both_actors();
                MapManager.both_date();
                return;
            default:
                return;
        }
        Map<String, Set<String>> mapFromFile = MapManager.GetFromTextFile(filename);
        Map<String, Set<String>> names = MapManager.GetSameFilms(filename);
        for (Map.Entry<String, Set<String>> entry :
                mapFromFile.entrySet()) {
            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
        System.out.println("\nFilms with the same date\n");
        for (Map.Entry<String, Set<String>> entry :
                names.entrySet()) {
            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }
}