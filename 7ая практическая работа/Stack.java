package prac7;

public class Stack {
    public int size,top;
    public int[] array;

    public Stack(int s){
        size = s;
        array = new int[size+7];
        top = 0;
    }
    public boolean IsEmpty(){
        return (top==-1);
    }
    public void push(int m){
        array[top] = m;
        top++;
    }
    public int pop(){
        if (IsEmpty()){
            System.out.print("Стек пустой");
        }
        else{
            return array[top--];
        }
        return 0;
    }
    public int peek(){
        if (IsEmpty()){
            System.out.print("Стек пустой");
        }
        else{
            return array[top];
        }
        return 0;
    }
    public void show_stack() {
       for (int i = 0; i<size; i++){
           System.out.print(array[i]);
           System.out.print("  ");
       }
    }
    public int get_element(){
        return array[0];
    }
    public void delete_first_element(){
        for(int w = 0; w<size+6; w++){
            if(w!=11) {
                array[w] = array[w + 1];
            }
        }
    }

}
