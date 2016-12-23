package cardgame;

import java.util.*;

public class CardGame { 
    
    //Creates a list of random numbers which are integers
    
    List<Integer> randomDigits(){
    
    //Generates random numbers and assigns them to the variable r
    
    Random r = new Random();
    
    //The list of random numbers creates an array of 4 random numbers
    
    List<Integer>result = new ArrayList<>(4);
    
    //The random number generator runs through 4 iterations
    
    for (int i = 0; i <4; i++)
        
        result.add(r.nextInt(13)+1);
    
    return result;
    
    }
    
    public static void main(String[] args) {
        
        //Each random number digit is an integer
        
        int [] digits = RandomDigits();
        
        //The output of the code shows the 4 random numbers being used
        
        System.out.print("24 can be made from the following random digits: ");
       
        System.out.println(Arrays.toString(digits));
 
        //The postfix equation is stored in a stack
        
        Stack<Float> s = new Stack<>();
        
        long total = 0;
        
        for (char x : in.nextLine().toCharArray()) {
            
            //The integers of each random number msut be between 0 and 13
            
            if (0 <= x && x <= 13) {
                
                int d = x - 0;
                
            //Adds an assignment to the total for each element in the stack
            
                total += (1 << (d * 5));
                
                //Adds a new object to the stack
                
                s.push((float) d);
                
            } else if ("+/-*".indexOf(x) != -1) {
                
                //Apply the operators to the postfix expression
                
                s.push(applyOperator(s.pop(), s.pop(), x));
                
            }
            
            return;
            
    }
        
    }
    //Method applies the possible operators to the postfix equation
    
    static float applyOperator(float a, float b, char x) {
        
        switch (x) {
        
        //The four possible cases of operators that can be used 
            
            case '+':
              
            //Addition operator
                
                return a + b;
                
            case '-':
                
            //Subtarction operator
                
                return b - a;
                
            case '*':
                
            //Multiplication operator
                
                return a * b;
                
            case '/':
                
            //Division operator
                
                return b / a;
                
            default:
                
            //If none of the operators are used return not a number
                
                return Float.NaN;
                
        }
        
    }
    
    //Calulate the postfix equation
    
    static int[] randomDigits(int j) {   
        
        int total = 0;
        
        //There are 4 total random integers
        
        int[] result = new int[4];
        
        //Run through the calculations for each integer
        
        for (int i = 0; i < 4; i++)   
            
            result[j] = digits.nextInt(13) + 1;
        
        total += (1 << (a[j] * 5));
        
        //Output the final equation
        
        System.out.println(total);
        
        return result;
        
    }
    
}