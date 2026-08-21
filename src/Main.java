import java.util.Arrays;

public class Main {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
        }
    }
    public static class Person {
        private String name;
        private String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        @Override
        public String toString() {
            return this.name + " " + this.surname;
        }
    }
    public static void main(String[] args) {
        Person person = new Person("Fedor", "Dostoevskiy");
        changePerson(person);
        System.out.println("person = " + person);
    }

    public static void changePerson(Person person) {
        person = new Person("Lev", "Tolstoy");
    }
}