package com.test.work;

/**
 * @author Shibo
 * @date 2021/12/10
 * @apiNote
 */
public class tank extends Weapon implements Attackable,Moveable{
    @Override
    public void Attack() {
            System.out.println("坦克攻击");
    }

    @Override
    public void move() {
            System.out.println("坦克移动");

    }
}
