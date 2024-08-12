package Overloading_Override;

class demoReference{
    public static void main(String[] args) {
        ExmReference R=new ExmReference();
        ExmReference B=R;
        R.set();
        R.info();
        B.set();
        B.info();
        R.info();
    }
}
