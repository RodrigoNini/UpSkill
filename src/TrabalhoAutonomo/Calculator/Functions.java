package TrabalhoAutonomo.Calculator;

public class Functions {

    private String[] history;
    private int count;

    public Functions(){

        history = new String[6];
        count = 0;
    }

    public int sumInt(int a, int b){
        history[count] = a + "+" + b +"=" + (a+b);
        count++;
        return a + b;
    }
    public int subtractInt(int a, int b){
        history[count] = a + "-" + b +"=" + (a-b);
        count++;
         return a - b;
    }

    public int multInt(int a, int b){
        history[count] = a + "*" + b +"=" + (a*b);
        count++;
        return a * b;
    }

    public double divide(int a, int b){
        history[count] = a + "/" + b +"=" + (a/b);
        count++;
        return a / b;
    }

    public int powInt(int number, int power){
        history[count] = number + " pow " + power + "=" + (Math.pow(number,power));
        count++;
        return (int) Math.pow(number, power);
    }

    public int getRemainder(int a, int b){
        history[count] = a + "%" + b +"=" + (a%b);
        count++;
        return a % b;
    }

    public void showPartial(){
        for (int i = 0; i < 3; i++) {
            if(history[i] == null){
                continue;
            }
            System.out.println(history[i]);
        }
    }

    public void showHistory(){
        for (int i = 0; i < history.length; i++) {
            if(history[i] == null){
                continue;
            }
            System.out.println(history[i]);
        }
    }

}
