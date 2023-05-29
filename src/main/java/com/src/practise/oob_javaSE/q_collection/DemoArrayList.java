package com.src.practise.oob_javaSE.q_collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) throws Exception {
        //创建EmpManage对象
        EmpManage empManage = new EmpManage();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("请选择你需要的操作");
            System.out.println("1：表示添加一个雇员");
            System.out.println("2：表示查找一个");
            System.out.println("3:表示修改一个雇员工资");
            System.out.println("4：删除一个雇员");
            System.out.println("5：退出程序");
            String operType = bufferedReader.readLine();
            if (operType.equals("1")) {
                System.out.println("请输入一个编号：");
                String empNo = bufferedReader.readLine();
                System.out.println("请输入一个名字");
                String name = bufferedReader.readLine();
                System.out.println("请输入工资：");
                float sal = Float.parseFloat(bufferedReader.readLine());
                Emp emp = new Emp(empNo, name, sal);
                empManage.addEmp(emp);

            } else if (operType.equals("2")) {
                System.out.println("请输入一个编号：");
                String empNo = bufferedReader.readLine();
                empManage.showInfo(empNo);
            } else if (operType.equals("2")) {

            } else if (operType.equals("4")) {

            } else if (operType.equals("5")) {
                //退出系统，退出正在运行的Java虚拟机
                //0表示正常退出
                //非0表示异常退出
                System.exit(0);
            }


        }
    }
}

class EmpManage {
    private ArrayList arrayList = null;

    /**
     * 构造方法
     */
    public EmpManage() {
        this.arrayList = new ArrayList();
    }

    //加入员工
    public void addEmp(Emp emp) {
        arrayList.add(emp);
    }

    /**
     * 获取信息
     *
     * @param empNo
     */
    public void showInfo(String empNo) {
        //遍历整个arraylist
        for (int i = 0; i < arrayList.size(); i++) {
            Emp emp = (Emp) arrayList.get(i);
            if (emp.getEmpNo().equals(empNo)) {
                System.out.println("找到该员工，他的信息是：");
                System.out.println("编号：" + empNo);
                System.out.println("名字：" + emp.getName());
                System.out.println("薪水：" + emp.getSal());
            }
        }
    }

    /**
     * 根据编号修改薪水
     */
    public void updateSal(String empNo, float newSal) {
        for (int i = 0; i < arrayList.size(); i++) {
            Emp emp = (Emp) arrayList.get(i);
            if (emp.getEmpNo().equals(empNo)) {
                //arraylist存放的是对象的引用，这里找到对象真正的地址，直接执行一下，就覆盖了原来的值
                emp.setSal(newSal);
            }
        }
    }

    //删除员工
    public void delEmp(String empNo) {
        for (int i = 0; i < arrayList.size(); i++) {
            Emp emp = (Emp) arrayList.get(i);
            if (emp.getEmpNo().equals(empNo)) {
                arrayList.remove(i);
                //arrayList.remove(emp);
            }
        }

    }

}

//雇员类
class Emp {
    private String empNo;
    private String name;
    private float sal;

    public Emp(String empNo, String name, float sal) {
        this.empNo = empNo;
        this.name = name;
        this.sal = sal;
    }

    public String getEmpNo() {
        return empNo;
    }

    public Emp setEmpNo(String empNo) {
        this.empNo = empNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Emp setName(String name) {
        this.name = name;
        return this;
    }

    public float getSal() {
        return sal;
    }

    public Emp setSal(float sal) {
        this.sal = sal;
        return this;
    }
}