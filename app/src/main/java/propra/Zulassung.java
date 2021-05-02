 
package propra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.lang.System;
import java.security.KeyStore.Entry;

public class Zulassung {
    public static void main(String[] args) {
        Zulassung zulassung = new Zulassung();
        zulassung.listen();
        System.out.println("\n// -----------------------------\n");
        zulassung.hashmap();
        System.out.println("\n// -----------------------------\n");
        zulassung.set();
    }

    private void listen() {
        // Beginnen Sie hier
        List<Integer> punktzahlen = new ArrayList<>();
        punktzahlen.addAll(List.of(42,23,12,54,20));
        punktzahlen.add(30);
        System.out.println(punktzahlen);
        punktzahlen.remove(2);
        for (int punktzahl : punktzahlen) {
            System.out.println(punktzahl);
        }

        Collections.sort(punktzahlen);

        int somm = 0;
        
        for(int i = 0; i < punktzahlen.size(); i++){
            somm += punktzahlen.get(i);
        }

        System.out.println("Durch.. : " + somm / punktzahlen.size());
        
    }

    private void hashmap() {
        HashMap<Integer, Integer> matrikelnummerPunkt= new HashMap<>();
        matrikelnummerPunkt.put(1942000, 1);
        matrikelnummerPunkt.put(1972300, 2);
        matrikelnummerPunkt.put(203400, 3);
        System.out.println(matrikelnummerPunkt);
        matrikelnummerPunkt.put(1942000, 4);
        System.out.println(matrikelnummerPunkt);
        matrikelnummerPunkt.get(203400);

        for(Map.Entry<Integer, Integer> element : matrikelnummerPunkt.entrySet()){
            System.out.println("Matrikelnummer: "+ element.getKey() + ", Punkte: "+ element.getValue());
        }
        

    }

    private void set() {
    }
}