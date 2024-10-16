import java.util.LinkedHashMap;
import java.util.Map;

public class ChangeCalculator {
    public static Map<Integer, Integer> calculateChange(int price, int payment){
        if (payment < price){
            throw new IllegalArgumentException("payment must be greater than or equal to price");
        }
        int change = payment - price;
        int[] denominations = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int denom: denominations){
            if(change >= denom){
                int count = change / denom;
                result.put(denom, count);
                change -= denom * count;
            }
        }
        return result;
    }
}
