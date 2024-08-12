package Day_01;

import java.util.Scanner;

public class CheckOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A OPERATOR : ");
        String stringValue= sc.next();
        checkAssignment(stringValue);
        checkBitwise(stringValue);
        checkLogical(stringValue);
        checkShift(stringValue);
        checkTernary(stringValue);
        checkUnary(stringValue);
        checkRelational(stringValue);

    }
    static void checkUnary(String stringValue) {
        String[] unaryOperator = {"--","++","!"};
        for (String element : unaryOperator) {
            if (element.equals(stringValue)) {
                System.out.println("UNARY OPERATOR");
            }
        }
    }
    static void checkAssignment(String stringValue) {
        String[] assignmentOperator = {"=","*=","-=","+=","/="};
        for (String element : assignmentOperator) {
            if (element.equals(stringValue)) {
                System.out.println("ASSIGNMENT OPERATOR");
            }
        }
    }
    static void checkLogical(String stringValue) {
        String[] logicalOperator = {"&&","||","!"};
        for (String element : logicalOperator) {
            if (element.equals(stringValue)) {
                System.out.println("LOGICAL OPERATOR");
            }
        }
    }
    static void checkRelational(String stringValue) {
        String[] relationalOperator = {"==", "<", ">", "<=", ">=", "!="};
        for (String element : relationalOperator) {
            if (element.equals(stringValue)) {
                System.out.println("RELATIONAL OPERATOR");
            }
        }
    }
    static void checkBitwise(String stringValue) {
        String[] bitwiseOperator = {"|","&","^","~"};
        for (String element : bitwiseOperator) {
            if (element.equals(stringValue)) {
                System.out.println("BITWISE OPERATOR");
            }
        }
    }
    static void checkTernary(String stringValue) {
        String[] ternaryOperator = {"?:"};
        for (String element : ternaryOperator) {
            if (element.equals(stringValue)) {
                System.out.println("TERNARY OPERATOR");
            }
        }
    }
    static void checkShift(String stringValue) {
        String[] shiftOperator = {"<<",">>","<<<",">>>"};
        for (String element : shiftOperator) {
            if (element.equals(stringValue)) {
                System.out.println("SHIFT OPERATOR");
            }
        }
    }

}
