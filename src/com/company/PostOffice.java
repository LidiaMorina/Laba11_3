package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//издательство Publisher
public class PostOffice {

    Map<String, List<Subscribers>> subscribers = new HashMap<>();

    public PostOffice(String... operations) {
        for (String operation : operations) {
            this.subscribers.put(operation, new ArrayList<>());
        }
    }

    //подписаться
    public void subscribe(String eventType,Subscribers subscriber) {
        List<Subscribers> users = subscribers.get(eventType);
        users.add(subscriber);
    }

    //отписаться от подписки
    public void unsubscribe(String eventType, Subscribers subscriber) {
        List<Subscribers> users = subscribers.get(eventType);
        users.remove(subscriber);
    }


}
