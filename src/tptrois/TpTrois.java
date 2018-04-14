
package tptrois;


public class TpTrois {

     
    public static void main(String[] args) {
     
    Bot b1 = new Bot("T1000");
    b1.setniveau(3);
    b1.setArmure(100);
    b1.baisserArmure(50);
    b1.baisserSante(20);
    System.out.println(b1.toString());
    b1.augmenterArmure(10);
    b1.augmenterSante(10);
    System.out.println(b1.toString());
    Arme tabArm[]= new Arme[8];
    tabArm[2]=new Arme("lance roquetteq",75);
    tabArm[3]= new Arme("fusil a pompe",80);
    
        
    
    
    }
    
}
