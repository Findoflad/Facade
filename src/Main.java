/*
Паттерн проектирования "Фасад" (Facade) - это структурный паттерн,
который предоставляет унифицированный интерфейс к набору интерфейсов в подсистеме.
Фасад определяет высокоуровневый интерфейс, упрощающий использование подсистемы, делая её более удобной и понятной.

Основные компоненты паттерна "Фасад":
    Фасад (Facade): Предоставляет унифицированный интерфейс для более крупного набора интерфейсов в подсистеме.
        Фасад выступает в роли входной точки для клиентского кода.

    Подсистема (Subsystem): Это набор классов, реализующих функциональность подсистемы.
        Фасад делегирует запросы от клиентов соответствующим объектам внутри подсистемы.
*/

public class Main {
    public static void main(String[] args) {
        int bankAccount = 123417564;
        String address = "Raccoon Hole Number Zero";

        Hacker.BuyACupOfCofee(bankAccount, address);
    }
}

// Фасад для библиотеки Hacker
class Hacker {
    static public void MakeMoney(int bankAccount) {
        String[] BankAccount;
        Object PersonalAccountData;

        do {
            BankAccount = Subsystem.Hacker.BuyYuanCheap();
        } while (BankAccount == null);

        try {
            PersonalAccountData = Subsystem.Hacker.СonvertСurrency(BankAccount[0], BankAccount[1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("C индексацией проблема");
            return;
        }

        Subsystem.Hacker.SellCurrency(PersonalAccountData, bankAccount);
        System.out.println("Your bank account has been replenished");
    }

    static public boolean BuyACupOfCofee(int bankAccount, String address) {
        while (!Subsystem.Hacker.BuyCupOfCofee(bankAccount, address)) {
            System.out.println("Not enough money");
            MakeMoney(bankAccount);
        }

        System.out.println("Сoffee will be delivered to " + address + " soon");
        return true;
    }
}
