package Question1;
import java.util.*;
public class Values implements fetchdata{

    ArrayList<Integer> array;
    Values()
    {
        array = new ArrayList<>();
    }

    public void addValues(int val) {
        array.add(val);
        System.out.println("Value : "+val+" added.");
    }

    public void display() {
        System.out.println("Values : "+array);
    }

    public void Sort()
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(array);

        array.clear();

        while(!pq.isEmpty())
            array.add(pq.poll());
    }
}
