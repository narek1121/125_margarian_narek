package task;



//название класса
public class DoubleLinkedListSorter {
    public static <T extends Comparable<T>> void sort(DoubleLinkedList<T> list) {
        //постоянно увеличиваем размер листа на "1"; добавляем новый элемент

        //создаем луп с размером отсортированного листа, чтобы увеличивать его длину
        for (int sortedListSize = 0; sortedListSize <= list.getSize(); sortedListSize++ ) {
            //создаем новый элемент сортированного списка
            DoubleLinkedListItem<T> element = list.getFirst();
            int i = 0;
            //делаем луп, который будет увеличивать размер нового списка до момента, пока
            //кол-во раз не будет < старого листа - новый лист - 1
            //потому что i = 1
            while (i < list.getSize() - sortedListSize - 1){
                if (element.getData().compareTo(element.getNext().getData()) > 0) {
                    //тип даты всегда Т
                    T newData = element.getData();
                    //даем элементу дату следующего
                    element.setData(element.getNext().getData());
                    //устанавливаем дате следующего элемента новую дату
                    element.getNext().setData(newData);
                }
                //в конце должны добавить закономерность
                element = element.getNext();
                i++;
            }
        }
    }
}
