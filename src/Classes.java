import java.util.Scanner;
class Percy{
    /* instance variables / fields
    String fullname;
    String major;
    int group;
    */
    //method or subroutine
    void input(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = num.nextInt();
        if(number % 2!=0){
            System.out.println("Number is odd");
        }else{
            System.out.println("An even number");
        }
    }
}



public class Classes {
    public static void main(String[] args){
        Percy info = new Percy();
        info.input();
        /*
        info.fullname = "Percy Brown";
        info.major = "Computer Science";
        info.group = 2022;
        System.out.println("My full name is " + info.fullname);
        System.out.println("I study " + info.major + " at Ashesi Univerity");
         */

    }


}
