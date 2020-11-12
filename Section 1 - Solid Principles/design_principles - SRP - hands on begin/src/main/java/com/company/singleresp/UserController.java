package com.company.singleresp;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private UserPersistenceService persistenceService = new UserPersistenceService();
    private UserValidator userValidator = new UserValidator();
    private UserMapperService userMapperService = new UserMapperService();

    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        User user = userMapperService.mapUser(userJson);

        if(!userValidator.isValidUser(user)) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        return "SUCCESS";
    } 



}