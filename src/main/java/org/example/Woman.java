package org.example;

public class Woman extends Person {
    private String originalSurname = getLastName();

    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    @Override
    public boolean isRetired() {
        if (getAge() > 60) {
            return true;
        } else {
            return false;
        }
    }
    public String getLastNameOriginal() {
        return getLastName();
    }

    public void setLastNameOriginal(String getLastName) {
        this.originalSurname = getLastName;
    }
    public void registerPartnership(String husbandSurname) {
        this.setLastName(husbandSurname);
    }

    public void deregisterPartnership(boolean isDeregistrated) {
        if (isDeregistrated == true) {
            this.setLastName(originalSurname);
        }
    }
}

