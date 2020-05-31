public class Linkedlist {
    public Node front;
    public int length;
    public int swapCount = 0;
    public boolean isEmpty(){
        if (front==null) return true;
        else return false;
    }

    public int getLength(){
        int counter = 0;
        Node tracker = front;
        while(true){
            if (tracker == null){
                break;
            }
            tracker = tracker.next;
            counter++;

        }
        return counter;
    }

    public void swap(Node swapped1){
        swapCount++;
        int tempValue = swapped1.value;
        swapped1.value = swapped1.next.value;
        swapped1.next.value = tempValue;

    }

    public void insertItem(int data){
        Node temp = new Node();
        temp.value = data;
        temp.next = front;
        front = temp;
    }
}

