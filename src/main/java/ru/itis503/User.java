package ru.itis503;

public class User {
    private String name;
    private String state;

    public User(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public void aboutUser() {
        System.out.println(name + "   " + state);
    }

}
