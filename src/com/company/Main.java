package com.company;
/*паттерн Наблюдатель*/
public class Main {

    public static void main(String[] args) {

    Newspaper newspaper = new Newspaper();
    Magazine magazine = new Magazine();
    newspaper.postOffice.subscribe("alert", new SubscriberMagazine());
    magazine.postOffice.subscribe("alert", new SubscriberMagazine());

    }
}
