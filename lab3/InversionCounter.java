public class InversionCounter {
    public int invCount(Linkedlist list) {
        int inversions = 0;
        Node comparedTo = list.front;
        Node comparer;
        while (comparedTo != null) {
            comparer = comparedTo.next;
            while (comparer != null) {
                if (comparedTo.value > comparer.value) {
                    inversions++;
                }
                comparer = comparer.next;
            }
            comparedTo = comparedTo.next;
        }
        return inversions;
    }
}