package ru.mirea.laba1;

public class Ball {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override

    public String toString()
    {
        return "Ball"+" "+name;
    }
}
