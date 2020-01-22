package tictactoe;

import java.util.HashMap;

public class Map 
{
    private HashMap<String, Point> grille = new HashMap<String, Point>();
    public Map(int taille) 
    {
        for (int j = 0; j < taille; j++)
        {
            for (int i = 0; i < taille; i++)
            {
            	Point p = new Point(i,j);
                grille.put(p.MytoString(), p);
            }
        }
    }

    public void GetGrille()
    {
        System.out.println(grille.keySet());
    }
    public void AfficherMap(int taille)
    {
        for (int j = 0; j < taille; j++)
        {
            for (int i = 0; i < taille; i++)
            {
            	Point point = new Point(j,i);
                System.out.print(grille.get(point.MytoString()).Getvalue()); 
            }
            System.out.println();
        }
    }

    public void SetPoint(int x, int y, int b)
    {
    	grille.get("(" + x + ";" + y + ")").SetValue(b);
    }
    public int GVP(int x, int y)
    {
    	return grille.get("(" + x + ";" + y + ")").Getvalue();
    }
}
