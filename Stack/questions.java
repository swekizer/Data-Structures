public class questions {
    public static void main(String[] args) {
        
    }
}


class stack{
    int size = 100000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }

    int peek(){
        return arr[top];
    }

    int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    int size(){
        return top+1;
    }


    //Here we will write functions for our questions
    
}