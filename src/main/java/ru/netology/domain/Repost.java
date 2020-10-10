package ru.netology.domain;

public class Repost {

    private int ownerId;
    private int fromId;
    private int OnYourWall;
    private int friends;
    private int persMessage;
    private int otherCommunity;
    private String textMessege;
    private int count;
    private int likesInfo;
    private int choiceOfFriend;
    private int datePublication;
    private int timePublication;
    private boolean open;
    private boolean close;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getOnYourWall() {
        return OnYourWall;
    }

    public void setOnYourWall(int onYourWall) {
        OnYourWall = onYourWall;
    }

    public int getFriends() {
        return friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public int getPersMessage() {
        return persMessage;
    }

    public void setPersMessage(int persMessage) {
        this.persMessage = persMessage;
    }

    public int getOtherCommunity() {
        return otherCommunity;
    }

    public void setOtherCommunity(int otherCommunity) {
        this.otherCommunity = otherCommunity;
    }

    public String getTextMessege() {
        return textMessege;
    }

    public void setTextMessege(String textMessege) {
        this.textMessege = textMessege;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public int getChoiceOfFriend() {
        return choiceOfFriend;
    }

    public void setChoiceOfFriend(int choiceOfFriend) {
        this.choiceOfFriend = choiceOfFriend;
    }

    public int getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }

    public int getTimePublication() {
        return timePublication;
    }

    public void setTimePublication(int timePublication) {
        this.timePublication = timePublication;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }
}
