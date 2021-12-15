package week2.DSA.baitap.my_array_list;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
     Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        if(capacity >= 0 ){
            elements = new Object[capacity];
        }else{
            System.out.println("Error");
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for (int i = 0 ; i<elements.length ;i++ ){
            elements[i] = null;
        }
    }
    public boolean add(E element){
        if(elements.length == size){
            this.ensureCapacity(5);
        }
        size++;
        elements[size] = element;
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if(minCapacity >= 0){
            int newCapacity =this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newCapacity);
        }else{
            System.out.println("Error");
        }
    }
    public void add(E element, int index){
        if(index > elements.length){
            System.out.println("Out of area");
        }else if(elements.length == size){
            ensureCapacity(5);
        }
        if(elements[index] == null){
            elements[index] = element;
            size++;
        }else{
            for (int i = size+1 ; i < index;i--){
            elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    public boolean contains (E element){
        return  this.indexOf(element) >= 0;
    }
    public MyList<E> clone(){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }
    public  E remove (int index){
        if (index < 0 || index > elements.length){
            System.out.println("Out of area");
        }
            E element = (E) elements[index];
            for (int i = 0 ; i < size-1;i++){
                elements[i] = elements[i-1];
            }
            elements[size-1] = null;
            size--;
            return element;
    }
}
