package Main;

import Graph.Graph;

public class Main {

    public static void main(String[] args) {
        Graph<String> graph = new Graph();
        
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        
        graph.addEdge("A", "B", 1.0);
        graph.addEdge("A", "C", -1.0);
        graph.addEdge("A", "D", 1.0);
        graph.addEdge("B", "C", 2.0);
        graph.addEdge("B", "D", 1.0);
        graph.addEdge("C", "D", 4.0);
        
        System.out.println(graph.deepFirstSearch("A", "B"));
    }
    
}
