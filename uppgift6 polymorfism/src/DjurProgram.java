import java.util.ArrayList;

public class DjurProgram {
    public static void main(String[] args) {
        Däggdjur däggdjur = new Däggdjur("meh");
        Kräldjur kräldjur = new Kräldjur("blub blub");

        // Create a list to store animal objects
        ArrayList<Object> djurLista = new ArrayList<>();

        // Add Däggdjur and Kräldjur objects to the list
        djurLista.add(däggdjur);
        djurLista.add(kräldjur);

        // Iterate through the list
        for (Object djur : djurLista) {
            if (djur instanceof Däggdjur) {
                System.out.println(((Däggdjur) djur).getSound());
            } else if (djur instanceof Kräldjur) {
                System.out.println(((Kräldjur) djur).getSound());
            }
        }
    }
}
