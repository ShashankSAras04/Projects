package com.constructor.programs;

class Students{
    int StudentId;
    String StudentName;
    String PhNo;
    String Class;
    Students(){
        StudentId=111;
        StudentName="Phills";
        Class="8th Class";
        PhNo="9087654321";
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
    Teachers(){
        TeacherId=222;
        TeacherName="Shreedhar";
        TeacherSubject="Computer Science";
        PhNo="9807654332";
        Address="Mungravalli Shivamogga";
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
    Schools(){
        SchoolID=0001;
        SchoolName="Sheshadripuram College";
        Address="Tumakuru";
        PhNo="9097654321";
        MailId="Sheshadripuram@gmail.com";
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
    Universities(){
        UniId=9900;
        UniName="Tumakuru University";
        Address="Tumakuru";
        PhNo="9998887776";
        MailId="Tumakuruuniversity@gamil.com";
        System.out.println("University ID : "+UniId);
        System.out.println("University Name : "+UniName);
        System.out.println("University Address : "+Address);
        System.out.println("University Phone Number : "+PhNo);
        System.out.println("University MailId : "+MailId);
    }
}
public class EducationDemo {
    public static void main(String[] args) {
     Students obj1=new Students();
     Teachers obj2=new Teachers();
     Schools obj3=new Schools();
     Universities obj4=new Universities();

    }
}
