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

		//this.setSize(new java.awt.Dimension(785, 559));
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
		for(int a= 0 ; a < this.lg ; a++){
			for(int b= 0 ; b< this.lar ; b++){
				if(a==0 && b==0){
					g.setColor(Color.black) ;
            		g.fillRect(x-5,y-7,785/this.lg,559/this.lar);
				}
				if(a==0){
					g.setColor(Color.black) ;
            		g.fillRect(x,y-7,785/this.lg,559/this.lar);
				}
				if(b==0){
					g.setColor(Color.black) ;
            		g.fillRect(x-7,y,785/this.lg,559/this.lar);
				}
				if(a==this.lg-1){
					g.setColor(Color.black) ;
            		g.fillRect(x,y+7,785/this.lg,559/this.lar);
				}
				if(b==this.lar){
					g.setColor(Color.black) ;
            		g.fillRect(x+7,y,785/this.lg,559/this.lar);
				}
				
				//Cellulle saine
				if(this.t[a][b] == 0){
                    g.setColor(Color.black) ;
                    g.fillRect(x,y,785/this.lg,559/this.lar);
                    g.setColor(Color.green);
                    g.fillRect(x+2,y+2,(785/this.lg)-6,(559/this.lar)-6);
				}

				//Cellulle infectée
				if(this.t[a][b] == 1){
					g.setColor(Color.black) ;
					g.fillRect(x,y,785/this.lg,559/this.lar);
					g.setColor(Color.red);
                    g.fillRect(x+2,y+2,(785/this.lg)-6,(559/this.lar)-6);
				}

				//Cellulle immunisée
				if(this.t[a][b] == 2){
                    g.setColor(Color.black) ;
                    g.fillRect(x,y,785/this.lg,559/this.lar);
                    g.setColor(Color.cyan);
                    g.fillRect(x+2,y+2,(785/this.lg)-6,(559/this.lar)-6);
				}

				//Cellulle personne
				if(this.t[a][b] == 3){
                    g.setColor(Color.black) ;
                    g.fillRect(x,y,785/this.lg,559/this.lar);
                    g.setColor(Color.gray);
                    g.fillRect(x+2,y+2,(785/this.lg)-6,(559/this.lar)-6);
				}
				x = x + 785/this.lg;
			}
			x = 5 ;
			y = y + 559/this.lar ;
		}
		x = y = 5 ;
	}
	
}