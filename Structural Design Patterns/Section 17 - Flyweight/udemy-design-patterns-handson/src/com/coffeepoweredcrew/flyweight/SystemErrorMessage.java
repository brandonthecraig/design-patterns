package com.coffeepoweredcrew.flyweight;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage{

    // intrinsic state that is shared by all

    //some error message $errorCode
    private String messageTemplate;

    // http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.helpUrlBase = helpUrlBase;
        this.messageTemplate = messageTemplate;
    }
    @Override
    // extrinsic state that is coming in from method parameter
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}
