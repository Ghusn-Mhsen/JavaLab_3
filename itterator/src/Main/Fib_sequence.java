package Main;

import java.util.ArrayList;

public class Fib_sequence extends num_sequence {


    Fib_sequence(int limit) {
        int summ = 0;
        this.start_element = 1;
        this.end_element = limit;
        super.Generate_list();
        this.List.add(0, start_element);
        this.List.add(1, start_element);
        for (int i = 2; i < limit; i++) {
            summ = (int) (this.List.get(i - 1)) + (int) (this.List.get(i - 2));
            this.List.add(i, summ);
            summ = 0;

        }
    }


    @Override
    public ArrayList<Object> Accept_filter(filter filterobject) {
        this.List.clear();
        for (Object x : new Fib_sequence((int) this.end_element).List) {
            if (filterobject.IsAcceptable(x)) {
                this.List.add((int) x);
            }
        }
        return this.List;

    }

    public void print_List() {

        for (Object x : this.List) {
            System.out.println((int) x);
        }
    }


    @Override
    public Object AcceptAggregator(aggregator aggregatorObject) {

        return (int) aggregatorObject.Doaggregator(this.List);
    }

    @Override
    public ifilterable AcceptFilter(filter filterObject) {
        return null;
    }

    @Override
    public void Square_number() {
        ArrayList<Object> a = new ArrayList<Object>();

        for (int i = 0; i < this.List.size(); i++) {
            int m = (int) this.List.get(i) * (int) this.List.get(i);
            a.add(m);
        }

        this.List.clear();
        for (Object x : a) {
            this.List.add(x);

        }
        this.print_List();
    }

    public class FibonacciSequenceIterator extends sequence_itterator {


        private int ind = 0;

        @Override
        public boolean HasNext() {
            int ind = 0;
            if (List.size() > ind)
                return (int) List.get(this.ind) < (int) end_element;
            else
                return ((int) List.get(this.ind - 1)
                        + (int) List.get(this.ind - 2)) < (int) end_element;
        }

        @Override
        public Object GetNext() {
            if (List.size() <= ind)
                List.add((int) List.get(this.ind - 1)
                        + (int) List.get(this.ind - 2));
            return (int) List.get(this.ind++);

        }

    }

    @Override
    public sequence_itterator GetIterator() {
        return new FibonacciSequenceIterator();
    }

    public void Itterator_Print(sequence.sequence_itterator MyIterator) {
        while (MyIterator.HasNext()) {
            int m = (int) MyIterator.GetNext();
            System.out.println(m);
        }

    }

    public int Itterator_count_value(sequence.sequence_itterator MyIterator, int val) {
        MyIterator = new Fib_sequence((int) this.end_element).GetIterator();
        int count = 0;
        if (this.List == null)
            this.GetIterator();
        while (MyIterator.HasNext()) {

            int m = (int) MyIterator.GetNext();

            if (m == val) {

                count++;
            }
        }
        return count;
    }
}
