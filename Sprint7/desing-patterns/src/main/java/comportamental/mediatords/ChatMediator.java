package comportamental.mediatords;

public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}