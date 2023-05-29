package com.src.practise.ood_design_principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        Demeter demeter = new Demeter();
        SchoolManager schoolManager=demeter.new SchoolManager();
        CollageManager  collageManager = demeter.new CollageManager();
        schoolManager.printAllEmployee(collageManager);
    }
    //学校员工类
    class Employee {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    //学院员工类
    class CollageEmployee {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    class CollageManager {
        public List<CollageEmployee> getAllCollageEmployee() {
            List<CollageEmployee> collageEmployees = new ArrayList<CollageEmployee>();
            for (int i = 0; i < 10; i++
            ) {
                CollageEmployee collageEmployee = new CollageEmployee();
                collageEmployee.setId("学院员工id= " + i);
                collageEmployees.add(collageEmployee);
            }
            return collageEmployees;
        }
    }
//直接朋友是Employee（返回值中的类），CollageManager（参量），CollageEmployee不是直接朋友，他出现自局部变量里
    class SchoolManager {
        public List<Employee> getAllEmployee() {
            List<Employee> employees = new ArrayList<Employee>();
            for (int i = 0; i < 5; i++) {
                Employee employee = new Employee();
                employee.setId("学校员工id=" + i);
                employees.add(employee);
            }
            return employees;
        }

        public void printAllEmployee(CollageManager collageManager) {
            List<CollageEmployee> collageEmployees = collageManager.getAllCollageEmployee();
            System.out.println("------------------学院人员id-----------------------");
            for (CollageEmployee collageEmployee : collageEmployees
            ) {
                System.out.println("学院id" + collageEmployee.getId());
            }
            System.out.println("------------------学校人员id-----------------------");
            List<Employee> employees = this.getAllEmployee();
            for (Employee employee : employees
            ) {
                System.out.println("学校人员id=" + employee.getId());
            }
        }
    }

}
