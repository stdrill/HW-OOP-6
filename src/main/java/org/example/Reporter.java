package org.example;

public class Reporter implements Reportable{
    private User user;

    public Reporter(User user){
        this.user = user;
    }
    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
