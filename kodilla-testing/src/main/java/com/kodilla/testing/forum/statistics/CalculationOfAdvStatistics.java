package com.kodilla.testing.forum.statistics;

public class CalculationOfAdvStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averagePostsNumberPerUser;
    private int averageCommentsNumberPerUser;
    private int averageCommentsNumberPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public int getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public void setAveragePostsNumberPerUser(int averagePostsNumberPerUser) {
        this.averagePostsNumberPerUser = averagePostsNumberPerUser;
    }

    public int getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public void setAverageCommentsNumberPerUser(int averageCommentsNumberPerUser) {
        this.averageCommentsNumberPerUser = averageCommentsNumberPerUser;
    }

    public int getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }

    public void setAverageCommentsNumberPerPost(int averageCommentsNumberPerPost) {
        this.averageCommentsNumberPerPost = averageCommentsNumberPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        setNumberOfUsers(statistics.userNames().size());
        setNumberOfPosts(statistics.postCount());
        setNumberOfComments(statistics.commentsCount());
        if(numberOfUsers == 0){
            setAverageCommentsNumberPerUser(0);
            setAveragePostsNumberPerUser(0);
        } else {
            setAverageCommentsNumberPerUser(numberOfComments / numberOfUsers);
            setAveragePostsNumberPerUser(numberOfPosts / numberOfUsers);
        }
        if(numberOfPosts == 0){
            setAverageCommentsNumberPerPost(0);
        } else {
            setAverageCommentsNumberPerPost(numberOfComments / numberOfPosts);
        }
    }

    public String showStatistics(){
        return "Forum statistics: " + "Numbers of users: " + getNumberOfUsers() + "number of posts: " + getNumberOfPosts() + "numbers of comments: " + getNumberOfComments() + "Average statistics: \n" + "Aver no of comments per user: " + getAverageCommentsNumberPerUser() + " Aver no of comments per post: " + getAverageCommentsNumberPerPost() + "Aver no of posts per User: " + getAveragePostsNumberPerUser();

    }
}
