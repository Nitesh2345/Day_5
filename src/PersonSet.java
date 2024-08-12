import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
//public class CustomObjectSetOperation {
    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public class PersonSet {
        private Set<Person> personSet;

        public PersonSet() {
            personSet = new HashSet<>();
        }

        public void addPerson(Person person) {
            personSet.add(person);
        }

        public boolean containsPerson(Person person) {
            return personSet.contains(person);
        }

        public static void main(String[] args) {
            PersonSet personSet = new PersonSet();
            Person person1 = new Person("Alice", 30);
            Person person2 = new Person("Bob", 25);

            personSet.addPerson(person1);
            personSet.addPerson(person2);

            System.out.println("Contains Alice: " + personSet.containsPerson(new Person("Alice", 30)));
            System.out.println("Contains Bob: " + personSet.containsPerson(new Person("Bob", 25)));
            System.out.println("Contains Charlie: " + personSet.containsPerson(new Person("Charlie", 35)));
        }
    }


