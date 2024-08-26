package homework5.ex2;

public class Computer {
    private String userName;

    public void login(String userName) {
        this.userName = userName;
        System.out.println("Пользователь: " + userName + " вошел в систему ");
    }

    public void logout() {
        this.userName = null;
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public String getUserName() {
        return userName;
    }
}
