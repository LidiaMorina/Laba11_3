package com.company;

import java.io.File;

//конкретный подписчик: подписчик на журналы
public class SubscriberMagazine  implements Subscribers {

    private String magazine ;

    public SubscriberMagazine(String magazine) {
        this.magazine = magazine;
    }

    public SubscriberMagazine() {

    }

    @Override
    public void update(String alert){
        System.out.println("Журнал: " + magazine + "получен ");
        System.out.println("Спасибо за оповещение.");
    }
}
