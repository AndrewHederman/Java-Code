package cards;

import java.util.*;

import java.lang.*;

import java.io.*;

public class Cards {
    
//Permutates all of the 1820 possible card combinations
    
public void permute(int i1,int i2,int i3, int i4){
    
    {
//Each card can be an integer from 0 to 13 
        
//Each card has a for loop to account for every possible combination
        
for(i1 = 1; i1 <=13; i1++);

for(i2 = i1; i2 <=13; i2++);

for(i3 = i2; i3 <=13; i3++);

for(i4 = i3; i4 <=13; i4++);

//The cards are assigned variables after each for loop

  int c1 = i1;
  
  int c2 = i2;
  
  int c3 = i3;
  
  int c4 = i4;
  
    }
 //The postfix equation will be a string
 
  String solution;
  
  //The 4 integers from each combination are put into a list
  
  List <Integer> Cards;
   
    } 

	public static void main (String[] args) throws java.lang.Exception{
       
            //The output of the code is the postfix equation for each card comdination
            
            System.out.println(solution);
          
        //Operators are applied in all possible combinations
        
        float applyOperator(float a, float b, char c) {
            
        switch (c) {
            
            //The four possible cases of operators that can be used
            
            case '+':
                
                //Applying the addition operator
                
                return a + b;
                
            case '-':
                
                //Applying the subtraction operator
                
                return b - a;
                
            case '*':
                
                //Applying the multiplication operator
                
                return a * b;
                
            case '/':
                
                //Applying the division operator
                
                return b / a;
                
            default:
                
            //The default for no operator reutrns not a number exception 
                
                return Float.NaN; 
                
        }
        
        }
        
        }
        //The postfix expression is a string of digits and operators
        
        String Postfix (String postfix){
            
         class   PostfixExpression{
             
             //Creating a string for the operators and the postfix expression
             
             String operator, expression;
             
             //The postfix string elements will be stored in a stack
             
             Stack<PostfixExpression>expr = new Stack<>();
             
             Postfixexpression(String p){
                 
                 //String of the postfix expression
                 
                 expression = p;
                 
             }
             
             //The string of the postfix expression is composed of digits and operators
             
             PostfixExpression(String expression1, String expression2, String operator){
                 
                 //Formatting the postfix string
                 
                 expression = String.format(expression1, operator,expression2);
                 
             }
             //For the postfix expression change it to an array
             
             for (char c : postfix.toCharArray()){
                 
             //Index the array
                 
             int index = indexOf(c);   
             
         }
             
             return (c);
             
        }
         
        } 
        //Calculate the postfix equation
        
        static long calcDigits(int[] a) {
            
        long total = 0;
        
        //Calulate for 4 digits in the equation
        
        for (int i = 0; i < 4; i++)
            
            total += (1 << (a[i] * 5));
    
        return total;
        
         }
        
        //Permutate all of the possible card comdinations of 4 digits in length
        
         void permute (List<Integer>Cards,Set<List<Integer>>cardDigits, int j){
            
            for (int z = j; z < Cards.size(); z++){
                
             //Switch the position of the cards in the list to find all possible combinations
             
                Collections.swap(Cards);
                
                //Permutate the cards
                
                permute(Cards);
                
            }
            
            if (j == Cards.size())
                
                //For each 4 card combination create an array 
                
                cardDigits(new Arraylist<>(Cards));
            
            }  
        
         //Permutate all of the operators for every postfix equation
         
         void permuteOperators(List<Integer>Operators, int n, int x){
             
           //Iterate through every possible comdination of operators
           
           for (int y = 0, npower = n*n; y < x; y++)
               
               //Display the possible postfix expressions as and array
               //Include the card digits in the array for the full expression
               
              cardDigits.add(Array.asList((y/npower),(y%npower)/n,y%n)); 
           
	}
}