package com.company;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear ;
    int length ;

    public static class Node<T>{
        private final int VIN;
        private final String vehicleType;
        private final String serviceType;
        private Node<T> next ;

        public Node(int VIN, String vehicleType, String serviceType) {
            this.VIN = VIN;
            this.vehicleType = vehicleType;
            this.serviceType = serviceType;
        }
    }
    public void enterForService(int VIN, String vehicleType, String serviceType ){
        if(front==null){
            rear= new Node<T>(VIN , vehicleType , serviceType);
            front=rear;
        }else{
            rear.next= new Node<T>(VIN , vehicleType , serviceType);
            rear=rear.next;
        }
        length++ ;
    }

    public int exitService(){
        if(front != null){
            int result = front.VIN;
            front=front.next;
            length--;
            return result ;
        }else {
            System.out.println("queue is empty");
            return 0;
        }
    }

    public void showQueue(){
        Node<T> currentNode = front;
        while (currentNode != null){
            System.out.println(currentNode.VIN + "  "+currentNode.vehicleType +" "+currentNode.serviceType );
            currentNode = currentNode.next ;
        }
        System.out.println();
        System.out.println();
    }

    public void inLine(int vehicleNO ){
        Node<T> currentNode =front ;
        int count=0;
        while (currentNode != null){
            ++count;
            if(currentNode.VIN == vehicleNO){
                System.out.println("Number of vehicles should service before searched vehicle is :  "+ (count-1));
                break;
            }
            currentNode=currentNode.next ;
        }if(currentNode == null){
            System.out.println("vehicle number = "+vehicleNO+" is not in the queue");
        }
    }
}
