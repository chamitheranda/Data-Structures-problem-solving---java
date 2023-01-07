package com.company;

public class Driver {

    public static void main(String[] args) {
	Queue<Queue.Node> queue = new Queue<Queue.Node>();
    queue.enterForService(1, "car","full");
    queue.enterForService(2, "van","full");
    queue.enterForService(3, "bus","full");
    queue.enterForService(4, "car","full");
    queue.enterForService(5, "lorry","full");
    queue.enterForService(6, "byk","full");
    queue.showQueue();
    queue.exitService();
    queue.showQueue();
    queue.inLine(5);
    queue.inLine(15);
    }
}
