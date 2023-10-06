import java.util.*;
public class Studentclass{
    
    public static void main(String args[]){

        Car toyota = new Car();
        toyota.name = "Innova";
        toyota.no = 2211;

        // System.out.println(toyota.name);
        // System.out.println(toyota.no);

        Scanner sc = new Scanner(System.in);

        Student S1 = new Student(78,"jai",88.3,"lig");
        // S1.name = "Ram";
        // S1.rno = 80;
        // S1.percent = 98.5;
        // S1.add = "Suyash Vihar";
        
        System.out.println(S1.name + " " + "roll no. is" + " " + S1.rno);

    }
    public static void fun(Student S1){
        System.out.println(S1.add);
        System.out.println(S1.rno);
        return;
    }
}
