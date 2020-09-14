import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BrickTranslater {

    public static String returnBrick(String str) {
        Character[] chars = {'а', 'А', 'е', 'Е', 'и', 'И', 'о', 'О', 'у', 'У', 'ы', 'э', 'Э', 'ю', 'Ю', 'я', 'Я'};
        List<Character> list = new ArrayList<>(Arrays.asList(chars));

        String result = "";

        if (str.length() == 0) return str;

        for (int i = 0; i < str.length(); i++) {
            result+=str.charAt(i);
            if(list.contains(str.charAt(i))){
                result+= ""+"к"+str.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String test = scanner.nextLine();
            System.out.println(returnBrick(test));
        }
    }


}

