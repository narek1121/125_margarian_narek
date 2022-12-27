public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int partSquare = 0;
        int fullSquare = 0;
        while (partSquare <= num){
            if(partSquare*partSquare <= num)
                fullSquare = partSquare*partSquare;
            else
                break;
            partSquare++;
        }
        return fullSquare;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int function = 1; //p(0)
        int changeK = 1; //k=1, это меняющееся k
        int k = 1; //изначально ставим k=1
        int sum = 0;
        if (num == 0)
            return function;
        if (num > 0) {
            while (changeK <= num) {
                sum = 2 * k + 6;
                changeK++;
                k = sum;
            }
            return sum;
        }
        return sum;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        // => num это натуральное число
        int powBase = base;
        while (num >= powBase && num != powBase) {
            powBase = powBase * base;
        }
        return powBase == num;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int operaNumb = 0; //изначальное количество операций
        float iStart = start;
        while (iStart > end) {
            if ((iStart % 2 == 0) && (end < iStart / 2)) {
                //если iStart кратен двум и end < 1/2 iStart
                iStart = iStart / 2; //iStart : 2;  запоминаем новое значение и начинаем алгоритм по новой
            } else {
                iStart = iStart - 1;
            }//если iStart кратен двум и end < 1/2 iStart, то все начинается заново;
            //если условия не соблюдены, то iStart просто будет уменьшаться до значения end
            operaNumb++;
        }
        return operaNumb;
    }
}

