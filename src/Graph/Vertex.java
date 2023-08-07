package Graph;

public class Vertex<K> {
    
    private K name;

    public Vertex(K name) {
        this.name = name;
    }

    public K getName() {
        return this.name;
    }

    public void setName(K name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name.toString();
    }
}
