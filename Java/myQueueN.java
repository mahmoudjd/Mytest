package Dat_Alg;

import utilities.TastaturEingabe;
    /*
    eine Queue wird mit Hilfe eines Array implementiert, wobei das Array zirkulaer genutzt wird,
    d.h. sowohl der Anfang als auch das Ende der Queue wandern durch das Array. Dazu werden
    die Positionen des Anfangs und des Endes in Attributen gehalten. Liegen Anfang und Ende
    auf der gleichen Position im Array, so kann die Queue entweder voll oder leer sein, deshalb
    gibt es ein weiteres Attribut, das die Anzahl der Elemente beinhaltet und damit genutzt werden
    kann, um zu ueberpruefen, ob die Queue voll ist.
    */
    public class myQueueN {
        final int max = 5;
        int[] feld = new int[max];	// Schlange fuer max Zahlen erzeugen
        int first , last ;			    // "Indexzeiger" auf das erste bzw letzte Element
        int anzahl;					// AnzahlElemente-Zaehler

        myQueueN()               // Konstruktor
        {
            first = 0;			// erstes Element an Pos. 0
            last = 0;			// letztes Element an Pos. 0
            anzahl = 0;
        }

        boolean istLeer()
        {
            return ( first == -1 && last == -1 || anzahl == 0);

        }

        boolean istVoll()
        {
            return anzahl == max ||(last+1)% feld.length== first;
            // first == last+1;

        }

        public int front()
        {
            if ( istLeer() )
               first= last =  -1;

            return feld[first];
        }


        public void enqueue(int elem)
        {
           if ( istVoll()){
               throw new IllegalArgumentException("Die List ist Voll");
           }
           else if(istLeer()){
               first = last = 0;
           }
           else {
               last = (last + 1) % feld.length;
           }

           feld[last] =elem;
           anzahl++;
        }


        public void dequeue()
        {
            if(istLeer()){
                throw new IllegalArgumentException("Die Liste ist leer !");
            }
            else if (first == last ){
                first = last = -1;
                anzahl =0;
            }
            else {
                first++;
                anzahl --;
            }
        }

        public void show()
        {
            if(istLeer()){
                System.out.println("Die List ist Leer");
            }
            else if( first == last){
                System.out.println(feld[first]);
            }
            else if(first > last) {
                int f =first ;
                int l = last;
                f-=first;
                l-=first;
                for(int i = f; i<= l; i++){
                    System.out.print(feld[i]+" ");
                }
            }
            else{
                for ( int i= first ; i<= last; i++){
                    System.out.print(feld[i]+" ");
                }
            }


        }


        public static void main(String[] args)
        {
            myQueueN queue = new myQueueN();

            boolean doneFlag = false;

            while(!doneFlag)
            {
                System.out.println("\n1 Zahl in Queue ablegen");
                System.out.println("2 Zahl aus Queue holen");
                System.out.println("3 gesamte Queue anzeigen");
                System.out.println("4 front von Queue anzeigen");
                System.out.println("5 Ergebnis ,ob leere Queue ist, anzeigen");
                System.out.println("6 Ergebnis ,ob Queue voll ist, anzeigen");
                System.out.println("7 Ergebnis ,ob Queue voll ist, anzeigen");

                System.out.println("jede andere Eingabe beendet das Programm\n");

                int i = TastaturEingabe.readInt("\nBitte waehlen Sie: ");

                switch (i) {
                    case 1:
                        i = TastaturEingabe.readInt("Bitte einen int-Wert eingeben: ");
                        queue.enqueue(i);
                        break;

                    case 2 :
                        queue.dequeue();
                        break;

                    case 3 :
                        queue.show();
                        break;

                    case 4:
                        System.out.println(queue.front());
                        break;
                    case 5 :
                        System.out.println(queue.istLeer());
                        break;
                    case 6 :
                        System.out.println(queue.istVoll());
                        break;
                    case 7 :
                        System.out.println("Die anzahl der Elemente:" + queue.anzahl);
                        break;
                    default :
                        doneFlag = true;

                }
            }
        }



    }
