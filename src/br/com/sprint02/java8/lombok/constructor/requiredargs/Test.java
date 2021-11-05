package br.com.sprint02.java8.lombok.constructor.requiredargs;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor
public class Test {

    private double id;

    @NonNull
    private String username;

    @NonNull
    private String email;

    private final boolean status;

    private final boolean status2 = true;



    // construtor sem o lombok
    public Test(@NonNull final String username, @NonNull final String email, final boolean status) {
        if (username == null) {
            throw new NullPointerException("username is marked non-null but is null");
        }
        if (email == null) {
            throw new NullPointerException("email is marked non-null but is null");
        }
        this.username = username;
        this.email = email;
        this.status = status;
    }


    // Lombok @RequiredArgsConstructor will not generate any argument for following fields

    // Non-final fields.
    // Initialized non-null fields.
    // Initialized final fields.
    // static fields.

}
