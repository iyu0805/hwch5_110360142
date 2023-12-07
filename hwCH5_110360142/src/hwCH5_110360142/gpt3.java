package hwCH5_110360142;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class gpt3 {
	public static void main(String[] args) {
		Person person1 = new Person("Alice", 30);
		Person person2 = new Person("Timmy", 20);
		Person person3 = new Person("Eva", 10);
		Person person[] = {person1,person2,person3};
		

        // Serialization
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            for (int i = 0; i < person.length ;i++) {
            	outputStream.writeObject(person[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))) {
        	for (int i = 0; i < person.length ;i++) {
        		Person deserializedPerson = (Person) inputStream.readObject();
        		System.out.println("Deserialized: " + deserializedPerson);
        	}
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}

}

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
