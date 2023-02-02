package org.example.design_patterns.povedencheskie.mediator;

public class Runner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();

        User admin = new Admin(simpleTextChat, "Admin");
        User user1 = new SimpleUser(simpleTextChat, "User 1");
        User user2 = new SimpleUser(simpleTextChat, "User 2");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user1);
        simpleTextChat.addUserToChat(user2);

        user1.sendMessage("Hello, I am User 1");
        admin.sendMessage("Got it, I am Admin");
    }
}
