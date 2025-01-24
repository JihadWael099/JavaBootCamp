package main.com.myApp.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "person")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Person {

    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

@Column(name = "firstName")
 private String firstName;

@Column(name = "lastNamW")
 private String lastNamw;

    @OneToOne(mappedBy = "person")
    private Passport passport;


@Column(name = "date_of_birth")
 private String date_of_birth;

    public Person(String firstName, String lastNamw, String date_of_birth) {
        this.firstName = firstName;
        this.lastNamw = lastNamw;
        this.date_of_birth = date_of_birth;
    }
}
