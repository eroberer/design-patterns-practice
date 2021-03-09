package eroberer_practice.design_pattern._3_behavioral.chapter_16_iterator;

import java.util.Arrays;

public class ArrayList implements List {

    private String[] list;
    private Integer lastPosition;

    public ArrayList() {
        list = new String[10];
        lastPosition = 0;
    }

    @Override
    public void add(String value) {
        if (lastPosition == list.length) {
            String[] newList = Arrays.copyOf(list, list.length + 10);
            list = newList;
        }

        list[lastPosition] = value;
        lastPosition++;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayListIterator(list);
    }
}
