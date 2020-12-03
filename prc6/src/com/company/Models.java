// Models.java:

package com.company;

class Student
{
    private Integer id;
    private String  firstname;
    private String  secondname;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", age=" + age +
                " }";
    }

    // for test

    static String[] firstnames = new String[] { "Noah", "Liam", "William", "Mason", "James", "Benjamin" };
    static String[] lastnames  = new String[] { "Adderiy", "Allford", "Arnold" };

    public static Student[] getSamples()
    {
        var students = new Student[10];

        for (int i = 0; i < 10; i++)
        {
            var student = new Student();
            student.setFirstname(firstnames[i % firstnames.length]);
            student.setSecondname(lastnames[i % lastnames.length]);
            student.setAge(16 + i);
            student.setId(i + 1);

            students[i] = student;
        }

        return students;
    }
}