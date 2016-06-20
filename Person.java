public class Person  implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void doubleAge(){
        age *= 2;
    }
    public int compareAge(int age){
        return this.age - age;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " age: " + age;
    }
    @Override
    public int compareTo(Person otherPerson) {
        if (lastName.toUpperCase().compareTo(otherPerson.lastName.toUpperCase()) != 0 )
            return lastName.compareTo(otherPerson.lastName);

        return firstName.toUpperCase().compareTo(otherPerson.firstName.toUpperCase());
    }
}
