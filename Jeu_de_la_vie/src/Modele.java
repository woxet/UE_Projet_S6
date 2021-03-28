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
    int size;
    int[][] t;

    public Modele(int size){
		this.setBackground(new java.awt.Color(0,0,0));
        this.size = size;
        this.t = new int[size][size];
        
        for(int a= 0; a< size; a++){
            for(int b= 0; b< size; b++){
                t[a][b] = 0;
            }
        }
	}

	public void vie(){
		int [][]t2 = new int[size][size];
		for(int a= 0; a< size; a++){
			for(int b= 0; b< size; b++){
				t2[a][b] = 0;
			}
		}
		
		double rand = 0, pImmune = 0.15, pMort = 0.05, npChange = 0.8;
		for(int a = 0; a < this.size; a++){
			for(int b = 0; b < this.size; b++){
				//rand = Math.random();
				if((a==0 && b == 0)){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a][b+1] == 0) t2[a][b+1] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a+1][b] == 0) t2[a+1][b] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==this.size-1 && b == 0)){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a][b+1] == 0) t2[a][b+1] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a-1][b] == 0) t2[a-1][b] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==0 && b == this.size-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a][b-1] == 0) t2[a][b-1] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a+1][b] == 0) t2[a+1][b] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==this.size-1 && b == this.size-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a][b-1] == 0) t2[a][b-1] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a-1][b] == 0) t2[a-1][b] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((a==0 || a == this.size-1) && !(b == 0 || b == this.size-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a][b+1] == 0) t2[a][b+1] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a][b-1] == 0) t2[a][b-1] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if((b == 0 || b == this.size-1) && !(a==0 || a == this.size-1)){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a+1][b] == 0) t2[a+1][b] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a-1][b] == 0) t2[a-1][b] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}

				if(a > 0 && a < this.size-1 && b > 0 && b < this.size-1){
					if(t[a][b] == 1){
						rand = Math.random();
						if(rand <= 0.30 && t[a+1][b] == 0) t2[a+1][b] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a-1][b] == 0) t2[a-1][b] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a][b+1] == 0) t2[a][b+1] = 1;
						rand = Math.random();
						if(rand <= 0.30 && t[a][b-1] == 0) t2[a][b-1] = 1;

						rand = Math.random();
						if(rand <= npChange) t2[a][b] = 1;
						else    if(rand > npChange && rand <= npChange+pImmune) t2[a][b] = 2;
								else    if(rand > npChange+pImmune && rand <= pImmune+npChange+pMort) t2[a][b] = 3;
					}
					else if(t2[a][b] == 0) t2[a][b] = t[a][b];			
				}
			}
		}

		for(int a= 0; a< this.size; a++){
			for(int b= 0; b< this.size; b++){
				this.t[a][b] = t2[a][b];
			}
		}
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