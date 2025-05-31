package java_28may;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private String name;
    private List<Integer> mList;

    public Theatre(String name) {
        this.name = name;
        this.mList = new ArrayList<>();
    }

    public void addElement(int item) {
        mList.add(item);
    }

//    @Override
//    void addElement(List<Integer> mList1) {

    /// /        Collections.sort(new ArrayList<>(mList1));
//        this.mList.addAll(mList1);
//    }
    @Override
    public String toString() {
        return "Theatre { " +
                "name='" + name + '\'' +
                ", mList = " + mList +
                '}';
    }



}
