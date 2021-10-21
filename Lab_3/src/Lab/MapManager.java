package Lab;

import java.util.*;
import static Lab.ReadFromFileManager.GetDate;

public class MapManager {
    public static void both_date() {
        Map<String, Set<String>> names1 = GetSameFilms(Main.filePath1);
        Map<String, Set<String>> names2 = GetSameFilms(Main.filePath2);
        Map<String,Set<String>> both = new TreeMap<>(names1);
        for (String k : both.keySet()) {
            if (names2.containsKey(k)) {
                both.get(k).addAll(names2.get(k));
                names2.remove(k);
            }

        }
        both.putAll(names2);
        System.out.println("\nFilms with the same date\n");
        for (Map.Entry<String, Set<String>> entry :
                both.entrySet()) {
            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }
    public static void both_actors() {
        Map<String, Set<String>> actors1 = GetFromTextFile(Main.filePath1);
        Map<String, Set<String>> actors2 = GetFromTextFile(Main.filePath2);
        Map<String,Set<String>> both = new TreeMap<>(actors1);
        for (String k : both.keySet()) {

            if (actors2.containsKey(k)) {
                both.get(k).addAll(actors2.get(k));
                actors2.remove(k);
            }

        }
        both.putAll(actors2);
        System.out.println("\n");
        for (Map.Entry<String, Set<String>> entry :
                both.entrySet()) {
            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }
    public static Map<String, Set<String>> GetFromTextFile(String filename)
    {
        Map<String, Set<String>> map = new TreeMap<String, Set<String>>();
        List<String> film= ReadFromFileManager.GetFilmName(filename);
        List<String> produser = ReadFromFileManager.getListOfProdusers(filename);
        List<String> date = GetDate(filename);
        List<String> director= ReadFromFileManager.GetDirector(filename);
        for (int i = 0; i < produser.size(); i++) {
            Set<String> temp = new TreeSet<>();
            for (int j = 0; j < film.size(); j++) {
                if(ReadFromFileManager.GetProdusers(filename).get(j).contains(produser.get(i))){
                    temp.add(film.get(j)+":"+ date.get(j)+":"+director.get(j));
                }
            }
            map.put(produser.get(i),temp);
        }
        return map;
    }
    public static Map<String,Set<String>> GetSameFilms(String filename){
        Map<String, Set<String>> map = new TreeMap<String, Set<String>>();
        List<String> film= ReadFromFileManager.GetFilmName(filename);
        List<String> date = new ArrayList<>();
        date.addAll(ReadFromFileManager.getListOfDate(filename));
        for (int i = 0; i < date.size(); i++) {
            Set<String> temp = new TreeSet<>();
            for (int j = 0; j < film.size(); j++) {
                if(ReadFromFileManager.GetDate(filename).get(j).contains(date.get(i))){
                    temp.add(film.get(j));
                }
            }
            map.put(date.get(i),temp);
        }
        return map;
    }
}
