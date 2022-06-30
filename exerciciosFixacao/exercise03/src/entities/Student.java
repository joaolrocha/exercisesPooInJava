package entities;

public class Student {
    public String name;
    public double av1;
    public double av2;
    public double av3;


    public double notaFinal () {
        return (av1 + av2 + av3);
    }
}
