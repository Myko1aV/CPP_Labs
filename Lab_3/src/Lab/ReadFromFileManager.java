package Lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class ReadFromFileManager {
    public static List<String> GetFilmName(String filename){
        List<String> film= new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(filename);
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                if (!name.equals("")) film.add(name);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return film;
    }

    public static List<String> GetDate(String filename){
        List<String> date= new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(filename);
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[1].trim();
                if (!name.equals("")) date.add(name);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public static List<String> GetDirector(String filename){
        List<String> Director= new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(filename);
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[2].trim();
                if (!name.equals("")) Director.add(name);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return Director;
    }

    public static List<String> GetProdusers(String filename){
        List<String> Produsers= new ArrayList<>();
        BufferedReader br = null;
        try {
            File file = new File(filename);
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[3].trim();
                if (!name.equals("")) Produsers.add(name);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return Produsers;
    }

    public static List<String> getListOfProdusers(String filename){
        String prod= "";
        for(int i = 0; i< ReadFromFileManager.GetProdusers(filename).size()-1; i++){
            prod += ReadFromFileManager.GetProdusers(filename).get(i);
        }
        prod+= ReadFromFileManager.GetProdusers(filename).get(ReadFromFileManager.GetProdusers(filename).size()-1);
        String prodq[]= prod.split(";");
        List<String> produser =new ArrayList<>();
        produser = Arrays.asList(prodq);
        Set<String> pr= new TreeSet<>(produser);
        List<String> produser1 =new ArrayList<>();
        produser1.addAll(pr);
        return produser1;
    }

    public static Set<String> getListOfDate(String filename){
        List<String> Date =new ArrayList<>();
        Date = ReadFromFileManager.GetDate(filename);
        Set<String> dat= new TreeSet<>(Date);
        return dat;
    }
}
