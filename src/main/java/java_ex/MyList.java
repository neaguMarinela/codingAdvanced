package java_ex;

public class MyList {

    String[] list = null;
    int pointer = 0;

    public MyList() {
        list = new String[10];
    }

    public MyList(int size) {
        list = new String[size];
    }

    public void add(String element) {

        if (pointer <= list.length - 1) {
            list[pointer] = element;
            ++pointer;

        } else {
            String[] newList = new String[list.length + 20];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
    }

    public void remove(String element) {

        if (contains(element)) {
            int index = getIndex(element);
            int position1 = index;
            int position2 = index + 1;
            for (int i = index; i < list.length; i++) {
                if (position2 < list.length) {
                    list[position1] = list[position2];
                    position1++;
                    position2++;
                }
            }
            --pointer;
            list[pointer] = null;
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                return size;
            } else {
                size++;
            }
        }
        return size;
    }

    public String get(int index) {
        return list[index];
    }

    public boolean contains(String element) {
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].equalsIgnoreCase(element)) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }

    public int getIndex(String element) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equalsIgnoreCase(element))
                return i;
        }
        return -1;
    }
}
