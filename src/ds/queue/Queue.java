package ds.queue;

public class Queue {

    private int maxSize;
    private int front;
    private int rear;
    private long[] queueArray;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.queueArray = new long[size];
        this.nItems = 0;
    }

    public void queueEnqueue(long i){

        if(rear == maxSize-1){
            rear = -1;
        }

        rear ++;
        this.queueArray[rear] = i;
        nItems ++;
    }

    public long queueDequeue(){ // remove item from the front of the queue
         long temp = queueArray[front];
         front ++;
         if (front == maxSize){
             front = 0; // we can set front back to 0 index so that we can utilize the entries array again
         }
         nItems --;
         return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (maxSize == nItems);
    }

    public void queueDisplay(){
        System.out.print("[ ");
        for (int i =0 ; i<queueArray.length ; i++){
            System.out.print(queueArray[i]+ " ");
        }
        System.out.print("]");
    }
}
