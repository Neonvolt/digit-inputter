import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        ArrayList<Integer> data = new ArrayList<>();
        boolean running = true;
        System.out.println("Input values (0 to stop):");
        
        while (running) {
            input = sc.next();
            int inputInt = 0;

            try {
                inputInt = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input can be only integer values");
                continue;
            }

            if (inputInt == 0) {
                running = false;
            }
            else {
                data.add(inputInt);
            }
        }

        if (!(data.isEmpty())) {
            int indexMax, sumMax, numCurr, sumCurr;
            sumMax = indexMax = 0;

            for (int indexCurr = 0; indexCurr < data.size(); indexCurr++) {
                sumCurr = 0;
                numCurr = Math.abs(data.get(indexCurr));
                while (numCurr > 0) {
                    sumCurr += numCurr % 10;
                    numCurr = numCurr / 10;
                }
                if (sumCurr > sumMax) {
                    sumMax = sumCurr;
                    indexMax = indexCurr;
                }
            }
            System.out.println("Number with max digit sum is " + data.get(indexMax));
            System.exit(1);
        }
        System.out.println("You haven't entered any integer numbers");
        System.exit(2);
    }
}
