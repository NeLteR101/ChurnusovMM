package com.company;

public class Main {

    public static void main(String[] args) {
        String password = "w311";
        String login = "admin";

        if ((password.equals(args[1]) && login.equals(args[0])) || ((password.equals(args[0]) && login.equals(args[1])))) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещён");
        }
    }

}



