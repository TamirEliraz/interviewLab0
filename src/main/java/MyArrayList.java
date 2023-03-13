import java.util.*;

public class MyArrayList extends ArrayList<Integer> implements List<Integer> {
    public MyArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MyArrayList() {
        super();
    }

    public MyArrayList(Integer... values) {
        this();
        this.addAll(Arrays.asList(values));
    }

    public MyArrayList(int val, boolean my) {
        this(my ? 1 : val);
        if (my) {
            add(val);
        }
    }

    public MyArrayList(Collection<? extends Integer> c) {
        super(c);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!o.getClass().equals(this.getClass())) return false;
        MyArrayList other = (MyArrayList) o;
        if (other.size() != this.size()) return false;
        for (int i = 0; i < size(); i++) {
            if (!Objects.equals(get(i), other.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
