public class ArrayQueue<T> implements Queue<T>{
    public int a, b, size;
    public T[] arr;

    public ArrayQueue(){
        a=0;
        b=0;
        size=0;
        arr = (T[]) new Object[10];
    }
    public void doubleArray(){
        T[] temp= (T[]) new Object[arr.length*2];
        for(int i =0; i<size;i++){
            temp[i] = arr[(a+i)%arr.length];
        }
        a =0;
        b=size;
        arr=temp;
    }
    public boolean empty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public void enqueue(T item){
        if(size==arr.length){
            doubleArray();
        }
        arr[(b%arr.length)] =item;
        b++;
        size++;
    }
    public T dequeue() throws Exception
    {
        if(empty())
            throw new IndexOutOfBoundsException();
        T dataRemove = arr[a];
        a++;
        size--;
        return dataRemove;
    }
}
