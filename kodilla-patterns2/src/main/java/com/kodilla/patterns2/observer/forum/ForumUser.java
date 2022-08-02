package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {

    private final String userName;
    private int updateCount;

    public ForumUser(String username) {
        this.userName = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName + ": New messages in topic " + forumTopic.getName() + "\n" +
                " (total: " + forumTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
