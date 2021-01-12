package ds.queue;

public class QueueApp {

    public static void main(String[] args){
        Queue myQue = new Queue(5);
        myQue.queueEnqueue(10);
        myQue.queueEnqueue(100);
        myQue.queueEnqueue(1000);
        myQue.queueEnqueue(10000);
        myQue.queueEnqueue(100000);
        myQue.queueEnqueue(20);
        myQue.queueEnqueue(200);
        myQue.queueEnqueue(2000);
        myQue.queueEnqueue(20000);
        myQue.queueEnqueue(200000);

        System.out.println(myQue.queueDequeue());
        System.out.println(myQue.queueDequeue());
        System.out.println(myQue.queueDequeue());

        System.out.println(myQue.isFull());
        System.out.println(myQue.isEmpty());

        myQue.queueDisplay();
    }
}
