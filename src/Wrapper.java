

public class Wrapper {
    static int max(Integer a,Integer b){
        int x=a;
        int y=b;
        return x>y?x:y;
    }
    public static void main(String[] args) {
        Integer a=5;
        Integer b=3;
        System.out.println(max(a,b));
    }


//    public static void main(String[] args) {
//        int a=5;
//        Double ob = Double.valueOf(a); // autoboxing
//        Float ob2 = Float.valueOf(a);//
//        if(ob instanceof Double){
//            System.out.println("HI HITESH");
//        }
//        if(ob2 instanceof Float){
//            System.out.println("HI DEBASISH");
//        }
//        System.out.println(ob2);
//        System.out.println(ob);
//        float b=ob2;// unboxing
//        System.out.println(b);
//
//        ArrayList<Integer> arr = new ArrayList<>();// Arraylist for Integer type objects
//        arr.add(a);
//        arr.add(6);
//        arr.add(7);
//        arr.add(8);
//        System.out.println(arr);
//        arr.remove(1);
//        arr.remove(arr.indexOf(7));// after deleting 1st index arraylist will be updated...
//        System.out.println(arr);
//
//        ArrayList<Double> arr2=new ArrayList<>();// Arraylist for Double type objects
//        arr2.add(45.215);
//        arr2.add(46.215);
//        arr2.add(47.215);
//        arr2.add(48.215);
//        System.out.println(arr2);
//
//        ArrayList<Character> arr3 =new ArrayList<>();
//
//
//    }
}
