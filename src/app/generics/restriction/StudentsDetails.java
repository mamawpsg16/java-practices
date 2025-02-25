package app.generics.restriction;

import java.util.HashMap;
import java.util.Map;

public class StudentsDetails <K,V>{
    Map<K, V> students;

    public StudentsDetails() {
        this.students = new HashMap<>();
    }

    // Add a key-value pair
    public void put(K key, V value) {
        this.students.put(key, value);
    }

    public void getStudents(){
        for (Map.Entry<K, V> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + ", Name: " + student.getValue());
        }
    }
}
