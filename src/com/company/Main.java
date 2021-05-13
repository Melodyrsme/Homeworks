package com.company;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook("Азиза", 20, "Ахунбаева/Советская", "женский",
                "Повар", 25000, 10000, 1000, 5, 30,
                "Лагман, Плов, Манты ...", "Приготовление пищи", 3);
        Waiter[] waiters = new Waiter[3];
        waiters[0] = new Waiter("Бермет", 20, "Джал", "женский",
                "Официант", 15000, 2000, 300, 1, 10);
        waiters[1] = new Waiter("Руслан", 23, "Арча-Бешик", "мужской",
                "Официант", 20000, 4000, 800, 2, 20);
        waiters[2] = new Waiter("Нурдин", 20, "Ак-Ордо", "мужской",
                "Официант", 35000, 10000, 9000, 5, 30);
        Security security = new Security("Эрлан", 28, "Чуй/Турусбекова",
                "мужской", "Охраник", 10000, 3000, 100, 1,
                7, true, "Дубинка");
        Client[] clients = new Client[6];
        clients[0] = new Client("Pink", 15, "Чуй/Алматинка", "женский", false, 0, false);
        clients[1] = new Client("Blonde", 25, "Боконбаева 137", "женский", true, 300, true);
        clients[2] = new Client("Orange", 35, "Белинская/Боконбаева", "мужской", true, 2000, true);
        clients[3] = new Client("White", 12, "Чуй/Белинка", "женский", false, 0, false);
        clients[4] = new Client("Blue", 27, "Ахунбаева/Тыныстанова", "мужской", false, 0, true);
        clients[5] = new Client("Brown", 20, "Дордой", "мужской", true, 1000, true);
        System.out.println(cook);
        cook.toLate();
        System.out.println("Обязанности повара:");
        cook.goToProduct();
        cook.inventDish();
        cook.cookDish();
        System.out.println();
        for (int i = 0; i < waiters.length; i++) {
            System.out.println(waiters[i]);
            waiters[i].toLate();
            System.out.println("Обязанности официантов:");
            waiters[i].exceptAnOrder();
            waiters[i].referAnOrder();
            waiters[i].calculate();
            System.out.println();
        }
        System.out.println(security);
        security.toLate();
        System.out.println("Обязанности охраника:");
        security.kickPeopleOut();
        System.out.println();
        for (int i = 0; i < clients.length; i++) {
            System.out.println(clients[i]);
            System.out.println();
        }
    }
}