package util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Request {
    Client ApiClient = ClientBuilder.newBuilder().build();
    ResponseInformation responseInformation = new ResponseInformation();

    public Request() {
    }

    public ResponseInformation sendGetRequest(String url) {

        System.out.println("Request > " + url);

        Response res = ApiClient.target(url)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get();

        responseInformation.setBody(res.readEntity(String.class));
        responseInformation.setCode(res.getStatus());
        System.out.println("Response > code: " + responseInformation.getCode());
        System.out.println("Response > body: " + responseInformation.getBody());
        return responseInformation;
    }

}
