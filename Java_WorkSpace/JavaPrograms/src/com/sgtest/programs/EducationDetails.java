package com.sgtest.programs;

class Students{
    int StudentId;
    String StudentName;
    String PhNo;
    String Class;
}

class Teachers{
    int TeacherId;
    String TeacherName;
    String PhNo;
    String TeacherSubject;
    String Address;
}

class Schools{
    int SchoolID;
    String SchoolName;
    String PhNo;
    String MailId;
    String Address;
}

class Universities{
    int UniId;
    String UniName;
    String Address;
    String PhNo;
    String MailId;
}

public class EducationDetails {
    public static void main(String[] args) {
        Students obj1=new Students();
        obj1.StudentId=111;
        obj1.StudentName="Phills";
        obj1.Class="8th Class";
        obj1.PhNo="9087654321";
        System.out.println("Student ID : "+obj1.StudentId);
        System.out.println("Student Name : "+obj1.StudentName);
        System.out.println("Student Class : "+obj1.Class);
        System.out.println("Student Phone Number : "+obj1.PhNo);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        Teachers obj2=new Teachers();
        obj2.TeacherId=222;
        obj2.TeacherName="Shreedhar";
        obj2.TeacherSubject="Computer Science";
        obj2.PhNo="9807654332";
        obj2.Address="Mungravalli Shivamogga";
        System.out.println("Teacher ID : "+obj2.TeacherId);
        System.out.println("Teacher Name : "+obj2.TeacherName);
        System.out.println("Teacher Subject : "+obj2.TeacherSubject);
        System.out.println("Teacher Phone Number : "+obj2.PhNo);
        System.out.println("Teacher Address : "+obj2.Address);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        Schools obj3=new Schools();
        obj3.SchoolID=0001;
        obj3.SchoolName="Sheshadripuram College";
        obj3.Address="Tumakuru";
        obj3.PhNo="9097654321";
        obj3.MailId="Sheshadripuram@gmail.com";
        System.out.println("School ID : "+obj3.SchoolID);
        System.out.println("School Name : "+obj3.SchoolName);
        System.out.println("School Address : "+obj3.Address);
        System.out.println("School Phone Number : "+obj3.PhNo);
        System.out.println("School MailId : "+obj3.MailId);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        Universities obj4=new Universities();
        obj4.UniId=9900;
        obj4.UniName="Tumakuru University";
        obj4.Address="Tumakuru";
        obj4.PhNo="9998887776";
        obj4.MailId="Tumakuruuniversity@gamil.com";
        System.out.println("University ID : "+obj4.UniId);
        System.out.println("University Name : "+obj4.UniName);
        System.out.println("University Address : "+obj4.Address);
        System.out.println("University Phone Number : "+obj4.PhNo);
        System.out.println("University MailId : "+obj4.MailId);
    }
}
