package com.ali.project.Java8Core.Java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToLongFunction;

public class Collecting {
    public static Logger log = LogManager.getLogger(Collecting.class);

    public static void main(String[] args) {
        // keep this function call here
        //System.out.print(TreeConstructor(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
//        Set set = new TreeSet();
//        set.add(1);
//        // Compilation error
//        set.add(2);
//        set.add(3);
        System.out.println("In the main()");

        String s1 ="abc";
        String s2 ="abc";
        String s3 = new String(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1!=s3);

        Set set1 = new TreeSet();
        Set set2 = new HashSet();
        Set set3 = new LinkedHashSet();

        Map map1 = new HashMap<>();
        Map map2 = new TreeMap<>();
        Map map3 = new LinkedHashMap();
        Map map4 = new ConcurrentHashMap();
        Map map5 = new IdentityHashMap();
        Map map6 = new Hashtable();

        List l = new LinkedList<>();
        // A set can have single null value and can't have duplicate values
        // furthermore a set is not ordered
        Set s = new HashSet<>();
        s.add(null);
//        ToLongFunction lf = new ToLongFunction() {
//            @Override
//            public long applyAsLong(Object value) {
//                return 0;
//            }
//        };
//        s.stream().mapToLong(lf.applyAsLong(55436436L)).forEach(System.out::println);
        s.add(34);
        s.add(1);
//        s.add("a");
        s.add('c');
        s.add("a");
        s.add("sam");
        s.add("fish");
        System.out.println(s);
        
//        Collections.sort();
    }

    public static void main (char[] args) {
        System.out.println(args);
    }

    public static String TreeConstructor(String[] strArr) {
        List<Integer> l = new ArrayList<Integer>(1000);
        System.out.println("list length: "+l.size());
        for(String s: strArr){
            l.add(Character.getNumericValue(s.charAt(3)),0);
            System.out.println(s);
            System.out.println(s.charAt(3));
            int x = l.get(Character.getNumericValue(s.charAt(3)));
            System.out.println("x "+x);
            System.out.println("list length: "+l.size());
            if(x<0){
                l.add(Character.getNumericValue(s.charAt(3)),0);
            }
            if(l.get(Character.getNumericValue(s.charAt(3)))<2) {
                l.add(Character.getNumericValue(s.charAt(3)), l.get(Character.getNumericValue(s.charAt(3))) + 1);
                System.out.println(l.get(Character.getNumericValue(s.charAt(3))));
            }else
                return "false";
        }
        return "true";
    }
}
