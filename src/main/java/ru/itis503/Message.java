package ru.itis503;

public class Message {
    private User user; // от кого
    private Group group;
    private Channel channel;
    private Object object; // кому
    private String message;
    private String time;

    public Message(User user, Object object, String message, String time) {
        this.user = user;
        this.object = object;
        this.message = message;
        this.time = time;

    }

    private  String infoObject() {
        if (object instanceof User) return ((User) object).getName();
        else if (object  instanceof Group) return ((Group) object).getName();
        else return ((Channel) object).getName();
    }

    public void aboutMessage(){
        System.out.print("Отправлено сообщение { " +
                "От - " + user.getName() +
                ", кому - " + infoObject() +
                ",сообщение - " + message + " }");
        System.out.print("Дата отправления - " + time);
    }


}