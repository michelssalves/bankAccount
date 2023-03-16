package alvesmichel.bank;

public class Account {

    private static final int MAX_LENGTH = 12;
    private String ag;
    private String cc;
    private String name;
    private double balance;

    private Log logger;
    public Account(String ag,String cc,String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        }else{
            this.name = name;
        }

    }
    public boolean withDraw(double value){
        if(balance < value) {
            logger.out("Your balance is insufficient");
            return  false;

        }else{
            balance -= value;
            logger.out("Withdrawal made, your balance is now R$: " + balance);
            return true;

        }

    }
    public boolean deposit(double value){
        boolean result = true;

        if(value <= 0) {
            result =  false;
            logger.out("Cannot make this deposit");
        }else {
            balance += value;
            logger.out("Your balance is R$: " + balance);

        }
        return result;
    }
    public String toString(){
        String result = "Your account " + this.name + " AG: " + this.ag + " CC: " + this.cc + "  has a balance of R$ " + balance;
        return result;
    }
    public double getBalance(){
        return balance;
    }
}
