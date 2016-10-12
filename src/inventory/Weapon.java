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
public abstract class Weapon extends InventoryItem
{
    private int grade;
    private String gradeString;
    public String getGrade()
    {
        return translateGradeEnch(grade, "Lesser", "Greater", "Legendary");
    }
    public void setGrade(int gradeInput)
    {
        grade = gradeInput;
    }
    private int enchantment;
    private String enchantString;
    public String translateGradeEnch(int grade, String level1, String level2, String level3)
    {
        String enchantmentString;
        switch (grade) 
        {
            case 1:
            {
                enchantmentString = level1;
                break;
            }
            case 2:
            {
                enchantmentString = level2;
                break;
            }
            case 3:
            {
                enchantmentString = level3;
                break;
            }
            default:
                enchantmentString = "Average";
        }
        return enchantmentString;
    }
    public String getEnchantment()
    {
        return enchantString;
    }
    public void setEnchant(int enchantInput)
    {
         enchantString = translateGradeEnch(enchantInput, "Enhanced", "Enchanted", "Skillfully Enchanted");
    }
    public Weapon()
    {
        
    }
    public Weapon(int gradeInput, int enchantInput, String nameInput)
    {
        setGrade(gradeInput);
        setEnchant(enchantInput);
    }
}
