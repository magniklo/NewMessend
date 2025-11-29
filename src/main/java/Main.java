import ru.itis503.Channel;
import ru.itis503.Group;
import ru.itis503.Message;
import ru.itis503.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в мессенжер SRG!");
        System.out.println("имя:   статус:");
        System.out.println();
        User user1 = new User("Макс", "в сети");
        User user2 = new User("Соня", "не в сети");
        User user3 = new User("Глеб", "в сети");
        user1.aboutUser();
        user2.aboutUser();
        user3.aboutUser();
        System.out.println();
        System.out.println("Собщения отправленные за последние 5 дней:");
        Group group = new Group("Информатика 11-503");
        Channel channel = new Channel("Счастливая жизнь хомяка");

        Message message1 = new Message(user1, user2, "Привет, гулять идем?", "22.01.25");
        Message message2 = new Message(user3, channel, "Вау какой хомяк", "22.01.25");
        Message message3 = new Message(user2, group, "Я не буду на паре", "23.01.25");
        Message message4 = new Message(user1, channel, "А где купили?", "23.01.25");
        Message message5 = new Message(user3, user1, "Купи мне шоколадку", "24.01.25");
        message1.aboutMessage();
        message2.aboutMessage();
        message3.aboutMessage();
        message4.aboutMessage();
        message5.aboutMessage();
    }
}
