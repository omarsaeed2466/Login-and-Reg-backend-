package com.example.Login.and.Registration.Backend.Email.Verification.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName ;
    private final String lastName ;
    private final String email ;
    private final String password ;

}
