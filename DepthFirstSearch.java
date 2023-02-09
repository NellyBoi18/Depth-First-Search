import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class DepthFirstSearch {
    // Doing DFS on the graph
    public static ArrayList<String> DFS(String currNode,LinkedHashMap<String,ArrayList<String>> graph,LinkedHashSet<String> visited, ArrayList<String> printString) {
        visited.add(currNode);
        // Add's the node to the toPrint ArrayList to stage the printing until the end
        printString.add(currNode);
        printString.add(" ");
        // System.out.print(currNode + " ");
        // Loops through each adjacent node if not already visited
        for(int x = 0;x < graph.get(currNode).size();x++) {
            if(!visited.contains(graph.get(currNode).get(x))) {
                DFS(graph.get(currNode).get(x),graph,visited, printString);
            }
        }

        return printString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read in the number of instances
        int numInstances = in.nextInt();
        
        // Array List to store a string of to prints of each instance
        ArrayList<String> toPrint = new ArrayList<>(); 

        // Each Instance
        for(int x = 0; x<numInstances; x++){
            LinkedHashMap<String,ArrayList<String>> graph = new LinkedHashMap<>();
            ArrayList<String> nodes = new ArrayList<>();

            // Reads the number of nodes
            int n = in.nextInt();
            // Clear \n
            in.nextLine();

            // Reads the edges and creates the graph
            for(int y = 0; y<n; y++){
                String[] edges = in.nextLine().split(" ");
                nodes.add(edges[0]);
                graph.put(edges[0],new ArrayList<String>());

                for(int z = 1; z<edges.length; z++){
                    graph.get(edges[0]).add(edges[z]);
                }
            }
            
            LinkedHashSet<String> visited = new LinkedHashSet<>();
            
            // Calls the DFS method for each unvisited node in the graph
            ArrayList<String> printString = new ArrayList<>();

            for(int y = 0;y<n;y++){
                if(!visited.contains(nodes.get(y))){
                    printString = DFS(nodes.get(y),graph,visited, printString);
                }
            }
            printString.add("\n");
            toPrint.add(x, printString.toString());
            // System.out.println();
        }
        in.close();

        // Printing
        String print = toPrint.toString();
        print = print.replaceAll(", ","");
        print = print.replaceAll("\\[","");
        print = print.replaceAll("\\]","");
        //print = print.replaceAll("   "," ");
        // print = print.replaceAll("  ","");
        // print = print.substring(2, print.length() - 4);
        System.out.println(print);
    }

}