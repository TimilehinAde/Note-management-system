package com.timmy.notes.data.dtos.request;

import lombok.Data;

@Data
public class UpdateRequest {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
}
