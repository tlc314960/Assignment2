import org.junit.Test;

import static org.valid4j.Assertive.*;

/*
 * Task 7
 *
 * Show how your implementation of arithmetic expressions calculator works by writing some JUnit Tests
 * */

public class ExampleTest {

    @Test
    public void shouldPassWhenRequiredConditionIsTrue() {
        System.out.println("1234".substring(3,4));
        require(true);
    }

}
