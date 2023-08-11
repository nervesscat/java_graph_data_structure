package Graph;

import JSON.JSON;
import java.util.Set;

public class Edge<K> {
    private JSON<Vertex<K>, Double> json;

    public Edge() {
        this.json = new JSON<Vertex<K>, Double>();
    }

    public void add(Vertex<K> vertex, double value) {
        this.json.add(vertex, value);
    }

    public double get(Vertex<K> key) {
        return this.json.get(key);
    }

    public JSON<Vertex<K>, Double> getJSON() {
        return this.json;
    }

    public void setJSON(JSON<Vertex<K>, Double> json) {
        this.json = json;
    }

    public Set<Vertex<K>> getKeys() {
        return this.json.getKeys();
    }

    @Override
    public String toString() {
        return this.json.toString();
    }
}
