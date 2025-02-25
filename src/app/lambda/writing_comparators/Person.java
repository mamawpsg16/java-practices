package app.lambda.writing_comparators;

public class Person {
    String name;
    int age;
    Double salary; // salary can be null

    public Person(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public Double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + salary;
    }
}