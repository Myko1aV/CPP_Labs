import Lab.StringManager;

public class Main {
    public static void main(String[] args) throws Exception {
        String text = "I live in the Lviv . We are drinking beer or kvas in the park . A policeman get out of the car and said \" Добрий вечір , ваші документи \" ";
        StringManager.isEmpty(text);
        System.out.println(StringManager.remove(text));
    }
}