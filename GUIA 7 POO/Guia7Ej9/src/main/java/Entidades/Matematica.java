
package Entidades;

public class Matematica {
    private int num1;
    private int num2;
    private int numMayor;
    private int numMenor;

    public Matematica() {
    }

    public Matematica(int num1, int num2, int numMayor, int numMenor) {
        this.num1 = num1;
        this.num2 = num2;
        this.numMayor = numMayor;
        this.numMenor = numMenor;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNumMayor() {
        return numMayor;
    }

    public void setNumMayor(int numMayor) {
        this.numMayor = numMayor;
    }

    public int getNumMenor() {
        return numMenor;
    }

    public void setNumMenor(int numMenor) {
        this.numMenor = numMenor;
    }
    
    
    
    
}
