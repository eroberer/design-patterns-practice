package eroberer_practice.design_pattern._3_behavioral.chapter_16_iterator;

public class ArrayListIterator implements Iterator {

    private String[] list;
    private Integer position;

    public ArrayListIterator(String[] list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < list.length && list[position] != null) {
            return  true;
        }

        return false;
    }

    @Override
    public Object next() {
        if (!hasNext())
            return null;

        return list[position++];
    }
}
