package first.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

        Calculator calculator = new Calculator();

        @Test
        public void testCalculateDiscountWithValidArguments () {
            double actualTotalAmount = calculator.calculateDiscount(100.0, 10.0);
            double expectedTotalAmount = 90.0;

            Assertions.assertThat(actualTotalAmount).isEqualTo(expectedTotalAmount);
        }

        @Test
        public void testCalculateDiscountWithNegativePurchaseAmount () {
            Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(-100.0, 10.0))
                    .isInstanceOf(ArithmeticException.class)
                    .hasMessage("Invalid arguments");
        }

        @Test
        public void testCalculateDiscountWithNegativeDiscountPercentage () {
            Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(100.0, -10.0))
                    .isInstanceOf(ArithmeticException.class)
                    .hasMessage("Invalid arguments");
        }

        @Test
        public void testCalculateDiscountWithInvalidDiscountPercentageOver100 () {
            Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(100.0, 110.0))
                    .isInstanceOf(ArithmeticException.class)
                    .hasMessage("Invalid arguments");
        }
    }
