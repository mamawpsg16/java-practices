package app.class_example;

public class OverloadingMethodsAndMore {
    public void draw(String s) {
        System.out.println("String Method :" + s);
    }

    public void draw(int i) {
        System.out.println("Integer Method :" + i);
    }

    public void draw(int i, String s) {
        System.out.println("Combination of Int and String:" + s + " " + i);
    }
}
