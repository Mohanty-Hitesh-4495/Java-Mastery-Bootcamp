package OOPs;

// read five students (name,roll no., age).
class Students{
    static int roll=2023001, count=0;
    int id;
    String name;
    int age;
    Students(){
        count++;
    }
    Students(String name,int age){
        this.age=age;
        this.name=name;
        count++;
        roll++;
        id=count;
    }
    void showStudent(Students ob){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
        System.out.println("Object number ="+ob.id);
    }
}
public class DemoStudentObject {
    public static void main(String[] args) {
        Students ob1 = new Students("hitesh",21);
        Students ob2 = new Students("debasish",20);
        Students ob3 = new Students("prakash",19);
        Students ob4 = new Students("syed",21);
        Students ob5 = new Students("sanjeeb",20);
        ob1.showStudent(ob1);
        ob2.showStudent(ob2);
        ob3.showStudent(ob3);
        ob4.showStudent(ob4);
        ob5.showStudent(ob5);

    }
}
