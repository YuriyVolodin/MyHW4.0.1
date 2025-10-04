package ru.netology.iqa116;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test //#1 - Докупи на 100р, чтоб получить кешбек
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test //#2 - Нужно ли докупать, если покупка кратна 1000р?
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1_000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test //№3 - Нужно ли докупать, если покупка более 1000р и делится с остатком
    public void shouldReturn500IfAmountIs2500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2_500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}
