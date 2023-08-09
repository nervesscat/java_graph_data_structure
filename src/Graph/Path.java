package Graph;

import LinkedList.LinkedList;

public class Path<K> {
    private LinkedList<Vertex> path;
    private double value;

    public Path() {
        this.path = new LinkedList<Vertex>();
        this.value = 0;
    }

    public Path(Vertex vertex) {
        this.path = new LinkedList<Vertex>(vertex);
        this.value = 0;
    }

    public void add(Vertex vertex, double value) {
        this.path.add(vertex);
        this.value += value;
    }

    public LinkedList<Vertex> getPath() {
        return this.path;
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
        for (Vertex vertex : this.path) {
            string += vertex.getName() + " -> ";
        }
        string = string.substring(0, string.length() - 4);
        string += " = " + this.value;
        return string;
    }
    
}
