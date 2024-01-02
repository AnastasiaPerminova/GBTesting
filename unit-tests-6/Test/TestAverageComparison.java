import org.junit.jupiter.api.Test;

import javax.lang.model.type.ErrorType;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAverageComparison {

    AverageComparison averageComparison = new AverageComparison();

    @Test
    public void testFindingAverageCorrectData(){
        double[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {-5, 6, -7, 17, 25};
        double[] array3 = {2.3, 3.6, 3.5, 7.9};
        assertThat(averageComparison.findingAverage(array1)).isEqualTo(3);
        assertThat(averageComparison.findingAverage(array2)).isEqualTo(7.2);
        assertThat(averageComparison.findingAverage(array3)).isEqualTo(4.325);
    }

    @Test
    public void testFindingAverageEmptyData(){
        double[] array = {};
        assertThatThrownBy(() ->
                averageComparison.findingAverage(array)
        ).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void testFindingAverageOneNumber(){
        double[] array = {5};
        assertThat(averageComparison.findingAverage(array)).isEqualTo(5);
    }

    @Test
    public void testFindingAverageIsNull(){
        double[] array = {2, 10, -12};
        assertThat(averageComparison.findingAverage(array)).isEqualTo(0);
    }

    @Test
    public void testComparisonTwoDoubles(){
        assertThat(averageComparison.comparisonTwoDoubles(5, 17)).isEqualTo(17);
        assertThat(averageComparison.comparisonTwoDoubles(-20, -5)).isEqualTo(-5);
        assertThat(averageComparison.comparisonTwoDoubles(0, 0)).isEqualTo(1);
    }

    @Test
    public void testComparisonAverageTwoArraysCorrectData(){
        double[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {1, 2, 3, 4};
        double[] array3 = {1, 2, 6};
        assertThat(averageComparison.comparisonAverageTwoArrays(array1, array2)).isEqualTo("Первый список имеет большее среднее значение");
        assertThat(averageComparison.comparisonAverageTwoArrays(array2, array1)).isEqualTo("Второй список имеет большее среднее значение");
        assertThat(averageComparison.comparisonAverageTwoArrays(array1, array3)).isEqualTo("Средние значения равны");

    }

    @Test
    public void testComparisonAverageTwoArraysEmptyArray(){
        double[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {};
        assertThatThrownBy(() ->
                averageComparison.comparisonAverageTwoArrays(array1, array2)
        ).isInstanceOf(RuntimeException.class);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            averageComparison.comparisonAverageTwoArrays(array1, array2);
        });
        String expectedMessage = "В списке должно быть хотя бы одно число!";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);

    }

}


