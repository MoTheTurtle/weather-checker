import java.util.Scanner; 
import java.util.List; 
import java.util.ArrayList;

public class WeatherSummary {

    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        List<Double> temp = new ArrayList<>(); 

        while(scan.hasNextLine()){
            double temperature = scan.nextDouble(); 
            temp.add(temperature);
        }
        System.out.println(temp);

        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
    }
}
