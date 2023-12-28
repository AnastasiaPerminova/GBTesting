package seminars.third.hw;

public class MainHW {
    public boolean evenOddNumber(int number){
        return number % 2 == 0;
    }


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean isBetween25And100(int number){
        boolean isIn = number > 25 && number < 100;
        return isIn;
    }
}
