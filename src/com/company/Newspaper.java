package com.company;
//конкретный издатель: издатель газет
public class Newspaper {
    public PostOffice postOffice;
    private String file;
    public Newspaper(){
        this.postOffice = new PostOffice("alert");
    }

    public void notify(String notify){
        System.out.println("Вышла новая газета");
    }
}
