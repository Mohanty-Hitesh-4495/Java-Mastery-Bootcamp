package OOPs;

import java.util.Scanner;
class Date {
    int dd, mm, yy;
    void setIssueDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day:");
        dd = sc.nextInt();
        System.out.print("Enter month:");
        mm = sc.nextInt();
        System.out.print("Enter year:");
        yy = sc.nextInt();
    }
    boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    int[] getDueDate() {
        int[] date = new int[3];
        date[0] = dd;
        date[1] = mm;
        date[2] = yy;
        if (mm == 2) {
            if (isLeapYear(yy))
                if (dd < 22) {
                    date[0] += 7;
                } else {
                    date[0] = date[0] + 7 - 29;
                    date[1] += 1;
                }
            else {
                if (dd < 21) {
                    date[0] += 7;
                } else {
                    date[0] = date[0] + 7 - 28;
                    date[1] += 1;
                }
            }
        } else if (mm < 8 && mm % 2 != 0 || mm > 7 && mm % 2 == 0) {
            if (dd < 25)
                date[0] += 7;
            else {
                date[0] = date[0] + 7 - 31;
                date[1] += 1;
            }
        } else {
            if (dd < 24)
                date[0] += 7;
            else {
                date[0] = date[0] + 7 - 30;
                date[1] += 1;
            }
        }
        if (date[1] > 12) {
            date[1] = 1;
            date[2] += 1;
        }
        return date;
    }
}
class LibraryBook extends Date {
    int price;
    Date returnDate = new Date();
    void setReturnDate() {
        returnDate.setIssueDate();
    }
    int getDD() {
        int days;
        if(returnDate.mm==getDueDate()[1])
            return returnDate.dd-getDueDate()[0];
        if (getDueDate()[1] == 2) {
            if (isLeapYear(getDueDate()[2])) {
                days = 29 - getDueDate()[0];
            } else {
                days = 28 - getDueDate()[0];
            }
        }else if (returnDate.mm < 8 && returnDate.mm % 2 != 0 || returnDate.mm > 7 && returnDate.mm % 2 == 0)
            days = 31 - getDueDate()[0];
        else
            days = 30 - getDueDate()[0];
        return days;
    }
    int getDMM() {
        int days=0,till;
        if(returnDate.yy==getDueDate()[2])
            till= returnDate.mm-1;
        else
            till=12;
       for(int i=getDueDate()[1]+1;i<=till;i++){
           if (i == 2) {
               if (isLeapYear(getDueDate()[2]))
                   days += 29;
               else
                   days += 28;
           } else if (i < 8 && i % 2 != 0 || i > 7 && i % 2 == 0)
               days += 31;
           else
               days += 30;
       }
       return days;
    }
    int getRMM() {
        int days=0,till;
        if(returnDate.yy==getDueDate()[2])
            till= getDueDate()[1]+1;
        else
            till= 0;
        for(int i= returnDate.mm-1; i>till;i--){
            if (i == 2) {
                if (isLeapYear(returnDate.yy))
                    days += 29;
                else
                    days += 28;
            } else if (i < 8 && i % 2 != 0 || i > 7 && i % 2 == 0)
                days += 31;
            else
                days += 30;
        }
        return days;
    }
    int getRYY(){
        int days=0;
        for(int i=getDueDate()[2]+1;i< returnDate.yy;i++) {
            if (isLeapYear(i))
                days+=366;
            else
                days+=365;
        }
        return days;
    }
    int getOverDeuDays() {
        int days=getDD();
        if(returnDate.mm!=getDueDate()[1])
            days+=returnDate.dd;
        if(returnDate.yy!=getDueDate()[2]){
            days+=getDMM();
            days+=getRMM();
        }else{
            days+=getRMM();
        }
        days+=getRYY();
        return days;
    }
    int getFine(){
        int days=getOverDeuDays();
        if(days>15)
            return days*10+(price/2);
        else return days*10;
    }
}
public  class DemoLibrary {
    public static void main(String[] args) {
        LibraryBook ob = new LibraryBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price of Book : ");
        ob.price=sc.nextInt();
        System.out.println("******* Enter Issue OOPs.Date *******");
        ob.setIssueDate();
        System.out.print("DueDate : ");
        System.out.println(ob.getDueDate()[0]+"/"+ob.getDueDate()[1]+"/"+ob.getDueDate()[2]);
        System.out.println("******* Enter Return OOPs.Date ******* ");
        ob.setReturnDate();
        System.out.println("Deu Days : "+ob.getOverDeuDays());
        System.out.println("Fine Amount : "+ob.getFine());
    }
}
