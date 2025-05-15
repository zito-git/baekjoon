import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        List<Character> characters = new ArrayList<>();
        List<Character> reversed = new ArrayList<>();
        for (char i : chars) {
            characters.add(i);
            reversed.add(i);
        }
        Collections.reverse(reversed);

        Boolean result = characters.equals(reversed);
        if (result) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}