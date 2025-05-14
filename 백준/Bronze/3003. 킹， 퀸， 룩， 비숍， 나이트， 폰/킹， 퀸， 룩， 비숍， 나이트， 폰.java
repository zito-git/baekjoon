import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 8};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] split = input.split(" ");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
            if (nums[i] == arr[i]) {
                nums[i] = 0;
            } else if (nums[i] > arr[i]) {
                nums[i] = (nums[i] - arr[i]) * -1;
            } else {
                nums[i] = arr[i] - nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}