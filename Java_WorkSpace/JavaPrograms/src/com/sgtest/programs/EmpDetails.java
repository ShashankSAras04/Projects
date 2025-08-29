package com.sgtest.programs;

class Emp{
    String EmpName;
    int EmpId;
    String EmpDept;
    String EmpEmailId;
    long EmpPn;
}
class Dept{
    String DeptName;
    int DeptId;
    String NoOfEmp;
    String DeptMailId;
    String DeptPh;
}

class insurance{
    int InsuranceId;
    String InsuranceCmp;
    int InsurancePrice;
    String InsuranceHolder;
}

public class EmpDetails {
    public static void main(String[] args) {
    Emp suresh=new Emp();
    suresh.EmpId=101;
    suresh.EmpName="Suresh";
    suresh.EmpDept="Sales";
    suresh.EmpEmailId="suresh@gmail.com";
    suresh.EmpPn= 9678656898L;
    System.out.println("Emp Id of the Employee : "+suresh.EmpId);
    System.out.println("Name of the Employee : "+suresh.EmpName);
    System.out.println("Emp Dept of the Employee : "+suresh.EmpDept);
    System.out.println("Emp Mail ID of the Employee : "+suresh.EmpEmailId);
    System.out.println("Emp Phone Number of the Employee : "+suresh.EmpPn);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    Dept obj1=new Dept();
    obj1.DeptName="Sales";
    obj1.DeptId=201;
    obj1.NoOfEmp="10 Employess";
    obj1.DeptMailId="Sales@yahoo.com";
    obj1.DeptPh="9876543210";
    System.out.println("Dept Name : "+obj1.DeptName);
    System.out.println("Dept ID : "+obj1.DeptId);
    System.out.println("Number of Employees working : "+obj1.NoOfEmp);
    System.out.println("Dept MailId : "+obj1.DeptMailId);
    System.out.println("Dept Phone Number : "+obj1.DeptPh);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    insurance obj2=new insurance();
    obj2.InsuranceId=301;
    obj2.InsuranceCmp="Hinduja";
    obj2.InsuranceHolder="Suresh";
    obj2.InsurancePrice=1000;
    System.out.println("Insurance Id : "+obj2.InsuranceId);
    System.out.println("Insurance Company : "+obj2.InsuranceCmp);
    System.out.println("Insurance Holder Name : "+obj2.InsuranceHolder);
    System.out.println("Insurance Price : "+obj2.InsurancePrice);
    }
}
