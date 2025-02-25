package app.lambda;
import java.io.*;

public class LambdaSerialization {
    public static void serialize() {
        try {
            SerializableLambda lambda = name -> "Hello, " + name;

            // Serialize lambda to a file
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("lambda.ser"))) {
                out.writeObject(lambda);
            }

            System.out.println("Lambda Serialized!");
        } catch (IOException e) {
            e.printStackTrace(); // Print the error details
        }
    }

    public static void deserialize() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("lambda.ser"))) {
            SerializableLambda lambda = (SerializableLambda) in.readObject(); // This may throw ClassNotFoundException
            System.out.println(lambda.greet("John"));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
