public class Task_1 implements Task_1_base {
    @Override
    public int subtask_1_if(int first, int second, int third) { // вычислить и вернуть min из first, second, third
        int minimum = first;
        if (minimum > second) {
            minimum = second;
        }
        if (minimum > third) {
            minimum = third;
        }
        return minimum;
    }

    @Override
    public boolean subtask_2_if(int year) {
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
    }

    @Override
    public int subtask_3_if(double x, double y, double left_up_x, double left_up_y, double width, double height)
    {
        // проверить, лежит ли точка с координатами (x;y) внутри невырожденного квадрата
        // итоги результатов:
        // 0 - не лежит
        // 1 - лежит
        // 2 - аргументы функции заданы неправильно
        double upper_point = left_up_x+width;
        double the_left_point = left_up_y-height;
        if(width == height)
            if((upper_point - x <= 0.000001 || x-left_up_x <= 0.000001) || (left_up_y-y <= 0.000001 || y-the_left_point <= 0.000001))
                return 0;
            else
            if(x > left_up_x && x < upper_point && y < left_up_y && y > the_left_point)
                return 1;
            else
                return 0;
            else
                return 2;
    }

    @Override
    public int subtask_4_if(double x0, double y0, double k, double b) {
        // Проверить, как расположена точка с координатами (x0;y0)
        // относительно прямой y = kx + b
        // итоги результатов:
        // 0 - лежит выше прямой
        // 1 - лежит ниже прямой
        // 2 - лежит на прямой
        if(Math.abs(y0-(k*x0+b)) <= 0.000001)
            return 2;
        else if(y0 > k*x0+b)
            return 0;
        else
            return 1;
    }

    @Override
    public String subtask_5_switch(int day_od_week) {
        // По номеру дня недели (day_od_week) вернуть его название на русском языке, записанное
        // с большой буквы
        String day = "Ошибка";
        switch (day_od_week) {
            case 1 -> day = "Понедельник";
            case 2 -> day = "Вторник";
            case 3 -> day = "Среда";
            case 4 -> day = "Четверг";
            case 5 -> day = "Пятница";
            case 6 -> day = "Суббота";
            case 7 -> day = "Воскресенье";
        }
        return day;
    }

    @Override
    public String subtask_6_switch(int direction) {
        // по заданному направлению direction вернуть его название:
        // 1 - север; 2 - юг; 3 - запад; 4 - восток. Во всех остальных случаях вернуть пустую строку
        if (direction == 1) {
            return "север";
        }
        if (direction == 2) {
            return "юг";
        }
        if (direction == 3) {
            return "запад";
        }
        if (direction == 4) {
            return "восток";
        }
        return "";
    }

    @Override
    public int subtask_7_if(double vx, double vy, double vz, double speed, double time, double wall) {
        // Проверить, достигнет ли снаряд, летящий из точки (0, 0, 0)
        // в направлении (vx, vy, vz) со скоростью speed стены, параллельной плоскости OYZ,
        // имеющей координату x равной wall, за время time
        // 0 - не достигнет
        // 1 - достигнет
        // 2 - аргументы функции заданы некорректно
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        double distance = Math.sqrt(wall*wall*Math.abs(vx) + wall*wall*Math.abs(vy) + wall*wall*Math.abs(vz));
        if(time > 0 && speed > 0)
            if((distance/speed <= time && vx != 0) || Math.abs(distance/speed - time) <= 0.000001 )
                return 1;
            else
                return 0;
            else
                return 2;
    }

    @Override
    public int subtask_8_if(double k1, double b1, double k2, double b2) {
        // Проверить, как друг относительно друга располагаются прямые y = k1*x + b1 и
        // y = k2*x + b2. Вернуть:
        // 1 - если параллельны
        // 2 - если пересекаются
        // 3 - если совпадают
        // Допустимой погрешностью при сравнении переменных типа double считать 0.000001
        // ------------------------------------------------------------------------------------
        if (k1 == k2 && Math.abs(k1 - k2) <= 0.000001)
            if (b1 != b2)
                return 1;
            else
                return 3;
            else
                return 2;
    }}
