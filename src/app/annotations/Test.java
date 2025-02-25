package app.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Type annotation
@Target(ElementType.TYPE_USE)
@interface NonNull {}
// Using the custom annotation
public class Test {
    private @NonNull String message = "Hello!";

    @MyAnnotation(value = "Custom Annotation Example")
    public void show() {
        System.out.println("MyAnnotation applied!");
    }
}
