package example;

public class Nestedifstatement {

    public static void main(String[] args) {
        int a=25;
        int w=48;
        //applying condition on age and weight
        if(a>=18){
            if(w>50){
                System.out.println("You are eligible for this job");
            } else{
                System.out.println("You are not eligible for this job");
            }
        } else{
            System.out.println("Age must be greater than 25");
        }
    }
}
