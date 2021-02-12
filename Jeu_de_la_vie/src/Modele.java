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
        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                t[i][j] = 0;
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
		for(int a = 1; a < 29; a++){
			for(int b = 1; b < 29; b++){
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
				switch(voisin){
					case 3 : t2[a][b] = 1 ;
					break ;
					case 2 : t2[a][b] = t[a][b] ;
					break ;
					default : t2[a][b] = 0  ;
				}
				voisin = 0;
			}
		}
		for(int i = 0; i < size-1; i++){
			for(int j = 0; j < size-1; j++){
				this.t[i][j] = t2[i][j];
			}
		}
	}

    public void paintComponent(Graphics g)
	{
		for(int i = 0 ; i< this.t.length ; i ++){
			for(int j = 0 ; j < this.t[0].length ; j++){
				if(this.t[i][j] == 0){
                    //g.setColor(Color.black) ;
                    //g.fillRect(x,y,30,30);
                    g.setColor(Color.green);
                    g.fillRect(x,y,17,17);
				}
				if(this.t[i][j] == 1){
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