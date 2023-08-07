package Graph;

import JSON.JSON;
import java.util.Set;

public class Edge<K> {
    private JSON<K, Double> json;

    public Edge() {
        this.json = new JSON<K, Double>();
    }

    public void add(Vertex<K> vertex, double value) {
        this.json.add(vertex.getName(), value);
    }

    public double get(K key) {
        return this.json.get(key);
    }

    public JSON<K, Double> getJSON() {
        return this.json;
    }

    public void setJSON(JSON<K, Double> json) {
        this.json = json;
    }

    public Set<K> getKeys() {
        return this.json.getKeys();
    }

    @Override
    public String toString() {
        return this.json.toString();
    }
}
