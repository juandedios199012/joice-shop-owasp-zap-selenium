package helper;

import io.qameta.allure.internal.shadowed.jackson.core.JsonParseException;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.JsonMappingException;


import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import model.Login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataProvider {

    ObjectMapper objectMapper = new ObjectMapper();

    public Login getUserData() {
        try {
            File file= new File("src/test/resources/json/user.json");
            Scanner myReader = new Scanner(file);
            String data="";
            while (myReader.hasNextLine()) {
                 data += myReader.nextLine();
            }
            myReader.close();

            Login login  = objectMapper.readValue(data, Login.class);
            return login;
        } catch (JsonProcessingException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return new Login();
    }
}
