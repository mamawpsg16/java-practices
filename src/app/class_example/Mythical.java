package app.class_example;

public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
