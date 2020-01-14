import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author pengjunjie
 * @create 2020-01-14 10:45 AM
 */
public class FizzBuzzTest {
    @ParameterizedTest(name = "input {0} should return {1}")
    @CsvSource({
            "1,'1'",
            "3,'Fizz'",
            "5,'Buzz'",
            "15,'FizzBuzz'",
    })
    public void test_FizzBuzz(int i,String o) {
        Assert.assertEquals(FizzBuzz.out(i),o);
    }
}
