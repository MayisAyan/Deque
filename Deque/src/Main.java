import java.util.ArrayList;
import java.util.List;

class Deque<T>{
    ArrayList<T> arr = new ArrayList<>();
    int front;
    int rear;
    int size;
    Deque(int size){
        front = -1;
        rear = 0;
        this.size = size;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    public T getFront(){
        return arr.get(front);
    }
    public T getRear(){
        return arr.get(rear);
    }

    public void  insertFront(T data){
        if(isFull()){
            System.out.println("The Deque is full");
            return;
        }
        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(front == 0){
            front = size - 1;
        } else{
            front = front -1;
        }
        arr.add(front, data);
    }

    public void insertRear(T data){
        if(isFull()){
            System.out.println("The Deque is full");
            return;
        }
        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(rear == size - 1){
            rear = 0;
        } else{
            rear = rear + 1;
        }
        arr.add(rear,data);
    }

    public void  deleteFront(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        arr.remove(front);
        if(rear == front){
            front = -1;
            rear = -1;
        }
        else{
            if(front == size - 1){
                front = 0;
            } else{
                front = front + 1 ;
            }
        }
    }

    public void  deleteRear(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        arr.remove(rear);
        if(rear == front){
            rear = -1;
            front = -1;
        }
        else if(rear == size - 1){
            rear = 0;
        } else{
            rear = rear - 1;
        }
    }
}