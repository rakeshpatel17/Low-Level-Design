package MyHashMap;

public class MyHashMap<K, V> {
    public static final int INITIAL_SIZE = 16;
    public static final int MAXIMUM_CAPACITY  = 1 << 30;
    private static final float LOAD_FACTOR = 0.75f;
    private int size = 0;
    private int threshold;
    public Entry<K, V>[] hashTable;

    public MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
        threshold = (int)(LOAD_FACTOR * INITIAL_SIZE);
    }

    public MyHashMap(int capacity){
        int n = tableSizeFor(capacity);
        threshold = (int)(LOAD_FACTOR * n);
        hashTable = new Entry[n];
    }

    public int hash(K key, int len){
        if(key == null)
                return 0;
        int idx = ( key.hashCode() & (len - 1) );
        return idx;
    }

    public final int tableSizeFor(int capacity){
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K key, V value){
        int idx = hash(key, hashTable.length);
        Entry<K, V> current = hashTable[idx];
        while(current != null)
        {
            if(current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }
        Entry<K, V> newEntry = new Entry<K, V>(key, value);
        newEntry.next = hashTable[idx];
        hashTable[idx] = newEntry;
        size++;
        if(size > threshold){
            resize();
        }
    }

    public V get(K key){
        int idx = hash(key, hashTable.length);
        Entry<K, V> cur = hashTable[idx];
        while(cur != null){
            if(cur.key.equals(key)){
                return cur.value;
            }
            cur = cur.next;
        }
        return null;
    }

    public void resize(){
        int newCapacity = hashTable.length * 2;
        if(newCapacity > MAXIMUM_CAPACITY){
            System.out.println("Map is full...");
            return;
        }
        Entry<K, V>[] newTable = new Entry[newCapacity];
        for(Entry<K, V> head : hashTable){
            Entry<K, V> cur = head;
            while(cur != null){
                int idx = hash(cur.key, newCapacity);
                Entry<K,V> newEntry = new Entry<K, V>(cur.key, cur.value);
                newEntry.next = newTable[idx];
                newTable[idx] = newEntry;
                cur = cur.next;
            }
        }
        hashTable = newTable;
        threshold = (int)(LOAD_FACTOR * newCapacity);
        System.out.println("resized and the current size is : " + newCapacity);
    }

    public int size(){
        return size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;
        for(Entry<K, V> entry : hashTable){
            Entry<K, V> current = entry;
            while(current != null){
                if(!first)
                    sb.append(", ");
                sb.append(current.key + " = " + current.value);
                current = current.next;
                first = false;
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
