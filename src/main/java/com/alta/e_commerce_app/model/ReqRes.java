package com.alta.e_commerce_app.model;

// import com.alta.e_commerce_app.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

// import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    // private String refreshToken;
    // private String expirationTime;
    private String name;
    private String city;
    private String role;
    private String email;
    private String password;
    // private User users;
    // private List<User> userList;

}
