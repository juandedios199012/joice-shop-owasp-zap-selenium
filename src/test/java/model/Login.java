package model;

public class Login {

    private final String emailLogin;
    private final String passwordLogin;

    public Login() {
        emailLogin = "user01@gmail.com";
        passwordLogin = "A1B2C3D4";
    }

    public String getEmailLogin() {
        return emailLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }
}
