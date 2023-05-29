package com.src.practise.ood_design_pattern.oov_responsibility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    /**
     * 根据String型时间，获取long型时间，单位毫秒
     *
     * @param inVal 时间字符串
     * @return long型时间
     */
    public static long fromDateStringToLong(String inVal) {
        Date date = null;
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        try {
            date = inputFormat.parse(inVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date.getTime();

    }

    public static void main(String[] args) {
        //获取当前时间为截止时间，转换为long型
        long stopTime = fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 102345, 00011);

        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("张院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("于副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("王校长");


        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);


        departmentApprover.processRequest(purchaseRequest);
        //获取当前时间为开始时间，转换为long型
        long startTime = fromDateStringToLong(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS").format(new Date()));

        //计算时间差,单位毫秒
        long timeSpan = startTime-stopTime;
        System.out.println(timeSpan);
    }
}
