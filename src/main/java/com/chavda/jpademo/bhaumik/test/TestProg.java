package com.chavda.jpademo.bhaumik.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestProg {

/*find manager hierarcy
Ajay > Ramesh
Rahul > Mohan
Deepesh > Animesh
Mohan > Ajay


Input : Rahul
Output : Rahul > Mohan > Ajay > Ramesh */
    public static void main(String[] args) {
        Map<String,String> managers = new HashMap<>();
        managers.put("Ajay","Ramesh");
        managers.put("Deepesh","Animesh");
        managers.put("Mohan","Ajay");
        managers.put("Rahul","Mohan");
        String name = "Mohan";
        List<String> mlist= new ArrayList<>();
        mlist.add(name);
        while (managers.containsKey(name)) {
            mlist.add(managers.get(name));
            name = managers.get(name);
        }
        System.out.println(String.join(" > ", mlist));
    }
}
