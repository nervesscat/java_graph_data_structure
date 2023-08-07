package Graph;

import JSON.JSON;
import java.util.Set;

public class Graph<K> {
    private int size;
    
    private JSON<Vertex<K>, Edge<K>> graph;

    public Graph() {
        this.size = 0;
        this.graph = new JSON<Vertex<K>, Edge<K>>();
    }

    public void addVertex(Vertex<K> vertex) {
        this.graph.add(vertex, new Edge());
    }

    public void addVertex(K name) {
        this.graph.add(new Vertex(name), new Edge());
    }

    public void addEdge(K from, K to, double value) {
        // Search for the vertex with the name "from"
        Vertex<K> fromVertex = null;
        for (Vertex<K> vertex : this.graph.getKeys()) {
            if (vertex.getName().equals(from)) {
                fromVertex = vertex;
                break;
            }
        }

        // Search for the vertex with the name "to"
        Vertex<K> toVertex = null;
        for (Vertex<K> vertex : this.graph.getKeys()) {
            if (vertex.getName().equals(to)) {
                toVertex = vertex;
                break;
            }
        }

        // If the vertex with the name "from" does not exist, create it
        if (fromVertex == null) {
            fromVertex = new Vertex(from);
            this.addVertex(fromVertex);
        }

        // If the vertex with the name "to" does not exist, create it
        if (toVertex == null) {
            toVertex = new Vertex(to);
            this.addVertex(toVertex);
        }

        // Add the edge
        this.graph.get(fromVertex).add(toVertex, value);
        // this.graph.get(toVertex).add(fromVertex, value);
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.graph.toString();
    }
}
