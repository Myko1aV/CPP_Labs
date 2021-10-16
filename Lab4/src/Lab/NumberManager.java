package Lab;

public class NumberManager {
    public static char[] ChangeNumber(){
        String str= "";
        for (String st:FileManager.final_list) {
            str+=st+"\n";
        }
        int i=0;
        char [] arr = str.toCharArray();
        while (i<arr.length){
            if (isNumber(arr[i])){
                do {
                    arr[i]='#';
                    i++;
                }while(isNumber(arr[i]) || (isNumber(arr[i+1]) && (arr[i]=='.'|| arr[i]==',')));
            }
            else i++;
        }
        return arr;
    }
    private static boolean isNumber(char c){
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9';
    }
}