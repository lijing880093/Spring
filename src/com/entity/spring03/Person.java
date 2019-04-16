package com.entity.spring03;



import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class Person {
    private String name;
    private Integer age;
    private Dog dog=new Dog();
    private List<String> addr;
    private Set<String> love;
    private Map<String,String> address;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getAddr() {
        return addr;
    }

    public void setAddr(List<String> addr) {
        this.addr = addr;
    }

    public Set<String> getLove() {
        return love;
    }

    public void setLove(Set<String> love) {
        this.love = love;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
