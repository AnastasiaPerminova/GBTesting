package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
       // Тесты для проверки метода calculatingDiscount

         assertThat(seminars.first.Calculator.Calculator.calculatingDiscount(1000,15)).isEqualTo(850);
         assertThat(seminars.first.Calculator.Calculator.calculatingDiscount(2000,10)).isEqualTo(1800);
         assertThat(seminars.first.Calculator.Calculator.calculatingDiscount(220.30,10)).isEqualTo(198.27);

         assertThatThrownBy(() ->
                 seminars.first.Calculator.Calculator.calculatingDiscount(5, -25)
         ).isInstanceOf(ArithmeticException.class);

    }

}