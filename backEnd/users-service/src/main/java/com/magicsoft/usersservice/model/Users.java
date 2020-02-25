package com.magicsoft.usersservice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USERS")
public class Users {

    
    private String firstName;
    private String lastName;
    

    public Users() {

    }

    public Users(String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

     

    @Column(name = "first_name", nullable = false)
    @Id
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = true)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     
}