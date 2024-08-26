package homework5;

import homework5.ex2.Computer;
import homework5.ex2.ComputerSpy;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ex1();
        ex2();

    }

    private static void ex1() {
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";
        //Чтение файла из папки resources (без привязки к конкретному расположению проекта)
        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            BigDecimal[] donationSums = new BigDecimal[countries.length];
            for (int i = 0; i < donationSums.length; i++) {
                donationSums[i] = BigDecimal.ZERO;
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");

                if (parts.length == 2) {
                    String country = parts[0];
                    String amountStr = parts[1].replace(',', '.');

                    Pattern pattern = Pattern.compile("^\\d*.\\d*$");
                    if (pattern.matcher(amountStr).find()) {
                        try {
                            BigDecimal amount = new BigDecimal(amountStr);
                            boolean countryFound = false;

                            for (int i = 0; i < countries.length; i++) {
                                if (countries[i].equals(country)) {
                                    donationSums[i] = donationSums[i].add(amount);
                                    countryFound = true;
                                    break;
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ошибка: Некорректный формат: " + amountStr);
                        }
                    } else {
                        System.out.println("Некорректный формат суммы: " + amountStr);
                    }
                }
            }
            System.out.println("Список пожертвований по странам:");
            for (int i = 0; i < countries.length; i++) {
                System.out.printf("%s - %.2f\n", countries[i], donationSums[i]);
                scanner.close();
            }
        }
    }

    private static void ex2() {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.login("Alin");
        computerSpy.sendMessage("Hello World");
        computerSpy.logout();

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
    }
}
