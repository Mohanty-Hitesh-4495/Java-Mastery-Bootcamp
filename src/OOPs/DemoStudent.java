package OOPs;

class Student {
    String name;
    int roll;
    float cgpa;
    Student(){}
    Student(String n,int r,float cgpa){
        this.name=n;
        this.roll=r;
        this.cgpa=cgpa;
    }
    void info(){
        System.out.println(" NAME="+name+"\n ROLL NO.="+roll+"\n CGPA="+cgpa);
    }
}
class DemoStudent{
    public static void main(String[] args){
        Student S=new Student("HITESH",36,9.0f);
        Student N=new Student();
        N.name="PRAKASH";
        N.roll=37;
        N.cgpa=8.6f;
        N.info();
        S.info();
    }
}
