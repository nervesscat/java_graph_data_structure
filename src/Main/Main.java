package Main;

import Graph.Graph;

public class Main {

    public static void main(String[] args) {
        Graph<String> graph = new Graph();
        
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        
        graph.addEdge("A", "B", 1.0);
        graph.addEdge("B", "E", -1.0);
        graph.addEdge("E", "C", 1.0);
        graph.addEdge("E", "D", 1.0);
        graph.addEdge("E", "F", 4.0);
        graph.addEdge("C", "E", 1.0);
        graph.addEdge("D", "C", 1.0);
        graph.addEdge("D", "F", 3.0);
        
        System.out.println(graph.deepFirstSearch("A", "F"));
    }
    
}
