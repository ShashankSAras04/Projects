package com.paraconst.programs;

class Students{
    int StudentId;
    String StudentName;
    String PhNo;
    String Class;
    Students(int id,String name,String ph,String classes){
        StudentId=id;
        StudentName=name;
        Class=ph;
        PhNo=classes;
        System.out.println("Student ID : "+StudentId);
        System.out.println("Student Name : "+StudentName);
        System.out.println("Student Class : "+Class);
        System.out.println("Student Phone Number : "+PhNo);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

}

class Teachers{
    int TeacherId;
    String TeacherName;
    String PhNo;
    String TeacherSubject;
    String Address;
    Teachers(int id,String name,String sub,String ph,String address){
        TeacherId=id;
        TeacherName=name;
        TeacherSubject=sub;
        PhNo=ph;
        Address=sub;
        System.out.println("Teacher ID : "+TeacherId);
        System.out.println("Teacher Name : "+TeacherName);
        System.out.println("Teacher Subject : "+TeacherSubject);
        System.out.println("Teacher Phone Number : "+PhNo);
        System.out.println("Teacher Address : "+Address);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Schools{
    int SchoolID;
    String SchoolName;
    String PhNo;
    String MailId;
    String Address;
    Schools(int id,String name,String address,String ph,String mail){
        SchoolID=id;
        SchoolName=name;
        Address=address;
        PhNo=ph;
        MailId=mail;
        System.out.println("School ID : "+SchoolID);
        System.out.println("School Name : "+SchoolName);
        System.out.println("School Address : "+Address);
        System.out.println("School Phone Number : "+PhNo);
        System.out.println("School MailId : "+MailId);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
class Universities{
    int UniId;
    String UniName;
    String Address;
    String PhNo;
    String MailId;
    Universities(int id,String name,String address,String ph,String mail){
        UniId=id;
        UniName=name;
        Address=address;
        PhNo=ph;
        MailId=mail;
        System.out.println("University ID : "+UniId);
        System.out.println("University Name : "+UniName);
        System.out.println("University Address : "+Address);
        System.out.println("University Phone Number : "+PhNo);
        System.out.println("University MailId : "+MailId);
    }
}
public class EducationparaDemo {
    public static void main(String[] args) {
        Students obj1=new Students(1111,"Emul","8907563412","8th Class");
        Teachers obj2=new Teachers(1100,"Raj","Computer Science","9087654312","Tumakuru");
        Schools obj3=new Schools(111,"Seshadripuram College","Tumakuru","980765412","Seshadripuram@gmail.com");
        Universities obj4=new Universities(1001,"Tumkur University","Tumakuru","9087654321","TumakuruUni@gmail.com");

    }
}
