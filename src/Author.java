import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    @Override
    public String toString() {
        return "Автор: " + lastName + " " + firstName + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Author author = (Author) obj;
        return (firstName == author.firstName) || (firstName != null && firstName.equals(author.getFirstName()))
                && (lastName == author.lastName) || (lastName != null && firstName.equals(author.getLastName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
