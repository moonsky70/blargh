/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author Student
 */
public class Spear extends Weapon
{
    public Spear() {
        
    }
    public Spear(int gradeInput, int enchantInput, String nameInput)
    {
        setGrade(gradeInput);
        setEnchant(enchantInput);
    }
}
