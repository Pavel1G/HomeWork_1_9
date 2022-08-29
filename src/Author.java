import java.util.Objects;

public class Author {
    String name;
    String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAuthor() {
        return name + " " + surname;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    // Переопределяем метод сравнения. Сравниваем по полю класса.
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Author newAuthor = (Author) obj;
        return this.surname == newAuthor.surname;
    }

    // Переопределяем метод toString
    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
