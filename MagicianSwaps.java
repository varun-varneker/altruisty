import java.util.Scanner;
import java.util.Arrays;

public class MagicianSwaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int N = scanner.nextInt();
        scanner.nextLine(); 

        
        String A = scanner.nextLine();

      
        String B = scanner.nextLine();

        if (!isTransformationPossible(A, B)) {
            System.out.println(-1);
            return;
        }

        int swaps = countSwaps(A, B);
        System.out.println(swaps);
    }

    private static boolean isTransformationPossible(String A, String B) {
        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars); 
    }

    private static int countSwaps(String A, String B) {
        char[] aArray = A.toCharArray();
        int swaps = 0;

        for (int i = 0; i < B.length(); i++) {
            int pos = findPosition(aArray, B.charAt(i), i);

            if (pos == i) {
                continue;
            }

            for (int j = pos; j > i; j--) {
                swap(aArray, j, j - 1);
                swaps++;
            }
        }

        return swaps;
    }

    
    private static int findPosition(char[] aArray, char target, int start) {
        for (int i = start; i < aArray.length; i++) {
            if (aArray[i] == target) {
                return i;
            }
        }
        return -1; 
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}