package pl.coderslab.app.student;

import java.util.List;

public class Student {

    private  String firstName;
    private  String lastName;
    private  String gender;
    private  String country;
    private  String notes;
    private  boolean mailingList;
    private  List programmingSkills;
    private  List hobbies;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    public List getProgrammingSkills() {
        return programmingSkills;
    }

    public void setProgrammingSkills(List programmingSkills) {
        this.programmingSkills = programmingSkills;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

}
