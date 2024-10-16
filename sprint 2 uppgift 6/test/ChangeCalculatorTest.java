import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ChangeCalculatorTest {

    @Test
    public void testExactPayment() {
        // Om pris och betalt belopp är samma, ska växel vara tom (inget att ge tillbaka)
        Map<Integer, Integer> expected = Map.of(); // Tom växel
        assertEquals(expected, ChangeCalculator.calculateChange(1000, 1000));
    }

    @Test
    public void testSimpleChange() {
        // Om priset är 950 och betalt är 1000, ska växeln vara 50 kr (1 st 50-lapp)
        Map<Integer, Integer> expected = Map.of(50, 1);
        assertEquals(expected, ChangeCalculator.calculateChange(950, 1000));
    }

    @Test
    public void testLargeChange() {
        // Om priset är 376 och betalt är 1000, ska växeln vara 624 kr
        // Växeln ska vara: 1 st 500-lapp, 1 st 100-lapp, 1 st 20-lapp, 2 st 2-kronor
        Map<Integer, Integer> expected = Map.of(
                500, 1,
                100, 1,
                20, 1,
                2, 2
        );
        assertEquals(expected, ChangeCalculator.calculateChange(376, 1000));
    }

    @Test
    public void testVariousDenominations() {
        // Om priset är 1337 och betalt är 2000, ska växeln vara 663 kr
        // Växeln ska vara: 1 st 500-lapp, 1 st 100-lapp, 1 st 50-lapp, 1 st 10-krona, 1 st 2-krona, 1 st 1-krona
        Map<Integer, Integer> expected = Map.of(
                500, 1,
                100, 1,
                50, 1,
                10, 1,
                2, 1,
                1, 1
        );
        assertEquals(expected, ChangeCalculator.calculateChange(1337, 2000));
    }

    @Test
    public void testInsufficientPayment() {
        // Om betalt belopp är mindre än priset, bör det kasta ett undantag
        assertThrows(IllegalArgumentException.class, () -> {
            ChangeCalculator.calculateChange(1000, 900);
        });
    }
}
