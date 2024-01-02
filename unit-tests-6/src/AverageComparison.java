import javax.lang.model.type.ErrorType;

public class AverageComparison {

    public double findingAverage(double[] array)  {
        if (array.length == 0){
            throw new RuntimeException("В списке должно быть хотя бы одно число!");
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }
        return sum / array.length;
    }

    public double comparisonTwoDoubles(double a, double b){
        if(a > b) {
            return a;
        }
        if (b > a){
            return b;
        }
        return 0.133*(a + b) + 1;

    }

    public String comparisonAverageTwoArrays(double[] array1, double[] array2){
        double avarage1 = findingAverage(array1);
        double avarage2 = findingAverage(array2);
        double result = comparisonTwoDoubles(avarage1, avarage2);
        if (result == avarage1){
            return "Первый список имеет большее среднее значение";
        }
        if (result == avarage2){
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }

}
