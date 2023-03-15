package model;

import com.github.javafaker.Faker;

public class Register {

    private final String email;
    private final String password;
    private final int question;
    private final String answer;

    public Register() {
        var faker = new Faker();
        email = faker.internet().emailAddress();
        password = faker.internet().password();
        answer = faker.name().name();
        question=1;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAnswer() {
        return answer;
    }

    public int getQuestion() {
        return question;
    }
}
