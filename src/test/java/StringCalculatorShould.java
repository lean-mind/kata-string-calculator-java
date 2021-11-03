import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {
    /*
     * TODO LIST
     * "" -> 0
     * "1,2,3" -> 6
     *
     */

    @Test
    public void not_sum_not_numbers() {
        assertThat(StringCalculator.sum("")).isEqualTo(0);
    }

    @Test
    public void sum_separated_numbers(){
        assertThat(StringCalculator.sum("0")).isEqualTo(0);
    }
}
