package task;

public class DoubleLinkedListItem<T extends Comparable<T>> {

    //поля для методов
    private DoubleLinkedListItem<T> head; //head = данному любого типа T
    private DoubleLinkedListItem<T> tail; //tail = данному любого типа T
    private T data; //data - число

    //конструктор
    public DoubleLinkedListItem(T data){
        head = tail = null;
        this.data = data;
    }

    //getNext - получает значение хвоста, по условию равно null
    public DoubleLinkedListItem<T> getNext(){
        this.tail = tail;
        return tail;
    }
    //getPrev - получает значение головы, по условию равно null
    public DoubleLinkedListItem<T> getPrev(){
        this.head = head;
        return head;
    }
    //getData - возвращает ссылку на объект
    public T getData(){
        return  data;
    }
    //setNext - устанавливает ссылку на хвост
    public void setNext(DoubleLinkedListItem<T> newTail){
        this.tail = newTail;
    }
    //setPrev - устанавливает ссылку на голову
    public void setPrev(DoubleLinkedListItem<T> newHead){
        this.head = newHead;
    }
    //setData - устанавливает новую ссылку на элемент
    public void setData(T newData){
        this.data =  newData;
    }
}
