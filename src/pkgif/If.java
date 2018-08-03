package pkgif;

/**
 * @author: Veysel Dogan
 * Date: 03-Aug-2018 
 * Console Application: if 
 * Main Class
 */
public class If {

    public static void main(String[] args) {
        /*
        if(condition)
        statement;
         */
        boolean status = true;
        if (status) {
            System.out.println("Status True");//if the condition is correct, correct writer
        }

        int point = 99;
        char character = '_';
        if (point >= 90) {  //result is greater than 99
            character = 'A';
            System.out.println("Result-" + character);//will write A character
           
        }
         double number = 4;
         if(number!=0){
             if(number>0){
                 System.out.println("Status- " +(1/number));
             }        
             else 
                 System.out.println("Positive number is required");
         }
        
        
        
    }

}
