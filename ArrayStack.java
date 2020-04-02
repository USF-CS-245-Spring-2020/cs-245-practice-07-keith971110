public class ArrayStack<T> implements Stack<T>{

    T [] array = (T[]) new Object[10];;
    int top = 0;

    public void push(T item){
        if(top == array.length)
            growArray();
        array[top] = item;
        top++;

    }
    private void growArray(){
        T [] temp = (T[]) new Object[array.length*2];
        for(int i = 0; i < array.length; i++)
            temp[i] = array[i];
        array = temp;
    }
    public T pop() throws Exception{
        if(top <= 0)
            throw new IndexOutOfBoundsException();
        T itemRemove = array[top-1];
        top--;
        return itemRemove;
    }
    public T peek() throws Exception{
        if(empty())
            throw new IndexOutOfBoundsException();
        return array[top];
    }
    public boolean empty(){
        return top == 0;
    }
}