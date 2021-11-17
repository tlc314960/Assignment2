import org.junit.Test;

import static org.valid4j.Assertive.*;

/*
* Task 4
*
* Show how your example works by implementing JUnit tests or a small Java application
* */

public class ExampleTest {

    @Test
    public void shouldPassWhenRequiredConditionIsTrue() {
        Student std2 = new SSE();
        std2.setYear(new Freshman());
        std2.info();
        require(std2.getYear() instanceof Freshman);
    }
}
