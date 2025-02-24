package app.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsExample {
    public void sampleGeneric(){
        List<String> list = new ArrayList<String>();
        list.add("hello this is generic");
        String s = list.get(0);   // no cast
        System.out.println(s);
    }

    public void sampleNotGeneric(){
        List list = new ArrayList();
        list.add("hello this is not generic");
        String s = (String) list.get(0);
        System.out.println(s);
    }
}
