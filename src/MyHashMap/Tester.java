package MyHashMap;
public class Tester {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
        map.put(1, "rakesh");
        map.put(2, "patel");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        map.put(1,"lingam");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        for(int i = 0 ; i < 30; i++)
        {
            map.put(i, "a");
        }
        map.put(null, "b");
        System.out.println("map size is : " + map.size());
        System.out.println(map);
    }
}
