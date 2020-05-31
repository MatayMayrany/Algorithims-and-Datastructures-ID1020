public class Main {
    public static void main(String[] args){
        Linkedlist test = new Linkedlist();
        test.insertItem(10);
        test.insertItem(6);
        test.insertItem(2);
        test.insertItem(42);
        test.insertItem(34);
        test.insertItem(3);
        test.insertItem(10);
        test.insertItem(6);
        test.insertItem(2);
        test.insertItem(123);
        test.insertItem(129);
        test.insertItem(88);
        Node printer = test.front;
        int size = test.getLength();
        // print the list
        System.out.print("unsorted list: ");
        for(int i = 0; i < size; i++){
            System.out.print(printer.value + "  ");
            printer = printer.next;
        }
        System.out.println();
        // print #of inversions
        InversionCounter invCount = new InversionCounter();
        System.out.println("inversions: " + invCount.invCount(test));
        // sort the list
        Bubblesort sort = new Bubblesort();
        sort.bsort(test);
        printer = test.front;
        //print again
        System.out.print("sorted list: ");
        for(int i = 0; i < size; i++) {
            System.out.print(printer.value + "  ");
            printer = printer.next;
        }
        // Print # of swaps
        System.out.println();
        System.out.println( "swaps: " + test.swapCount);
    }
}
