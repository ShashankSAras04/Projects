package com.paraconst.programs;

class Emp{
    String EmpName;
    int EmpId;
    String EmpDept;
    String EmpEmailId;
    String  EmpPn;
    Emp(int id,String name,String dept,String email,String ph){
        EmpId=id;
        EmpName=name;
        EmpDept=dept;
        EmpEmailId=email;
        EmpPn= ph;
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
    Dept(String name, int id, String emp,String mail,String ph){
        DeptName=name;
        DeptId=id;
        NoOfEmp=emp;
        DeptMailId=mail;
        DeptPh=ph;
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
    insurance(int id,String cmp,String holder,int price) {
        InsuranceId = id;
        InsuranceCmp = cmp;
        InsuranceHolder = holder;
        InsurancePrice = price;
        System.out.println("Insurance Id : " + InsuranceId);
        System.out.println("Insurance Company : " + InsuranceCmp);
        System.out.println("Insurance Holder Name : " + InsuranceHolder);
        System.out.println("Insurance Price : " + InsurancePrice);
    }
}
public class EmpDetailsDemo {
    public static void main(String[] args) {
        Emp obj1=new Emp(909,"Suresh","Sales","suresh@gmail.com","9087965432");
        Dept obj2=new Dept("Sales",2345,"10 Emps","sale@gmail.com","0099887766");
        insurance obj3=new insurance(45,"Oriantal Groups","Suresh",999);

    }
}
