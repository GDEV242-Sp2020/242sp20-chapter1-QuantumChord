/**
 * @Author Joseph McGuane
 * @version 2020.02.2
 * Picture is meant to represent two people on a hill during the day. One has
 * a hat on and the other doesn't. The sun is up but you can see the moon.
 */
public class Picture
{
    private Square sky;
    private Square hat;
    private Triangle hill;
    private Circle sun;
    private Circle moon;
    private Person person1;
    private Person person2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        hat = new Square();
        hill = new Triangle();  
        sun = new Circle();
        moon = new Circle();
        person1 = new Person();
        person2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-350);
            sky.moveVertical(-250);
            sky.changeSize(600);
            sky.changeColor("blue");
            sky.makeVisible();
    
            hill.changeSize(170, 450);
            hill.moveHorizontal(40);
            hill.moveVertical(0);
            hill.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            moon.changeColor("white");
            moon.moveHorizontal(20);
            moon.moveVertical(-40);
            moon.changeSize(20);
            moon.makeVisible();
            
            person1.changeColor("black");
            person1.moveHorizontal(0);
            person1.moveVertical(40);
            person1.makeVisible();
            
            hat.changeColor("red");
            hat.moveHorizontal(-90);
            hat.moveVertical(47);
            hat.changeSize(20);
            hat.makeVisible();
            
            person2.changeColor("black");
            person2.moveHorizontal(-50);
            person2.moveVertical(15);
            person2.makeVisible();
            drawn = true;
        }
    }
}
