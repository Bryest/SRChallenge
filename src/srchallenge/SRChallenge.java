package srchallenge;
public class SRChallenge {
    static void SenText(String label,String selectorType,String selector,String stringValue){
        //Send Data
         System.out.println("Send:"+ stringValue);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        SenText("myName","name","user-submit-name","John");
        SenText("myEmail","email","user-submit-email","john@doe.com");
        SenText("myProductTitle","productTitle","user-submit-productTitle","Prisma");
        SenText("myProductUrl","productUrl","user-submit-productUrl","http://prisma.com");
        SenText("myDescription","description","user-submit-description","Its an AI that turns your photos into artwork in seconds");
    } 
}