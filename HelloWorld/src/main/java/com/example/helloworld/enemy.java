package com.example.helloworld;

public abstract class enemy {
    private String name;
    private int position = 0;

    public enemy(String name)
    {
        this.name = name;
    }

    public String GetName()
    {
        return this.name;
    }

    public void Move()
    {
        position++;
    }

    public abstract void Attack();
}
