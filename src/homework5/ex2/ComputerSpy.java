package homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {
    private Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login(String userName) {
        log("Пользователь: " + userName + " вошел");
        computer.login(userName);
    }

    @Override
    public void logout() {
        log("Пользователь вышел");
        computer.logout();
    }

    @Override
    public void sendMessage(String message) {

        log("Пользователь: " + computer.getUserName() + " отправил сообщение " + message);
        computer.sendMessage(message);
    }

    private void log(String message) {
        try (FileWriter file = new FileWriter("comp.log", true)) {
            file.write((message + "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
