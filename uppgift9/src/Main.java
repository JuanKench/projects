public class Main {
    public static void main(String[] args) {
        /*
        • De romerska siffrorna anges med bokstäverna I, V, X, L, C, D
        och M som står för 1, 5, 10, 50, 100, 500 resp. 1000.

        • Deklarera en uppräkningstyp Romersksiffra som innehåller
        uppräkningsvärdena I, V, X, L, C, D och M. För varje
        uppräkningsvärde ska det finnas en instansvariabel som
        innehåller motsvarande siffervärde.

        • I ditt huvudprogram, iterera över konstanterna i uppräkningen
        och skriv ut vad varje romersk siffra har för värde.
        */

            for (siffror s : siffror.values()){
                System.out.println(s + " " + s.getNumbers());
            }
    }
    public enum siffror{
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int number;
        siffror(int number) {
            this.number = number;
        }
        public int getNumbers(){
            return number;
        }
    }
}