package app.annotations;

public class AnnotationExamples extends SuperClass {
    @Override  // This is an annotation
    public void myMethod() {
        System.out.println("This method overrides a superclass method.");
    }

    @Deprecated  // Marks a method as deprecated (not recommended for use)
    public void oldMethod() {
        System.out.println("This method is outdated.");
    }
}
