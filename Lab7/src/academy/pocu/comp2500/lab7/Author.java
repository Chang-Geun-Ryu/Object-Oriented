package academy.pocu.comp2500.lab7;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
//        return "Author{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !(o instanceof Author)) {
            return false;
        }

        Author author = (Author) o;
        return this.firstName.equals(author.firstName) &&
                this.lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        int prime = 37;
        hash = hash * prime + this.firstName.hashCode();// ^ (this.lastName.hashCode() << 16);
        hash = (hash * prime) ^ (this.lastName.hashCode() << 16);
        return hash;
    }
}
