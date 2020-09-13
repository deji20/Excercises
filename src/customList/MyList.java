package customList;

public class MyList<T> {
    private T[] list;
    private int cursor;

    public MyList(){
        cursor = 0;
        list = (T[]) new Object[5];
    }

    public int size(){
        return cursor;
    }
    public boolean isEmpty(){
        return cursor < 1;
    }
    public void add(T element){
        list[cursor] = element;
        cursor++;
        if(cursor > list.length - 1){
            T[] newList = (T[]) new Object[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
    }
    public boolean add(int index, T element) {
        if(cursor < index || index < -1){
            throw new IndexOutOfBoundsException("dum fejl der");
        }

        T temp;
        for(int i = index; i < cursor; i++){
            temp = list[i];
            list[i] = element;
            element = temp;
        }
        list[cursor] = element;
        cursor++;

        if (cursor > list.length - 1) {
            T[] newList = (T[]) new Object[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        return true;
    }
    public T get(int index){
        if(index < cursor && index >= 0) {
            return list[index];
        }else{
            throw new IndexOutOfBoundsException("dum fejl bro!");
        }
    }
    public boolean remove(int index) {
        if(cursor < index || index < -1){
            throw new IndexOutOfBoundsException("dum fejl der");
        }

        for(int i = index; i < cursor-1; i++){
                list[i] = list[i + 1];
        }
        cursor--;

        if(cursor < (list.length/2)){
            T[] newList = (T[]) new Object[list.length / 2];
            System.arraycopy(list, 0, newList, 0, cursor);
            list = newList;
        }
        return true;
    }
    public boolean contains(T element){
        for(int i = 0; i < cursor; i++){
            if(list[i].equals(element)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String out = "{";
        for(int i = 0; i < cursor; i++){
            out += list[i] + ", ";
        }
        out += "}";
        return out;
    }
}
