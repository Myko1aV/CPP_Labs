package Lab;

public class StringManager {
    public static String remove(String text) {
        return text.replaceAll("\\b([aA]|[ioIO]n|[Tt]he|[Oo]r|[aA]re|[Oo]ut)\\b", " ").replaceAll("\\s+", " ");
    }

    public static void isEmpty(String text) throws Exception {
        if (text.equals("")) throw new Exception("Empty string");
        else System.out.println(" Text before formatting : \n"+text+"\n After formatting:\n");
    }
}