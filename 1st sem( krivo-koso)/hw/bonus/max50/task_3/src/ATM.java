public class ATM {
   private int ten_USD;
    private int twelve_USD;
    private int fifty_USD;
    private int one_hundred_USD;

    private int total_count;

    public ATM(int ten_USD, int twelve_USD, int fifty_USD, int one_hundred_USD){
        this.ten_USD = 10;
        this.twelve_USD = 20;
        this.fifty_USD = 50;
        this.one_hundred_USD = 100;
    }

    public int getTen_USD() {
        return ten_USD;
    }

    public void setTen_USD(int ten_USD) {
        this.ten_USD = ten_USD;
    }

    public int getTwelve_USD() {
        return twelve_USD;
    }

    public void setTwelve_USD(int twelve_USD) {
        this.twelve_USD = twelve_USD;
    }

    public int getFifty_USD() {
        return fifty_USD;
    }

    public void setFifty_USD(int fifty_USD) {
        this.fifty_USD = fifty_USD;
    }

    public int getOne_hundred_USD() {
        return one_hundred_USD;
    }

    public void setOne_hundred_USD(int one_hundred_USD) {
        this.one_hundred_USD = one_hundred_USD;
    }

    public void load(int ten_USD, int twelve_USD, int fifty_USD, int one_hundred_USD ){
        this.total_count+= ten_USD + twelve_USD + fifty_USD + one_hundred_USD;
    }
    public boolean give(int sum) {
        if (sum % 10 != 0) {
            return false;
        }
        if (sum > one_hundred_USD) {
            one_hundred_USD -= sum / 100;
            sum -= (sum / 100) * 100;
            }
        if (sum > fifty_USD) {
            fifty_USD -= sum / 50;
            sum -= (sum / 50) * 50;
        }
        if (sum > twelve_USD) {
            twelve_USD -= sum / 20;
            sum -= (sum / 20) * 20;
        }
        if (sum > ten_USD) {
            ten_USD -= sum / 10;
            sum -= (sum / 10) * 10;
        }
        if(sum !=0){
        return true;
        }
        else{
            return false;
        }
    }

}