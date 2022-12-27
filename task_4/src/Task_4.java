import java.util.Arrays;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        int[] newArray = new int[size]; //создаем новый массив размера size
        newArray[0] = a0; //первый элемент массива это а0
        for (int i = 1; i < size; i++) {
            newArray[i] = newArray[i - 1] + d;
        }
        return newArray;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого = 1;каждый следующий = сумме предыдущих
        int summa = 1; //summa это первый элемент
        int[] myArray = new int[size];
        myArray[0] = 1;
        for (int i = 0; i < size; i++) {
            if (i <= 1) {
                myArray[i] = myArray[0]; //нулевой и первый элементы равны 1
            }
            if (i >= 2) {
                //пусть i = 2 => 1 = 1 + 0 = 2
                summa = summa + myArray[i - 1];
                myArray[i] = summa; //проверяем, что [2] = 2
            }
        }
        return myArray;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        // сгенерировать и вернуть массив размера size, содержащий первые
        // size чисел последовательности Фибоначчи
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) myArray[i] = 0;
            if (i == 1 || i == 2) myArray[i] = 1;
            if (i > 2) myArray[i] = myArray[i - 2] + myArray[i - 1];
        }
        return myArray;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        // для этого массива вычисляем max элемент
        //максимальное значение то, когда data[i] = max число
        //если data[i] > max, то max = data от i
        //i всегда растет
        int maxValue = data[0]; //пусть max элемент = data от 0
        for (int i = 0; i < data.length; i++) {
            if (maxValue < data[i]) { //если max <,
                maxValue = data[i]; //то, max = data от i
            }
        }
        return maxValue;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        // для этого массива вычисляем max элемент
        // кратный k. Гарантируется, что как минимум один такой элемент
        // в массиве есть
        int maximum = data[1]; //допустим, что max = data от 1
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maximum && data[i] % k == 0)
                maximum = data[i]; //max = data от i
        }
        return maximum;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        // даны два массива: arr1, arr2.
        // скрестить данные массивы в один
        int[] myArray = new int[arr1.length + arr2.length]; //создаем новым массив
        int count = 0; //создаем счетчик номера элементов нового массива
        for (int i = 0; i < arr1.length; i++) {
            myArray[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) myArray[count++] = arr2[j];

        Arrays.sort(myArray);
        return myArray;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        return null;
    }
}


