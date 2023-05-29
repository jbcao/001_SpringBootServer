package com.src.practise.ood_design_pattern.ooh_composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("清华", "顶级大学");
       //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院");

        //创建学院下面的系（专业）
        computerCollege.add(new Department("软件工程","不错"));
        computerCollege.add(new Department("网络工程","不错"));
        computerCollege.add(new Department("计算机科学与技术","不错"));


        //
        infoEngineerCollege.add(new Department("通信工程","不好学"));
        infoEngineerCollege.add(new Department("信息工程","好学"));

        //将学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);
        university.print();
        //computerCollege.print();
        //infoEngineerCollege.print();
    }
}
