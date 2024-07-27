package homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class Homework1 {
    private BigDecimal sausages = new BigDecimal("2000.0");
    private BigDecimal ham = new BigDecimal("8511.0");
    private BigDecimal cervix = new BigDecimal("6988.0");

    public static void main(String[] args) {
        ex1();
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        Homework1 homework1 = new Homework1();
        Homework1.HornsAndHoovesCompany(homework1.sausages, homework1.ham, homework1.cervix);
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        scanner.nextLine();
        String operationSign = scanner.nextLine();


        System.out.println("Введите второе число");
        double secondNumber = scanner.nextDouble();

        if (operationSign.equals("+")) {
            double result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (operationSign.equals("-")) {
            double result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (operationSign.equals("*")) {
            double result = firstNumber * secondNumber;
            System.out.println(result);
        } else if (operationSign.equals("/")) {
            double result = firstNumber / secondNumber;
            System.out.println(result);
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }

    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        name = name.trim().toUpperCase();

        if (name.contains("ова ".toUpperCase())) {
            System.out.println("Уважаемая " + name);
        } else if (name.contains("ов ".toUpperCase())) {
            System.out.println("Уважаемый " + name);
        } else {
            System.out.println("Неизвестное лицо " + name);
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        //Работа на самостоятельное изучение функций класса String.
        //Заменить в строке 'this is' на 'those are',
        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replace("this is", "those are");
        System.out.println(simply);
        System.out.println("Индекс (число) второй буквы 'o' в строке: " + simply.lastIndexOf("o"));
    }

    public static void HornsAndHoovesCompany(BigDecimal sausages, BigDecimal ham, BigDecimal cervix) {
        BigDecimal sausageCost = new BigDecimal("800.0");
        BigDecimal costOfSausage = BigDecimal.ZERO;

        if (sausages.compareTo(new BigDecimal("1000.0")) < 0) {
            costOfSausage = new BigDecimal("412.0");
        } else if (sausages.compareTo(new BigDecimal("1000.0")) >= 0
                && sausages.compareTo(new BigDecimal("2000.0")) <= 0) {
            costOfSausage = new BigDecimal("408.0");
        } else if (sausages.compareTo(new BigDecimal("2000.0")) > 0) {
            costOfSausage = new BigDecimal("404.0");
        }

        BigDecimal hamCost = new BigDecimal("350.0");
        BigDecimal hamOfCost = new BigDecimal("275.0");

        BigDecimal cervixCost = new BigDecimal("500.0");
        BigDecimal cervixOfCost = BigDecimal.ZERO;

        if (cervix.compareTo(new BigDecimal("500.0")) < 0) {
            cervixOfCost = new BigDecimal("311.0");
        } else if (cervix.compareTo(new BigDecimal("500.0")) >= 0) {
            cervixOfCost = new BigDecimal("299.0");
        }

        BigDecimal incomeSausage = sausageCost.multiply(sausages);
        BigDecimal hamsIncome = hamCost.multiply(ham);
        BigDecimal incomeShake = cervixCost.multiply(cervix);
        BigDecimal income = incomeSausage.add(hamsIncome).add(incomeShake);

        BigDecimal sausageConsumption = costOfSausage.multiply(sausages);
        BigDecimal hamConsumption = hamOfCost.multiply(ham);
        BigDecimal neckFlow = cervixOfCost.multiply(cervix);

        BigDecimal consumption = sausageConsumption.add(hamConsumption)
                .add(neckFlow).add(new BigDecimal("1000000.0"));

        BigDecimal profitBeforeTax = income.subtract(consumption);

        BigDecimal taxRate = BigDecimal.ZERO;

        if (profitBeforeTax.compareTo(new BigDecimal("2000000.0")) > 0) {
            taxRate = new BigDecimal("13.0");
        } else if (profitBeforeTax.compareTo(new BigDecimal("1000000.0")) > 0 &&
                profitBeforeTax.compareTo(new BigDecimal("2000000.0")) <= 0) {
            taxRate = new BigDecimal("10.0");
        } else if (profitBeforeTax.compareTo(new BigDecimal("1000000.0")) <= 0) {
            taxRate = new BigDecimal("8.0");
        }
        BigDecimal taxAmount = profitBeforeTax.multiply(taxRate).divide(new BigDecimal("100.0"));
        BigDecimal profitAfterTax = profitBeforeTax.subtract(taxAmount);
        System.out.println("Прибыль после налогов: " + profitAfterTax +
                "\nприбыль до налогов: " + profitBeforeTax + "\nналог: " + taxAmount);
    }

}