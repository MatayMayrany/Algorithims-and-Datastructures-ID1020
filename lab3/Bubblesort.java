public class Bubblesort {
    public void bsort (Linkedlist a){
        if (a.isEmpty()) return;

        boolean swapped = true;
        int R = a.getLength() - 2;
        Node indexKeeper = new Node();

        while (R >= 0 && swapped == true){
            swapped = false;
            indexKeeper = a.front;
            for(int i=0; i<= R; i++){
                if (indexKeeper.value > indexKeeper.next.value){
                    swapped = true;
                    a.swap(indexKeeper);
                }
                indexKeeper = indexKeeper.next;
            }

            R = R - 1;

        }
    }

}
