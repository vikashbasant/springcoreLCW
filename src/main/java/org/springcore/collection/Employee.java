package org.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;

    private Set<String> addresses;

    private Map<String, Integer> courses;
    
    private Properties prop;


    public Employee () {
    }

    public Employee (String name, List<String> phones, Set<String> addresses, Map<String, Integer> courses, Properties prop) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.prop = prop;
    }

    public Properties getProp () {
        return prop;
    }

    public void setProp (Properties prop) {
        this.prop = prop;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public List<String> getPhones () {
        return phones;
    }

    public void setPhones (List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses () {
        return addresses;
    }

    public void setAddresses (Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Integer> getCourses () {
        return courses;
    }

    public void setCourses (Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", prop=" + prop +
                '}';
    }
}
