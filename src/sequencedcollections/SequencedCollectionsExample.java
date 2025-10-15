package sequencedcollections;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Premier");
        list.add("Deuxième");
        list.add("Troisième");

        // Accéder au premier et au dernier élément
        System.out.println("Premier élément : " + list.get(0));
        System.out.println("Dernier élément : " + list.get(list.size() - 1));

        // Avec SequencedCollection (à partir de Java 21)
        System.out.println("Premier élément (SequencedCollection) : " + list.getFirst());
        System.out.println("Dernier élément (SequencedCollection) : " + list.getLast());
    }
}
