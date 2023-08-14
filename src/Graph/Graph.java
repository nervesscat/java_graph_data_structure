package Graph;

import JSON.JSON;
import LinkedList.LinkedList;

import java.util.Set;

public class Graph<T> {
    private int size;
    
    private JSON<Vertex<T>, Edge<T>> graph;

    public Graph() {
        this.size = 0;
        this.graph = new JSON<Vertex<T>, Edge<T>>();
    }

    public void addVertex(Vertex<T> vertex) {
        this.graph.add(vertex, new Edge());
    }

    public void addVertex(T name) {
        this.graph.add(new Vertex(name), new Edge());
    }

    public void addEdge(T from, T to, double value) {
        // Search for the vertex with the name "from"
        Vertex<T> fromVertex = null;
        for (Vertex<T> vertex : this.graph.getKeys()) {
            if (vertex.getName().equals(from)) {
                fromVertex = vertex;
                break;
            }
        }

        // Search for the vertex with the name "to"
        Vertex<T> toVertex = null;
        for (Vertex<T> vertex : this.graph.getKeys()) {
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
        // ! this.graph.get(toVertex).add(fromVertex, value); Uncomment this line if you want to make the graph undirected
    }

    public void addEdge(Vertex<T> from, Vertex<T> to, double value) {
        this.graph.get(from).add(to, value);
        // ! this.graph.get(to).add(from, value); Uncomment this line if you want to make the graph undirected
    }

    public LinkedList<Path<T>> deepFirstSearch(Vertex<T> first, Vertex<T> endPoint, Path<T> path, LinkedList<Path<T>> forest){
        if (first == null || endPoint == null){
            return null;
        }

        Edge<T> edges = this.graph.get(first);
        
        for(Vertex<T> vertex : edges.getKeys()){
            /*
             * System.out.println("Actual Vertex: " + first + " Aiming to: " + vertex);
            if (path.getPath().itExists(vertex)){
                System.out.println("Evitando ciclos " + vertex + " repetido");
                break;
            }

            if (vertex.equals(endPoint)){
                System.out.println("Gotcha!");
                Path<T> anotherPath = new Path<T>();
                anotherPath.add(path);
                anotherPath.add(vertex, edges.get(vertex));
                forest.add(anotherPath);
                continue;
            }
            System.out.println("Actual Path: " + path);
            path.add(vertex, edges.get(vertex));
            deepFirstSearch(vertex, endPoint, path, forest);
             */
        }

        System.out.println("Saliendo del ciclo: " + first);

        return forest;
    }

    public LinkedList<Path<T>> deepFirstSearch(Vertex<T> first, Vertex<T> endPoint){
        if (first == null || endPoint == null){
            return null;
        }
        Path<T> path = new Path<T>();
        path.add(first, 0);
        LinkedList<Path<T>> forest = new LinkedList<Path<T>>();
        
        return this.deepFirstSearch(first, endPoint, path, forest);
    }

    public LinkedList<Path<T>> deepFirstSearch(T first, T endPoint){
        Set<Vertex<T>> keys = this.graph.getKeys();
        Vertex<T> init = null;
        Vertex<T> end = null;

        for (Vertex<T> key : keys){
            if(key.getName().equals(first)){
                init = key;
            } else if (key.getName().equals(endPoint)){
                end = key;
            }
        }

        if (init == null || end == null){
            return null;
        }

        return this.deepFirstSearch(init, end);
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.graph.toString();
    }
}
