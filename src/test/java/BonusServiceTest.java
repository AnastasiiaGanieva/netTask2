import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calcRegisteredFalse() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);


        // выводим результат
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcRegisteredTrue() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);


        // выводим результат
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //бонус больше лимита
    void calcLimitMore() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 30000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);


        // выводим результат
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //бонус меньше лимита
    void calcLimitLess() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 4000_60;
        boolean registered = false;
        long expected = 40;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);


        // выводим результат
        assertEquals(expected, actual);
    }

}
