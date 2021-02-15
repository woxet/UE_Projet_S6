import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Modele extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int x = 5;
    int y = 5;
    int size;
    int[][] t;

    public Modele(int size){
        this.size = size;
        this.t = new int[size][size];
        
        for(int a= 0; a< size; a++){
            for(int b= 0; b< size; b++){
                t[a][b] = 0;
            }
        }
        //Grenouille
		t[10][8] = 1 ;
		t[10][9] = 1 ;
		t[10][10] = 1 ;
	}

	public void vie(){
		int voisin = 0;
		int [][]t2 = new int[size][size];
		for(int a = 0; a < this.size; a++){
			for(int b = 0; b < this.size; b++){
				//Coin haut gauche
				if(a == 0 && b == 0){
					for(int k =  0 ; k < 2 ;  k ++) {
						for(int h = 0 ; h < 2 ; h ++){
							if(t[k][h] == 1 ){
								voisin++ ;
							}
							if(t[k][h] == 1 && k == 0 && h == 0){
								voisin = voisin - 1 ;
							}
							
						}
					}
				}

				//Coin bas gauche
				if(a == 0 && b == this.size-1){
					for(int k = 0 ; k < 1 ; k ++ ){
						for(int h = this.size-2 ; h < this.size ; h++){
							if(t[k][h] == 1 ){
								voisin ++ ;
							}
							if(t[k][h] == 1 && h == 0 && k == this.size-2){
								voisin --  ;
							}
						}
					}
				}
				
				//Coin haut droit
				if(a == this.size-1 && b == 0){
					for(int k = this.size-2 ; k < this.size ; k ++ ){
						for(int h = 0 ; h < 2 ; h++){
							if(t[k][h] == 1 ){
								voisin ++ ;
							}
							if(t[k][h] == 1 && h == 0  && k == this.size-1)
							{
								voisin -- ;
							}							
						}
					}
				}

				//Coin bas droit
				if(a == this.size-1 && b == this.size-1){
					for(int k = this.size-2 ; k < this.size ; k ++ ){
						for(int h = this.size-2 ; h < this.size ; h++){
							if(t[k][h] == 1 ){
								voisin ++ ;
							}
							
							if(t[k][h] == 1 && h == this.size-1 && k == this.size-1){
								voisin  -- ;
							}
							
						}
					}
				}

				//colonne gauche
				if(a == 0 && b > 0 && b < this.size-1){
					for(int k = 0 ; k < 2 ; k++){
						for(int h = b-1 ; h < b+2 ; h++){
							if(t[k][h] == 1 ){
								voisin ++ ;
							}
							if(t[k][h] == 1  && k == a && h == b){
								voisin = voisin-1;
							}							
						}
					}
				}
				
				//colonne droite
				if(a == this.size-1 && b > 0 && b < this.size-1){
					for(int k = this.size-2 ; k < this.size ; k++){
						for(int h = a-1 ; h < b+2 ; h++ ){
							if(t[k][h] == 1 ){
								voisin ++ ;
							}
							if(t[k][h] == 1 && h == a  && k == b){
								voisin-- ;
							}
						}
					}
				}
				
				//ligne haut
				if(b ==  0 && a > 0 && a < this.size-1){
					for(int k = a-1 ; k < a+2 ; k++){
						for(int h =  0 ; h < 2 ; h++ ){
							if(t[k][h] == 1 ){
								voisin ++ ;
							}
							if(t[k][h] == 1 && h == a  && k == b){
								voisin-- ;
							}
						}
					}
				}
				
				//ligne bas
				if(b == this.size-1 && a > 0 && a < this.size-1){
					for(int k = a-1 ; k < a+2 ; k ++){
						for(int h = this.size-2 ; h < this.size ; h++){
							if(t[k][h] == 1 ){
								voisin++ ;
							}
							if(t[k][h] == 1 && h != a  && k != b){
								voisin--;
							}
						}
					}
				}

				//centre de la grille
				if(a > 0 && a < this.size-1 && b > 0 && b < this.size-1){
					for(int c = a-1; c <= a+1; c++){
						for(int d = b-1; d <= b+1; d++){
							if(this.t[c][d] == 1){
								voisin++;
							}
							if(this.t[c][d] == 1 && c == a && b == d){
								voisin--;
							}
						}
					}
				}

				switch(voisin){
					case 3 : t2[a][b] = 1 ;
					break ;
					case 2 : t2[a][b] = this.t[a][b] ;
					break ;
					default : t2[a][b] = 0  ;
				}
				voisin = 0;
			}
		}
		for(int a= 0; a< this.size-1; a++){
			for(int b= 0; b< this.size-1; b++){
				this.t[a][b] = t2[a][b];
			}
		}
	}

    public void paintComponent(Graphics g)
	{
		for(int a= 0 ; a < this.t.length ; a++){
			for(int b= 0 ; b< this.t[0].length ; b++){
				if(this.t[a][b] == 0){
                    //g.setColor(Color.black) ;
                    //g.fillRect(x,y,30,30);
                    g.setColor(Color.green);
                    g.fillRect(x,y,17,17);
				}
				if(this.t[a][b] == 1){
					//g.setColor(Color.black) ;
					//g.fillRect(x,y,30,30);
					g.setColor(Color.red);
					g.fillRect(x,y,17,17);	
				}
				x = x + 20;
			}
			x = 5 ;
			y = y + 20 ;
		}
		x = y = 5 ;
	}
}