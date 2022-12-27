package task;
public class Triangle{

    //набор приватных членов
    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //публичные методы
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }
    // условие действительности треугольника
    //a,b,c должны быть > 0; сумма двух сторон должна быть > третьей стороны
    public boolean isValid() {
        boolean truth = true;
        boolean statement = false;
        if (((a > 0) && (b > 0) && (c > 0) && ((a + b) > c) && ((a + c) > b) && ((b + c) > a)) == truth) {
            return true;
        } else {
            return statement;
        }
    }

    public double perimeter(){
        if(isValid())
            return a+b+c;
        else
            return -1;
    }

    public double square(){
        if(isValid()){ //формула Геррона
            double x = (a + b + c) / 2;
            double square = Math.sqrt(x*(x-a)*(x-b)*(x-c));
            return square;
        } else
            return -1;
    }
}
