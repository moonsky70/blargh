/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Student
 */
public abstract class Item
{
    public String getClassName()
    {
        String name = this.getClass().getSimpleName();
        return name;
    }
    public String getFilepath() 
    {
        String filepath = ("file:C:\\Users\\Student\\Desktop\\Weaponry\\" + this.getClass().getSimpleName() + ".png");
        return filepath;
    }
    
}
