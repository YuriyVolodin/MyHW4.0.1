package ru.netology.iqa116;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test //#1 - Докинем 100 чтоб был кешбек?
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test //#2 - Нужно ли докидывать если сумма кратна той, что заявлена?
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test //№3 - Почти аналогично предыдущим, но в данном случае, проверяем сколько нужно докинуть, если оплата была выше чем 1000р
    public void shouldReturn500IfAmountIs2500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2_500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
}
