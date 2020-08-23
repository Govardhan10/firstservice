package com.centime.firstservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class NameDetails {

    @Getter
    @Setter
    @JsonProperty("Name")
    private String name;

    @Getter
    @Setter
    @JsonProperty("Surname")
    private String surname;

    @Override
    public String toString() {
        return name + " " + surname;
    }

}
