package app.class_example;

public interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
