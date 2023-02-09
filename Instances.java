import java.util.ArrayList;
import java.util.Scanner;

public class Instances {

    public static int numNodes = 0;

    public static void Initialize() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(numNodes);

        // Creates an ArrayList of int's inside the ArrayList to hold edges
        for (int x = 0; x < numNodes; x++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    public static void Connecting() {
        Scanner in = new Scanner(System.in);

        for (int x = 0; x < numNodes; x++) {

        }
    }
}
