package main.com.myApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "passport")
@Getter
@Setter
@NoArgsConstructor
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
private Person person;

    @Column(name = "pass_number")
private String pass_number;

    @Column(name = "exp_date")
private String exp_date;

    public Passport( String pass_number, String exp_date) {

        this.pass_number = pass_number;
        this.exp_date = exp_date;
    }
}
