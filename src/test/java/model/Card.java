package model;

import com.github.javafaker.Faker;

public class Card {

    private final String name;
    private final String cardNumber;

    public Card() {
        var faker = new Faker();
        name = faker.name().name();
        cardNumber = faker.number().digits(16).replace('0', '1');
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
