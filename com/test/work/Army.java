package com.test.work;

/**
 * @author Shibo
 * @date 2021/12/10
 * @apiNote
 */
public class Army {
    private Weapon[] w;

    public Army(int count) {
        w=new Weapon[count];
    }
    public void attackAll(){
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof Attackable) {
                Attackable attackable = (Attackable) w[i];
                attackable.Attack();
            }
        }
    }
    public void addWeapon(Weapon weapon) throws WeaponAddExpection {
        for (int i = 0; i < w.length; i++) {
            if (w[i]==null){
                w[i]=weapon;
            }
            throw new WeaponAddExpection("武器以加满！");
        }
    }
    public void moveAll(){
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof Moveable) {
                Moveable moveable = (Moveable) w[i];
                moveable.move();
            }
        }
    }
}
