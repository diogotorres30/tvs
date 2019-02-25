package ap;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCalculator {
    @Test
    public void sumTestCalculator() {
        System.out.println(Calculator.sum(3,4));
        }
}