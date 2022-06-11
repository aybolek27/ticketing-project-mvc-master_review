package com.cydeo.enums;

public enum Status {


    OPEN("Open"), COMPLETE("Completed"), IN_PROGRESS("In Progress") ;
    private final String value;

    private Status(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
