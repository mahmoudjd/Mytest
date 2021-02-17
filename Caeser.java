package CaesarCodierung;


public class Caesar {

    private int a ;
     Caesar (int a){
         if (a <= 26 && a >= -26)
             this.a = a;
     }

     public char codiere( char c){
       
         /* Andere Methode umzu schreiben
         if( (int)c +a > 122  )
             return (char)((int)c+this.a -26) ;
         if ((int)c +a < 97 )
             return (char) ((int)c +this.a + 26);
         else
             return (char)( this.a +(int)c );
          */
         
         //Kleine Buchstaben
         if ((int)c >=97 && (int)c <= 122) {
             if ((int) c + this.a > 122)
                 return c += a - 26;
             if ((int) c + this.a < 97)
                 return c += a + 26;
             else
                 return c += a;
         }
         //Größe Buchstaben
         if((int)c <= 90 && (int)c >= 65){
             if ((int) c + this.a > 90)
                 return c += a - 26;
             if ((int) c + this.a < 65)
                 return c += a + 26;
             else
                 return c += a;
         }
         //Andere Zeichen
         return c ;
     }

     public static void main(String[] args){
         
         Caesar s = new Caesar(2);
         
         String m = TastaturEingabe.readString("Gib deinen Satz ein , um zu codieren : ");
         
         for (int i = 0 ; i < m.length(); i++) {
           
            char x = m.charAt(i);
           
            System.out.print(s.codiere(x) );
        
         }

     }
}

