package task;

public class DoubleLinkedList<T extends Comparable<T>> {

    //поля
    private DoubleLinkedListItem<T> head; //первый элемент слева
    private DoubleLinkedListItem<T> tail; //последний элемент
    private int listSize; //длина спинки

    //конструктор
    public DoubleLinkedList(){
        head = tail = null;
        listSize = 0; //первичный показатель списка = 0
    }

    //возвращает 1-ый компонент с показанным значением
    public DoubleLinkedListItem<T> findFirstItem(T number){
        if (listSize == 0) return null; //лист пустой при значении "0"
        DoubleLinkedListItem<T> element = head; //голова списка
        //пока элемент не "0" и  не равен значению number, продолжаем приравнивать со след.
        while (element != null && !element.getData().equals(number)) {
            element = element.getNext();
        return element;
    }

    //возвращает последний элемент с указанным значением
    public DoubleLinkedListItem<T> findLastItem(T value){
    if (listSize == 0) return null;
    DoubleLinkedListItem<T> element = tail;
    while (element != null && !element.getData().equals(value)) element = element.getPrev();
        return element;
    }

    //первый аргумент - элемент списка; второй - данные
    public void insertAfter(DoubleLinkedListItem<T> numberItemWeWantInsert, T data){
        if (listSize == 0){ //проверка на нулевой лист
            head = tail = new DoubleLinkedListItem<>(data); //указываем голову и хвост за новые единицы, т.е. увеличиваем размер на "1"
            listSize++;
            return;
        }
        DoubleLinkedListItem<T> item = new DoubleLinkedListItem<>(data); //новый элемент списка
        if (numberItemWeWantInsert == null){ //проверка на пустой лист
            //говорим, что следующий элемент будет головой
            item.setNext(head); //первый аргумент - элемент списка
            //второй аргумент - данные
            head = item;
        }
        //хвост - элемент - голова
        else if (numberItemWeWantInsert == tail) {
            tail.setNext(item);
            tail = item;
        }
        else {
            item.setPrev(numberItemWeWantInsert);
            item.setNext(numberItemWeWantInsert.getNext());
            numberItemWeWantInsert.getNext().setPrev(item);
            numberItemWeWantInsert.setNext(item);
        }
        listSize++;
    }

        //первый аргумент - элемент списка; второй - данные
    //размер листа +1
    public void insertBefore (DoubleLinkedListItem<T> numberItemWeWantInsert, T data){
        if (listSize == 0){
            head = tail = new DoubleLinkedListItem<>(data);
            listSize++;
            return;
        }
        DoubleLinkedListItem<T> item = new DoubleLinkedListItem<>(data);
        if (numberItemWeWantInsert == null){
            tail.setNext(item);
            item.setPrev(tail);
            tail = item;
        }
        else if (numberItemWeWantInsert == head) {
            item.setNext(head);
            head.setPrev(item);
            head = item;
        } else {
            item.setNext(numberItemWeWantInsert);
            item.setPrev(numberItemWeWantInsert.getPrev());
            numberItemWeWantInsert.getPrev().setNext(item);
            numberItemWeWantInsert.setPrev(item);
        }
        listSize++;
    }

    //удаляет переданный элемент из списка
    public void remove(DoubleLinkedListItem<T> itemNumberRemove) {
        if (listSize == 1){ //пусть лист состоит из одного элемента
            head = tail = null;
        }
        else if (itemNumberRemove == tail) { //проделываем с хвостом тоже самое, что и делали с головой
            itemNumberRemove.getPrev().setNext(null);
            tail = itemNumberRemove.getPrev();
        }
        else if (itemNumberRemove == head) { //допустим, что номер = голове
            itemNumberRemove.getNext().setPrev(null);
            head = itemNumberRemove.getNext(); //и делаем так, чтобы голова = следующий удаленный элемент
        }
        else { //пусть элемент для удаления находится где-то между головой и хвостом
            itemNumberRemove.getNext().setPrev(itemNumberRemove.getPrev());
            itemNumberRemove.getPrev().setNext(itemNumberRemove.getNext());
        }
        listSize--;
    }

    //метод, возвращающий длины списка
    public int getSize(){
        this.listSize = listSize;
        return listSize;
    }
    //метод, возвращающий первый элемент
    public DoubleLinkedListItem<T> getFirst(){
        this.head = head;
        return head;
    }
    //метод, возвращающий ласт элемент
    public DoubleLinkedListItem<T> getLast(){
        this.tail = tail;
        return tail;
    }
}

