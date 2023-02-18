package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        Saveable saveable = new Persister(user);
        saveable.save();
        Reportable reportable = new Reporter(user);
        reportable.report();
    }
}