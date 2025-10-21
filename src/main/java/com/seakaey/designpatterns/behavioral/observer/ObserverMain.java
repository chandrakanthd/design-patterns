package com.seakaey.designpatterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        User user1 = new User("CK");
        User user2 = new User("Seakaey");

        Channel channel = new Channel();
        channel.addSubscriber(user1);
        channel.addSubscriber(user2);

        channel.addVideo("Coding live session");

        channel.removeSubscriber(user2);
        channel.addVideo("Debugging live session");
    }
}
