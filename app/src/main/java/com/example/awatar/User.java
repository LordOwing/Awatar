package com.example.awatar;

public class User {
    private String firstName;
    private String lastName;
    private int avatarResId;

    public User(String firstName, String lastName, int avatarResId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatarResId = avatarResId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAvatarResId() {
        return avatarResId;
    }
}
