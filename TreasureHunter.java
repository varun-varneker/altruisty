import java.util.Scanner;

public class TreasureHunter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        int[] prefix = new int[path.length() + 1];
        for (int i = 1; i <= path.length(); i++) {
            prefix[i] = prefix[i - 1] + (path.charAt(i - 1) == 'T' ? 1 : 0);
        }

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();

            int treasures = prefix[endIndex] - prefix[startIndex - 1];
            System.out.println(treasures);
        }
    }
}