import java.util.Scanner; // For inputs

public class DepthFirstSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // New Scanner object

        int numInstances = in.nextInt(); // Reading user input of number of instances
        in.nextLine(); // Clearing \n

        Instances[] instances = new Instances[numInstances]; // Creating an array of objects based on input num of instances

        // Loop for number of instances
        for (int x = 0; x < numInstances; x++) {
            int numNodes = in.nextInt(); // Reading user input of number of nodes
            in.nextLine(); // Clearing \n

            instances[x].numNodes = numNodes;
            instances[x].Initialize();

            for(int y = 0; y < numNodes; y++) {
                instances[x].something();
            }
        }
    }
}