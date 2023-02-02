package org.example.design_patterns.povedencheskie.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user1 : users) {
            if (user1 != user) {
                user1.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
