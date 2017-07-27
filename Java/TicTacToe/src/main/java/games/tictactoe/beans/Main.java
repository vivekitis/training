package games.tictactoe.beans;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ruzbeh.i on 14/07/17.
 */
 class Generic<K extends String, V> {
    K key;
    V value;
    ArrayList<V> values = new ArrayList<>();

    public Generic(K k, V v) {
        key = k;
        value = v;
    }

    public ArrayList<V> manipulate(V v) {
        values.add(v);

        return values;
    }


}



public class Main{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
    }
}