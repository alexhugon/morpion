package tictactoe;

public class Point 
{
    private int x, y;
    private int value;

    public Point(int x, int y) 
    {
        this.x = x;
        this.y = y;
        this.value = 0;
    }

    public int GetX() 
    {
        return x;
    }

    public int GetY()
    {
        return y;
    }
    public int Getvalue()
    {
        return value;
    }
    public void SetValue(int z)
    {
    	this.value = z;
    }

    public String MytoString() { 
        return "(" + GetX() + ";" + GetY() + ")"; 
    } 
}
