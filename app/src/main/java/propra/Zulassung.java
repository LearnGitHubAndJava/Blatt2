package propra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

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
        punktzahlen.add(42);
        punktzahlen.add(23);
        punktzahlen.add(12);
        punktzahlen.add(54);
        punktzahlen.add(20);
        punktzahlen.addAll(List.of(42,23,12,54,20));
        punktzahlen.remove(2);
        System.out.println("Vor der Sortierung \n"+punktzahlen);
        Collections.sort(punktzahlen);
        System.out.println("Nach der Sortierung \n "+punktzahlen);
        int sum = 0;
        for (Integer integer : punktzahlen) {
            sum += integer;
        }
        int durschnitt = sum / punktzahlen.size();
        System.out.println("Die Durchschnittliche Note: " + durschnitt);

    }

    private void hashmap() {
        HashMap<Integer, Integer> matrikelnummerPunkte = new HashMap<>();
        matrikelnummerPunkte.put(1942000, 12);
        matrikelnummerPunkte.put(1972300, 92);
        matrikelnummerPunkte.put(203400, 43);
        System.out.println("Hashmap: "+matrikelnummerPunkte);
        matrikelnummerPunkte.put(1942000, 67);
        System.out.println("Hashmap: "+matrikelnummerPunkte);
        System.out.println(matrikelnummerPunkte.get(1972300));
        for (Map.Entry<Integer, Integer> entry : matrikelnummerPunkte.entrySet()) {
            System.out.printf("Matrikelnummer: %d, Punktzahl: %d%n", entry.getKey(), entry.getValue());
        }

    }

    private void set() {
        HashSet<Integer> matrikelnummern = new HashSet<>();
        matrikelnummern.add(1942000);
        matrikelnummern.add(1972300);
        matrikelnummern.add(203400);
        HashSet<Integer> matrikelnummern2 = new HashSet<>();
        matrikelnummern2.add(1942000);
        matrikelnummern2.addAll(matrikelnummern);
        System.out.println(matrikelnummern2);


    }
}
