import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Modele extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int x = 2;
    int y = 3;
    int lg;
    int lar;
    int[][] t;
	public double pImmune, pMort, inf;

    public Modele(int lg, int lar){
		this.setBackground(new java.awt.Color(0,0,0));
        this.lg = lg;
		this.lar = lar;
        this.t = new int[lg][lar];
        
        for(int a= 0; a< lg; a++){
            for(int b= 0; b< lar; b++){
                t[a][b] = 0;
            }
        }
	}

	public void vie(){
		int [][]t2 = new int[lg][lar];
		for(int a= 0; a< lg; a++){
			for(int b= 0; b< lar; b++){
				t2[a][b] = 0;
			}
		}
		
		double rand = 0;
		for(int a = 0; a < this.lg; a++){
			for(int b = 0; b < this.lar; b++){
				//rand = Math.random();
				if((a==0 && b == 0)){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a][b+1] == 0) || (rand <= inf/100 && t[a][b+1] == 2)) t2[a][b+1] = 1;
						rand = Math.random();
						if((rand <= inf && t[a+1][b] == 0) || (rand <= inf/100 && t[a+1][b] == 2)) t2[a+1][b] = 1;

						rand = Math.random();
						if(rand <= inf) t2[a][b] = 1;
						else    if(rand > inf && rand <= inf+pImmune) t2[a][b] = 2;
								else    if(rand > inf+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==this.lg-1 && b == 0)){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a][b+1] == 0) || (rand <= inf/100 && t[a][b+1] == 2)) t2[a][b+1] = 1;
						rand = Math.random();
						if((rand <= inf && t[a-1][b] == 0) || (rand <= inf/100 && t[a-1][b] == 2)) t2[a-1][b] = 1;

						rand = Math.random();
						if(rand <= pMort) t2[a][b] = 3;
						else    if(rand > pMort && rand <= pMort+pImmune) t2[a][b] = 2;
								else    if(rand > pMort+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 1;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==0 && b == this.lar-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a][b-1] == 0) || (rand <= inf/100 && t[a][b-1] == 2)) t2[a][b-1] = 1;
						rand = Math.random();
						if((rand <= inf && t[a+1][b] == 0) || (rand <= inf/100 && t[a+1][b] == 2)) t2[a+1][b] = 1;

						rand = Math.random();
						if(rand <= inf) t2[a][b] = 1;
						else    if(rand > inf && rand <= inf+pImmune) t2[a][b] = 2;
								else    if(rand > inf+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==this.lg-1 && b == this.lar-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a][b-1] == 0) || (rand <= inf/100 && t[a][b-1] == 2)) t2[a][b-1] = 1;
						rand = Math.random();
						if((rand <= inf && t[a-1][b] == 0) || (rand <= inf/100 && t[a-1][b] == 2)) t2[a-1][b] = 1;

						rand = Math.random();
						if(rand <= inf) t2[a][b] = 1;
						else    if(rand > inf && rand <= inf+pImmune) t2[a][b] = 2;
								else    if(rand > inf+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==0 || a == this.lg-1) && !(b == 0 || b == this.lar-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a][b+1] == 0) || (rand <= inf/100 && t[a][b+1] == 2)) t2[a][b+1] = 1;
						rand = Math.random();
						if((rand <= inf && t[a][b-1] == 0) || (rand <= inf/100 && t[a][b-1] == 2)) t2[a][b-1] = 1;

						rand = Math.random();
						if(rand <= inf) t2[a][b] = 1;
						else    if(rand > inf && rand <= inf+pImmune) t2[a][b] = 2;
								else    if(rand > inf+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((b == 0 || b == this.lar-1) && !(a==0 || a == this.lg-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a+1][b] == 0) || (rand <= inf/100 && t[a+1][b] == 2)) t2[a+1][b] = 1;
						rand = Math.random();
						if((rand <= inf && t[a-1][b] == 0) || (rand <= inf/100 && t[a-1][b] == 2)) t2[a-1][b] = 1;

						rand = Math.random();
						if(rand <= inf) t2[a][b] = 1;
						else    if(rand > inf && rand <= inf+pImmune) t2[a][b] = 2;
								else    if(rand > inf+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if(a > 0 && a < this.lg-1 && b > 0 && b < this.lar-1){
					if(t[a][b] == 1){
						rand = Math.random();
						if((rand <= inf && t[a+1][b] == 0) || (rand <= inf/100 && t[a+1][b] == 2)) t2[a+1][b] = 1;
						rand = Math.random();
						if((rand <= inf && t[a-1][b] == 0) || (rand <= inf/100 && t[a-1][b] == 2)) t2[a-1][b] = 1;
						rand = Math.random();
						if((rand <= inf && t[a][b+1] == 0) || (rand <= inf/100 && t[a][b+1] == 2)) t2[a][b+1] = 1;
						rand = Math.random();
						if((rand <= inf && t[a][b-1] == 0) || (rand <= inf/100 && t[a][b-1] == 2)) t2[a][b-1] = 1;

						rand = Math.random();
						if(rand <= inf) t2[a][b] = 1;
						else    if(rand > inf && rand <= inf+pImmune) t2[a][b] = 2;
								else    if(rand > inf+pImmune && rand <= pImmune+inf+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}
			}
		}

		for(int a= 0; a< this.lg; a++){
			for(int b= 0; b< this.lar; b++){
				this.t[a][b] = t2[a][b];
			}
		}
	}

	public int[] compteurs(){
		int[] compt = new int[4];
		for(int x = 0; x < 4; x++) compt[x] = 0;

		for(int i = 0; i < this.lg; i++){
			for(int j = 0; j < this.lar; j++){
				compt[this.t[i][j]]++;
			}
		}
		return compt;
	}

    public void paintComponent(Graphics g)
	{
		for(int a= 0 ; a < this.t.length ; a++){
			for(int b= 0 ; b< this.t[0].length ; b++){
				if(a==0 && b==0){
					g.setColor(Color.black) ;
            		g.fillRect(x-5,y-7,25,25);
				}
				if(a==0){
					g.setColor(Color.black) ;
            		g.fillRect(x,y-7,25,25);
				}
				if(b==0){
					g.setColor(Color.black) ;
            		g.fillRect(x-7,y,25,25);
				}
				if(a==this.t.length-1){
					g.setColor(Color.black) ;
            		g.fillRect(x,y+7,25,25);
				}
				if(b==this.t.length){
					g.setColor(Color.black) ;
            		g.fillRect(x+7,y,25,25);
				}
				
				//Cellulle saine
				if(this.t[a][b] == 0){
                    g.setColor(Color.black) ;
                    g.fillRect(x,y,25,25);
                    g.setColor(Color.green);
                    g.fillRect(x,y,17,17);
				}

				//Cellulle infectée
				if(this.t[a][b] == 1){
					g.setColor(Color.black) ;
					g.fillRect(x,y,23,23);
					g.setColor(Color.red);
					g.fillRect(x,y,17,17);	
				}

				//Cellulle immunisée
				if(this.t[a][b] == 2){
                    g.setColor(Color.black) ;
                    g.fillRect(x,y,25,25);
                    g.setColor(Color.cyan);
                    g.fillRect(x,y,17,17);
				}

				//Cellulle personne
				if(this.t[a][b] == 3){
                    g.setColor(Color.black) ;
                    g.fillRect(x,y,25,25);
                    g.setColor(Color.gray);
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