import java.util.Arrays;

public class MyArr <T> {
    private Object [] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public  MyArr() {
        elements = new Object [DEFAULT_CAPACITY];
    }
    public void add (T element){

        if (elements.length == size){
            increaseCapacity();
        }
        elements [size++] = element;
    }
    public boolean delete (T element){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)){
                for (int j = i; j < size - 1 ; j++) {
                    elements[j] = elements [j + 1];
                }
                size --;
                return true;
            }
        }
        return false;
    }
    public int find (T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public T get(int index){
        if (index < 0 || index >= size ){
            throw new IndexOutOfBoundsException();
        }

        return (T) elements[index];
    }
    private void increaseCapacity (){
        int newLength = elements.length * 2;
//        Object [] elements2 = new Object[newLength];
//        System.arraycopy(elements, 0, elements2, 0, elements.length);  // если просто скопировать
//        elements = elements2;
        elements = Arrays.copyOf(elements, newLength);
    }

    public void print(){
        System.out.println(Arrays.toString(Arrays.copyOf(elements, size)));// печать без null
    }


}



//Описание занятия: Попробуйте создать свой ArrayList
//с операциями добавить и удалить, найти, напечатать все элементы
//
//Создайте свой класс, в качестве хранилища используйте массив любой длины.
