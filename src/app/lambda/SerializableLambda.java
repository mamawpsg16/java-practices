package app.lambda;

import java.io.*;

@FunctionalInterface
interface SerializableLambda extends Serializable {
    String greet(String name);
}