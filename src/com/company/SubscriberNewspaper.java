package com.company;


//конкретный подписчик: подписчик на газеты
public class SubscriberNewspaper implements Subscribers {

    private String newspaper ;

    public SubscriberNewspaper(String newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public void update(String alert){
        System.out.println("Журнал: " + newspaper + "получен ");
        System.out.println("Спасибо за оповещение.");
    }
}
