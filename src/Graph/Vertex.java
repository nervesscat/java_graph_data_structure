package Graph;

public class Vertex<T> {
    
    private T name;

    public Vertex(T name) {
        this.name = name;
    }

    public T getName() {
        return this.name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name.toString();
    }
}
