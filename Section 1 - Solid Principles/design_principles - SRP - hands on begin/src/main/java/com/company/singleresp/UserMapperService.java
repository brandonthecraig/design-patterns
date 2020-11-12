package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserMapperService {

    private ObjectMapper mapper = new ObjectMapper();

    public User mapUser (String userJson) throws IOException {
        return mapper.readValue(userJson, User.class);
    }
}
