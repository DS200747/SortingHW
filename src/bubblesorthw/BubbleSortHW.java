
package bubblesorthw;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortHW {
   
   private static ArrayList<Integer> NumList= new ArrayList<Integer>();
    
    
    public static void GetNumbers(){
        Scanner input = new Scanner(System.in);
        
        boolean check = false;
        
        do{
            System.out.println("---------");
            System.out.println("Please enter a number");
            int number = input.nextInt();
            NumList.add(number);
            System.out.println("Would you like to add another number? Y or N");
            String answer = input.next();
            answer = answer.toUpperCase();
            if(answer.equals("Y")){
                check = false;
            }else if(answer.equals("N")){
                System.out.println("----------");
                check = true;
            }else{
                System.out.println("Invalid answer.");
            }
        }while (check==false);
        
            
        
    }
    
    public static void SortNumbers(){
        for(int x=0;x<NumList.size();x++){
            for(int y=NumList.size()-1;y>x;y--){
                if(NumList.get(x)>NumList.get(y)){
                    int sorted = NumList.get(x);
                    NumList.set(x,NumList.get(y));
                    NumList.set(y,sorted);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        
        System.out.println("Please enter some numbers to be sorted from lowest to highest.");
        
       GetNumbers();
       SortNumbers();
       
        System.out.println("Your sorted numbers are: ");
       for(int x: NumList){
           System.out.print(" "+x+" ");
       }
        
    }
    
}
