import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class StackProbs {
    
    public Stack<Integer> doubleUp(Stack<Integer> nums){

        int x= 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<nums.size(); i++)
            stack.push(nums.pop());
        for (int i = 0; i<stack.size(); i++){
            x = stack.pop();
            nums.push(x);
            nums.push(x);
        }
            
        return nums;
    }

    public Stack<Integer> posAndNeg(Stack<Integer> nums){


        int x = 0;
        Stack<Integer> posStack = new Stack<>();
        Stack<Integer> negStack = new Stack<>();
        for (int i = 0; i<nums.size(); i++){

            x= nums.pop();
            if(x<0){
                negStack.push(x);
            } else {
                posStack.push(x);
            }
            
        }

        for (int i = 0; i<negStack.size(); i++){

            x = negStack.pop();
            nums.push(x);
        }
        for (int i = 0; i<posStack.size(); i++){

            x = posStack.pop();
            nums.push(x);
        }
            
            
        return nums;
    }

     public Stack<Integer> shiftByN(Stack<Integer> nums,int n){


        int x = 0;
        Stack<Integer> stayStack = new Stack<>();
        Stack<Integer> moveStack = new Stack<>();

        for (int i = 0; i<nums.size(); i++){

            x= nums.pop();
            if(nums.size()<n){
                moveStack.push(x);
            } else {
                stayStack.push(x);
            }
            
        }

        for (int i = 0; i<stayStack.size(); i++){

            x = stayStack.pop();
            nums.push(x);
        }
        for (int i = 0; i<moveStack.size(); i++){

            x = moveStack.pop();
            nums.push(x);
        }
            
            
        return nums;
    }

    public String reverseVowels(String prevString){

        ArrayList<Character> consonants = new ArrayList<Character>();
        Stack<Character> vowels = new Stack<Character>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        Scanner charPickup = new Scanner(System.in);
        String finalString = "";

        for(int i = 0; i<prevString.length(); i++){

            char x = charPickup.next().charAt(i);

            if(x == 'a'|| x == 'e' || x == 'i' || x == 'o' || x == 'u'){

                vowels.push(x);
                indexes.add(i);
            } else {
                consonants.add(x);
            }
        }

        for(int i = 0 ; i<prevString.length(); i++){

           if(indexes.contains(i)){

                finalString += vowels.pop();
           } else{

                finalString+= consonants.remove(0);
           }
        }

        charPickup.close();
        return finalString;
    }

    public boolean bracketBalance(String s) {
        Stack<Character> stack = new Stack<>();
    
       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
    
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            
            else if (c == ')' || c == ']' || c == '}') {
               
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
    
       
        return stack.isEmpty();
    }
    
    
    private boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }
}
