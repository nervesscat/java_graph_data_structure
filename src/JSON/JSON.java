package JSON;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JSON<K, V> {
    private Map<K, V> map;

    public JSON() {
        this.map = new HashMap<K, V>();
    }

    public void add(K key, V value) {
        this.map.put(key, value);
    }

    public V get(K key) {
        return this.map.get(key);
    }

    public Set<K> getKeys() {
        return this.map.keySet();
    }

    @Override
    public String toString() {
        return this.map.toString();
    }
}