package org.example.hwOOP02;

// Реализовать класс Market и все методы, которые он обязан реализовывать.
// Методы из интерфейса QueueBehaviour, имитируют работу очереди,
// MarketBehaviour – помещает и удаляет человека из очереди, 
// метод update – обновляет состояние магазина (принимает и отдает заказы)

public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.name = "Человек";
        Market mk = new Market();
        mk.update(hm);
    }
}