
package tptrois;


public class Bot extends Personne {
    
    private int niveau;
    public Bot(String n)
    {
    super(n);
    this.niveau = 0;
    }
    public int getniveau()
    {return niveau;}
    public void setniveau(int n)
    {this.niveau=n;}
    
    public String toString(){
    return super.toString()+" "+"ainsi qu'un niveau de"+" "+this.getniveau();
    }
}
    
    
    

