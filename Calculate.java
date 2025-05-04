import java.util.Scanner;
public class Calculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects: ");
        int sheet = sc.nextInt();
        sc.nextLine();

        String[] subjnames = new String[sheet];
        int[] marks = new int[sheet];
        int totalmarks = 0;
         for(int i = 0; i<sheet; i++){
            System.out.println("Enter your subjects name: ");
            subjnames[i] = sc.nextLine();

            while(true) {
                System.out.println("Enter marks for" + subjnames[i] + "(out of 100) " );
                marks[i] = sc.nextInt();
                sc.nextLine();

                if (marks[i] >= 0 && marks[i] <= 100){
                    break;
                } else {
                    System.out.println("Invalid marks! please enter your marks between 1 to 100 ");
                }
            }
             totalmarks += marks[i];
         }
                double avgper = (double) totalmarks / sheet;

                char grade;

                if(avgper >= 90){
                    grade = 'A';
                } else if (avgper >= 80){
                    grade = 'c';
                }else if (avgper >= 60){
                    grade = 'D';
                }else if (avgper >= 50){
                    grade = 'E';
                }else{
                    grade = 'F';
                }
                System.out.println("Subject wise marks: ");
                for (int i = 0; i < sheet; i++) {                    
                    System.out.println(subjnames[i] + " : " + marks[i]);               
                }
                System.out.println("total marks: "+ totalmarks);
                System.out.println("Average marks: "+ avgper + "%");
                System.out.println("Grade: "+ grade);
                sc.close();
         
             }
     }