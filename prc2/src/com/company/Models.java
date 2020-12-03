// Models.java

package com.company;

class Author
{
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName()
    {
        return name;
    }

    String getEmail()
    {
        return email;
    }

    void setEmail(String email)
    {
        this.email = email;
    }

    char getGender()
    {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Author:\nName = %s\nEmail = %s\nGender = %c", getName(), getEmail(), getGender());
    }
}