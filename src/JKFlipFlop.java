public class JKFlipFlop {
    private boolean J,K,Q,notQ;
    // Constructor to initialize the JK flip-flop
    public JKFlipFlop() {
        J = false;
        K = false;
        Q = false;
        notQ = true;
    }
    // Method to set the inputs J and K
    public void setInputs(boolean j, boolean k) {
        J = j;
        K = k;
    }
    // Method to perform the JK flip-flop operation
    public void performOperation() {
        if (J && K) {
            toggle();
        } else if (J && !K) {
            setQ(true);
        } else if (!J && K) {
            setQ(false);
        }
    }
    // Method to toggle the output Q and notQ
    private void toggle() {
        Q = !Q;
        notQ = !notQ;
    }
    // Method to set the value of Q
    private void setQ(boolean value) {
        Q = value;
        notQ = !value;
    }
    // Method to get the value of Q
    public boolean getQ() {
        return Q;
    }
    // Method to get the value of notQ
    public boolean getNotQ() {
        return notQ;
    }
    public static void main(String[] args) {
        JKFlipFlop ob1 = new JKFlipFlop();
        JKFlipFlop ob2 = new JKFlipFlop();
        JKFlipFlop ob3 = new JKFlipFlop();
        JKFlipFlop ob4 = new JKFlipFlop();
        // Example usage
        ob1.setInputs(false, false);
        ob2.setInputs(false,true);
        ob3.setInputs(true,false);
        ob4.setInputs(true,true);
        ob1.performOperation();
        ob2.performOperation();
        ob3.performOperation();
        ob4.performOperation();
        System.out.println("+------------------------------------------------+");
        System.out.println("|    J     |     K     |   Q(n+1)   |   Q'(n+1)  |");
        System.out.println("+------------------------------------------------+");
        System.out.println("|  "+ob1.J+"   |   "+ob1.K+"   |  "+ob1.getQ()+"     |    "+ ob1.getNotQ()+"    |");
        System.out.println("|  "+ob2.J+"   |   "+ob2.K+"    |  "+ob2.getQ()+"     |    "+ ob2.getNotQ()+"    |");
        System.out.println("|  "+ob3.J+"    |   "+ob3.K+"   |  "+ob3.getQ()+"      |    "+ ob3.getNotQ()+"   |");
        System.out.println("|  "+ob4.J+"    |   "+ob4.K+"    |  "+ob4.getQ()+"      |    "+ ob4.getNotQ()+"   |");
        System.out.println("+------------------------------------------------+");
    }
}
