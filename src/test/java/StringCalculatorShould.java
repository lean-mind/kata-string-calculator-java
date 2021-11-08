import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {
    private StringCalculator stringCalculator;
    /*
     * TODO LIST
     * "" -> 0
     * "1,2,3" -> 6
     *
     */

    @Before
    public void setup(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void not_sum_not_numbers() {
        assertThat(stringCalculator.sum("")).isEqualTo(0);
    }

    @Test
    public void sum_separated_numbers(){
        assertThat(stringCalculator.sum("0")).isEqualTo(0);
    }
}
