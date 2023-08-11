package Graph;

import LinkedList.LinkedList;

public class Path<K> {
    private LinkedList<Vertex<K>> path;
    private double value;

    public Path() {
        this.path = new LinkedList<Vertex<K>>();
        this.value = 0;
    }

    public Path(Vertex<K> vertex) {
        this.path = new LinkedList<Vertex<K>>(vertex);
        this.value = 0;
    }

    public void add(Vertex<K> vertex, double value) {
        this.path.add(vertex);
        this.value += value;
    }

    public void add(Path<K> actualPath){
        for(Vertex<K> vertex : actualPath.getPath()){
            this.path.add(vertex);
        }
        this.value = actualPath.getValue();
    }

    public LinkedList<Vertex<K>> getPath() {
        return this.path;
    }

    public void setPath(LinkedList<Vertex<K>> path){
        this.path = path;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String string = "";
        for (Vertex<K> vertex : this.path) {
            string += vertex.getName() + " -> ";
        }
        string = string.substring(0, string.length() - 4);
        string += " = " + this.value;
        return string;
    }
    
}
