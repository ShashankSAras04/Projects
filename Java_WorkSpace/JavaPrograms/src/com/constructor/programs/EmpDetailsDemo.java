package com.constructor.programs;

class Emp{
    String EmpName;
    int EmpId;
    String EmpDept;
    String EmpEmailId;
    long EmpPn;
    Emp(){
        EmpId=101;
        EmpName="Suresh";
        EmpDept="Sales";
        EmpEmailId="suresh@gmail.com";
        EmpPn= 9678656898L;
        System.out.println("Emp Id of the Employee : "+EmpId);
        System.out.println("Name of the Employee : "+EmpName);
        System.out.println("Emp Dept of the Employee : "+EmpDept);
        System.out.println("Emp Mail ID of the Employee : "+EmpEmailId);
        System.out.println("Emp Phone Number of the Employee : "+EmpPn);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
class Dept{
    String DeptName;
    int DeptId;
    String NoOfEmp;
    String DeptMailId;
    String DeptPh;
    Dept(){
        DeptName="Sales";
        DeptId=201;
        NoOfEmp="10 Employess";
        DeptMailId="Sales@yahoo.com";
        DeptPh="9876543210";
        System.out.println("Dept Name : "+DeptName);
        System.out.println("Dept ID : "+DeptId);
        System.out.println("Number of Employees working : "+NoOfEmp);
        System.out.println("Dept MailId : "+DeptMailId);
        System.out.println("Dept Phone Number : "+DeptPh);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class insurance{
    int InsuranceId;
    String InsuranceCmp;
    int InsurancePrice;
    String InsuranceHolder;
    insurance() {
        InsuranceId = 301;
        InsuranceCmp = "Hinduja";
        InsuranceHolder = "Suresh";
        InsurancePrice = 1000;
        System.out.println("Insurance Id : " + InsuranceId);
        System.out.println("Insurance Company : " + InsuranceCmp);
        System.out.println("Insurance Holder Name : " + InsuranceHolder);
        System.out.println("Insurance Price : " + InsurancePrice);
    }
}

public class EmpDetailsDemo {
    public static void main(String[] args) {
    Emp obj1=new Emp();
    Dept obj2=new Dept();
    insurance obj3=new insurance();

    }
}
