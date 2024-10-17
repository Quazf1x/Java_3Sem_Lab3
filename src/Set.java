import java.util.HashSet;

public class Set {
    private java.util.Set<Integer> set;
    private int size;

    public Set(int n) {
        this.set = new HashSet<>();
        this.size = n;
    }

    public int size() {
        return set.size();
    }

    public void add(int num) {
        if(set.size() < this.size) {
            set.add(num);
        } else {
            System.out.println("Невозможно добавить число " + num + ", множество максимально заполнено.\n");
        }
    }

    public void remove(int num) {
        set.remove(num);
    }

    // Вывод множества пересекающихся элементов из двух множеств
    public Set intersect(Set otherSet) {
        Set interSet = new Set(Math.min(this.size, otherSet.size()));
        for (Integer num: set) {
            if (otherSet.set.contains(num)) {
                interSet.add(num);
            }
        }
        return interSet;
    }

    // Метод объединения двух множеств
    public Set union(Set otherSet) {
        Set res = new Set(this.size + otherSet.size);
        res.set.addAll(this.set);
        res.set.addAll(otherSet.set);
        return res;
    }

    public String getSet() {
        return set.toString();
    }

}
