package com.seakaey.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    public List<User> subscribers = new ArrayList<>();

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }

    public void addVideo(String video) {
        System.out.println("New video added: " + video);
        notifySubscribers();
    }

    private void notifySubscribers() {
        subscribers.forEach(User::notification);
    }
}
