import java.util.Scanner;

public class SmartClassroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] powerData = new int[4][5]; 

        for (int time = 0; time < 4; time++) {
            for (int sensor = 0; sensor < 5; sensor++) {
                powerData[time][sensor] = scanner.nextInt();

                
                if (powerData[time][sensor] < 10 || powerData[time][sensor] > 200) {
                    System.out.println("INVALID INPUT");
                    return; 
                }
            }
        }

        
        double[] averages = new double[5];
        for (int sensor = 0; sensor < 5; sensor++) {
            int sum = 0;
            for (int time = 0; time < 4; time++) {
                sum += powerData[time][sensor];
            }
            averages[sensor] = (double) sum / 4;
        }

      
        double maxAverage = averages[0];
        for (double avg : averages) {
            if (avg > maxAverage) {
                maxAverage = avg;
            }
        }

     
        if (maxAverage < 50) {
            System.out.println("Energy consumption is optimal.");
            return;
        }

       
        System.out.print("Sensor Number : ");
        for (int sensor = 0; sensor < 5; sensor++) {
            if (averages[sensor] == maxAverage) {
                System.out.print((sensor + 1) + " ");
            }
        }
    }
}