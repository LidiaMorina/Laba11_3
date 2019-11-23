package com.company;

public class Magazine {
    public PostOffice postOffice;
    private String file;
    public Magazine(){
        this.postOffice = new PostOffice("Оповестить");
    }

    public void notify(String notify){
        System.out.println("Вышел новый журнал");
    }
}
