package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListClass
{
    public static Scanner scan;


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Arun");
        arrayList.add("Gowri");
        arrayList.add("Rithvik");
        arrayList.add("Eswaran");
        arrayList.add("Honda");
        arrayList.add("Hyundai");
        System.out.println("The size of the arraylist is :" +arrayList.size());
        System.out.println("The data at the 2nd position is:" +arrayList.get(2));
        System.out.println("Printing the overall array values" + arrayList.toString());
        System.out.println("Enter the position to remove the data");



        Employee emp1= new Employee("Arun","prasadh",22,"Testing");
        Employee emp2 = new Employee("Rajesh","Kumar",22,"Manager");
        Employee emp3 = new Employee("Stella","Gunamary",27,"HR");


        ArrayList<Employee> empArrayList = new ArrayList<Employee>();
        empArrayList.add(emp1);
        empArrayList.add(emp2);
        empArrayList.add(emp3);

        Iterator<Employee> employeeIteratorReference = empArrayList.iterator();
        while(employeeIteratorReference.hasNext())
        {
            Employee itRef = employeeIteratorReference.next();
            System.out.println(itRef.firstName);
            System.out.println(itRef.lastName);
            System.out.println(itRef.age);
            System.out.println(itRef.dept);
        }

        ArrayList<String> carBrands = new ArrayList<String>();
        carBrands.add("Maruti");
        carBrands.add("Honda");
        carBrands.add("Toyota");
        carBrands.add("BMW");

        ArrayList<String> carNames = new ArrayList<String>();
        carNames.add("Omni");
        carNames.add("Jazz");
        carNames.add("Innova Crysta");
        carNames.add("BMW");

        carBrands.addAll(carNames);

        System.out.println("**********************After AddAll");

        for (int i = 0; i<carBrands.size(); i++)
        {
            System.out.println(carBrands.get(i));
        }

        System.out.println("******************After RemoveAll");
        carBrands.removeAll(carNames);

        for (int i = 0 ; i<carBrands.size();i++)
        {
            System.out.println(carBrands.get(i));
        }



        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("BMW");
        al1.add("AUDI");
        al1.add("SKODA");
        al1.add("MERCEDES");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("BMW");
        al2.add("KARUR");
        al2.add("TRICHY");
        al2.add("MERCEDES");

        al1.retainAll(al2);

        System.out.println("******************** After RetainAll");

        for (int i = 0; i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }
    }












}
