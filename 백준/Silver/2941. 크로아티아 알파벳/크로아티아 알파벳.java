import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for (String i : words) {
            if (input.contains(i)) {
                input = input.replace(i, "*");
            }
        }

        System.out.println(input.length());
    }
}