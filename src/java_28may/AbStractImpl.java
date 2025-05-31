package java_28may;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class AbStractImpl {
    abstract void addElement(List<Integer> mList);

    public boolean findNumber(ArrayList<Integer> mList, int number) {
        return mList.contains(number);
    }

    protected void sortList(ArrayList<Integer> mList) {
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        mList.sort(integerComparator);
    }

}
