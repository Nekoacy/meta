package com.test.work;

/**
 * @author Shibo
 * @date 2021/12/10
 * @apiNote
 */
public class mai {
    public static void main(String[] args) {
        Army army=new Army(1);
        Weapon weapon1=new tank();
        try {
            army.addWeapon(weapon1);
        } catch (WeaponAddExpection weaponAddExpection) {
            System.out.println(weaponAddExpection.getMessage());
        }
    }
}
