import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, City> aa = new TreeMap<>();
        aa.put(5, new City(1121, "Liman"));
        aa.put(2, new City(2321, "Bankok"));
        aa.put(1, new City(3321, "New york"));
        aa.put(3, new City(2221, "Tokyo"));
        aa.put(4, new City(1321, "Bishkek"));
        System.out.println(aa);
    }
}