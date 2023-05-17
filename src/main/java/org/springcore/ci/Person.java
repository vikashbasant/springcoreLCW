package org.springcore.ci;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private String name;

    private int personId;

    private Certi certi;

    private List<String> list;

    public Person (String name, int personId, Certi certi, List<String> list, Set<String> set, Map<String, Integer> map, Properties prop) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.list = list;
        this.set = set;
        this.map = map;
        this.prop = prop;
    }

    private Set<String> set;

    private Map<String, Integer> map;

    private Properties prop;


    Person() {

    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", prop=" + prop +
                '}';
    }

    Person(String name, int personId, Certi certi, List<String> list, Set<String> set) {
        this.name = name;
        this.personId = personId;
        this.certi =  certi;
        this.list = list;
        this.set = set;
    }

}
