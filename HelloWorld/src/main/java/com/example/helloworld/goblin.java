package com.example.helloworld;

public class goblin extends enemy{
    public goblin(String name)
    {
        super(name);
        System.out.println("Created goblin:" + name);
    }

    @Override
    public void Move()
    {
        super.Move();
        System.out.println("Move");
    }

    @Override
    public void Attack()
    {
        System.out.println("Attack");
    }
}
