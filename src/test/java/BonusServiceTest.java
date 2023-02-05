import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.Netology.BonusService;

public class BonusServiceTest {

    @Test
    public void testForRegistered() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 5000;
        boolean registered = true;
        long expected = 150;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testForUnRegistered() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 5000;
        boolean registered = false;
        long expected = 50;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testForUnRegisteredMinAmount() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100;
        boolean registered = false;
        long expected = 1;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForRegisteredMinAmount() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100;
        boolean registered = true;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testForRegisteredOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 17000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
