import classes.Instagram;
import exception.AgeException;
import exception.MyException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Instagram instagram = new Instagram();

        try {
            System.out.println("data for registration");
            instagram.setName(scanner.nextLine());
            instagram.setLastName(scanner1.nextLine());

            instagram.setAge(scanner1.nextInt());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            instagram.setEmail(scanner.nextLine());
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            instagram.setPassword(scanner.nextInt());
        }catch (MyException e1){
            System.out.println(e1.getMessage());
        }
    }

    }
 /*   При регистрации зарпашивается имя, фамилия, возвраст, электронная почта и пароль.
        Учтите всевозможные не предвиденные случаи(Exception). При вводе возвраста
        пользователь должен вводить только цифры, иначе выбрасывается исключение. При
        вводе электронной почты должны проверять содержится ли знак '@', а если нет
        выбрасывается (BadRequestException). При вводе пароля, проверяете длину, то есть
        пароль должен содержать минимум 7 символов, иначе выбрасывается исключение
        (BadRequestException).

        Создайте пакет exceptions там будут ваши классы наследовавшие классы исключений.
        В main запустите вашу программу.
        Обработайте исключения!/*
  */


