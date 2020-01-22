package tictactoe;

import java.util.Scanner;

public class Jeu 
{
	public static boolean verifvictoire( Map grille)
	{
		if( (grille.GVP(0,0) != 0) && grille.GVP(0,0) == grille.GVP(1,1) && grille.GVP(1,1) == grille.GVP(2,2))
		{
			System.out.println("Joueur " + grille.GVP(0,0) + " à gagner" );
			return false;
		}
		if( (grille.GVP(1,1) != 0) && grille.GVP(0,2) == grille.GVP(1,1) && grille.GVP(1,1) == grille.GVP(2,0))
		{
			System.out.println("Joueur " + grille.GVP(0,0) + " à gagner" );
			return false;
		}

	    for(int i = 0; i < 3; i++)
	    {
	    	if(grille.GVP(i,0) != 0 && grille.GVP(i,0) == grille.GVP(i,1) && grille.GVP(i,1) == grille.GVP(i,2))
	    	{
	    		System.out.println("Joueur " + grille.GVP(i,0) + " à gagner" );
	    		return false;
	    	}
	    }
	    for(int j = 0; j < 3; j++)
	    {
	    	if(grille.GVP(0,j) != 0 && grille.GVP(0,j) == grille.GVP(1,j) && grille.GVP(1,j) == grille.GVP(2,j))
	    	{
	    		System.out.println("Joueur " + grille.GVP(0,j) + " à gagner" );
	    		return false;
	    	}
	    }
		return true;
	}


	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        Map grille = new Map(3);
        grille.GetGrille();
        grille.AfficherMap(3);
        // game loop
        while (verifvictoire(grille)) 
        {
            int or = in.nextInt();
            int oc = in.nextInt();
            grille.SetPoint(or, oc, 2);
            grille.GetGrille();
            grille.AfficherMap(3);
            if(verifvictoire(grille))
            {
	            int ur = in.nextInt();
	            int uc = in.nextInt();
	            grille.SetPoint(ur, uc, 1);
	            grille.GetGrille();
	            grille.AfficherMap(3);
            }
            
         }
     }
}
static int  minmax(Grille plateauactuel , int profondeur)
{
	if(partiefini() || profondeur == 0)
	  return eval(plateauactuel);
	else
		int score = 0;
		for (int i = 1; i <= profondeur; i++)
			Case caseajoué = caselibrenuméroI(plateauactuel, i);
			score = score + minmax(grille.ajoutercase(caseajoué), profondeur -1);
		return score;
		
		
}
static Case caselibrenuméroI(Grille plateauactuel, int i)
{
	compteur = 1
	for k = 0; k < 3; k++
			for l = 0 ; l< 3; l++
					if plateauactuuel[k][l] == 0
						if compteur = i
							return plateauactuuel[k][l]
						else compteur ++;
					
}










