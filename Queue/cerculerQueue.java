public class cerculerQueue {
    static class cerculerQue {
       static int arr[];
       static int size;
       static int rear ;
       static int front ;
        
        cerculerQue(int n) {
            arr=new int [n];
            size=n;
            front=-1;
            rear=-1;

        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isfull(){
            return (rear+1)%size== front;
        }

        public static  void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            if(front ==-1){
                front =0;
            }

            rear=(rear+1 )%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue  is empty");
                return -1;
            }
           
            int result =arr[front];
             if(front == rear){
                front=rear=-1;
            }
            else{
                 front = (front+1)%size;
            }
           
            return result;
        }
        public static int peek(){
            return  arr[front];
        }
    }

    public static void main(String args[]){
        cerculerQue Q= new cerculerQue(6);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);

        
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}
