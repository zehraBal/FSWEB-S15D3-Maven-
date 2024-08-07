package org.example;


import org.example.entity.Employee;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Employee> employees=new LinkedList<>();

        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(4, "Burak", "Cevizli"));
        employees.add(null);

       System.out.println(employees);

       System.out.println(findDuplicates(employees));
        System.out.println(findUniques(employees));
        System.out.println(removeDuplicates(employees));



      //  System.out.println(WordCounter.calculatedWord());
    }

    public static List<Employee> findDuplicates(List<Employee> employ){

        Set<Employee> duplicates=new HashSet<>();
        List<Employee> items =new ArrayList<>();
        for(Employee emp:employ){
           if(!duplicates.add(emp)&& emp!=null){
               items.add(emp);
           }
        }
        return items;
    }

    public static Map<Integer,Employee> findUniques(List<Employee> employ){

        Set<Employee> uniques=new HashSet<>();
        for (Employee emp :employ){
            if (emp!=null){
                uniques.add(emp);
            }
        }
        Map<Integer,Employee> unique=new HashMap<>();
        for (Employee emp:uniques){
            unique.put(emp.getId(),emp);
        }

        return unique;
    }

    public static List<Employee> removeDuplicates(List<Employee> employ){

        Collection<Employee> duplicates=findDuplicates(employ);
        List<Employee> removed= new ArrayList<>();

        for(Employee emp:employ){
            if(!duplicates.contains(emp) && emp!=null){
                removed.add(emp);
            }
        }
        return removed;
    }
}