package com.lombok.app;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

//@Setter(value = AccessLevel.PUBLIC)
//@Getter(value = AccessLevel.PUBLIC)
/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(includeFieldNames = false)
@EqualsAndHashCode*/
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//Builder
@Value
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
public class Person {

    Long id;
    String name;
    String lastName;
    String email;
    Integer age;
    Integer phoneNumber;
    LocalDate dateOfBirth;

    /*@Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }*/
}
