public class MyStack {
   
    Integer[] stack;
    int size;

    public MyStack(){

        this.size = 0;
        stack = new Integer[2];
        
    } 

    public MyStack(int initCap){

        this.size = 0;
        this.stack = new Integer[initCap];
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        } else {

            return false;
        }
    }

    public Integer peek(){

        return stack[stack.length-1];
    }

    public Integer pop(){

        size--;
        int x = this.peek();
        Integer[] oldStack = stack;
        stack = new Integer[size];

        for(int i = 0 ; i<stack.length; i++){

            stack[i] = oldStack[i];

        }
        

        return x;
    }

    public void push(Integer x){
        size++;

        if(size>stack.length){
            doubleCapacity();
        }

        stack[size-1] = x;

    }

    private void doubleCapacity(){

        Integer[] newList = new Integer[stack.length*2];

		for(int i = 0; i<size; i++){
			
			stack[i] = newList[i];

		}

    

		stack = newList;

        

    }

    public String toString(){

        String s = "[";

        for(int i = 0; i< stack.length; i++){

            s = s+" "+stack[i];

            if(i<size-1){

                s = s+",";
            }
        }

        s = s+"]";

        return s;
        
    }


    

}
