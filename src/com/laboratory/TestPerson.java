package com.laboratory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPerson {

    public static void main(String args[]) {
        List<Person> peopleList = new ArrayList<>();
        Person person = new Person();
        person.setAge(5);
        Person person1 = new Person();
        person1.setAge(10);
        Person person2 = new Person();
        person2.setAge(15);
        Person person7 = new Person();
        person7.setAge(18);
        Person person3 = new Person();
        person3.setAge(25);
        Person person4 = new Person();
        person4.setAge(30);
        Person person5 = new Person();
        person5.setAge(45);
        Person person6 = new Person();
        person6.setAge(55);

        peopleList.add(person);
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);
        peopleList.add(person5);
        peopleList.add(person6);
        peopleList.add(person7);

        List<Person> lessThan19 = peopleList.stream().filter(pers -> pers.getAge() < 19).collect(Collectors.toList());
        lessThan19.forEach(per -> {
            System.out.println(per.getAge());
        });
    }
}
