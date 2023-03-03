package classes;

import exception.MyException;

public class Instagram {
    private String name;
    private String lastName;
    private int age;
    private String email;
    private int password;

    public Instagram() {


    }

    public Instagram(String name, String lastName, int age, int password, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyException {
        this.age = age;
        if (age <= 0) {
            throw new MyException("Age cannot be below zero!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws MyException {

    if (!email.contains("@")){
        throw new MyException("Email must contain the @ symboll!");
    }

    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) throws MyException{
        if (password<=0){
            throw new MyException("Password must containt at least 7 characters");
        }
    }
}
