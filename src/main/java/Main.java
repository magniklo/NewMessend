import ru.itis503.Channel;
import ru.itis503.Group;
import ru.itis503.Message;
import ru.itis503.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Риф", "в сети");
        User user2 = new User("Соня", "не в сети");
        User user3 = new User("Риф", "в сети");
        user1.aboutUser();
        user2.aboutUser();
        user3.aboutUser();

        Group group = new Group("Информатика 11-503");
        Channel channel = new Channel("Счастливая жизнь хомяка");

        Message message1 = new Message(user1, user2, "Привет, гулять идем?", "22.01.25");
        Message message2 = new Message(user3, channel, "Вау какой хомяк ", "22.01.25");
        message1.aboutMessage();
        message2.aboutMessage();
    }
}
