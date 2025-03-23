import java.util.Scanner;

public class LanternBrightness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int n = scanner.nextInt();

        
        int[] brightness = new int[n];
        for (int i = 0; i < n; i++) {
            brightness[i] = scanner.nextInt();
        }

        int[] maxInSubarrays = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int max = brightness[i];
            for (int j = 1; j < k; j++) {
                if (brightness[i + j] > max) {
                    max = brightness[i + j];
                }
            }
            maxInSubarrays[i] = max;
        }

        int minOfMax = maxInSubarrays[0];
        for (int i = 1; i < maxInSubarrays.length; i++) {
            if (maxInSubarrays[i] < minOfMax) {
                minOfMax = maxInSubarrays[i];
            }
        }

        System.out.println(minOfMax);
    }
}