import java.util.Scanner;

 class Warm {
    
    public static void main(String[] args) {

        Warm w = new Warm();
        Warm.Inner i= w.new Inner();
        i.use();
    }
        
    class Inner{

        void use(){

            int num;

            Scanner sc= new Scanner(System.in);

            System.out.println("Enter number");

            num= sc.nextInt();

            if(num%2==0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }
        }
    }

}
