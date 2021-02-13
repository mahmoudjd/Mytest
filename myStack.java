package Dat_Alg;

import utilities.TastaturEingabe;

public class myStack {


        private final int[] feld = new int[100];	// Array zum Anlegen des Stack

        private int index;					// Index, der auf den naechsten freien Kellerplatz zeigt



        public myStack() {

            this.index = 0;		// leerer Stack

        }


        public void push (int elem)
        {

            if(this.index == feld.length)
            {
               System.out.println("die Stack ist voll");
                // ... Stack ist voll
            }
            else
            {
                feld[index++]= elem;
              //  index++ ;
            }
        }

        public void pop()
        {

            if( index == 0 )
            {
                System.out.println("Die Stack ist leer");
                // ... Stack ist leer
            }

            index--;

            // Das Element wird nicht geloescht,
            //lediglich der Platz im Array wird als frei markiert

        }


        public int top()
        {
            if(index == 0 )
            {
                System.out.println("Die Stack ist leer ! ");

                // ... Stack ist leer
            }

            return feld[index-1];


            /*
             *  da Index auf die naechste freie Stelle zeigt,
             *  muss der Wert an der Stelle index-1 ausgegeben werden
             * */

        }

        public void show()
        {

			if(this.index == 0) {
                System.out.println("Leer");
            }

			for (int i = 0 ; i < index; i++){
			    System.out.println(feld[i]);
			}

        }


        public static void main(String[] args)
        {
            myStack stack = new myStack();

            boolean doneFlag = false;

            while(!doneFlag)
            {
                System.out.println("\nBitte waehlen Sie...");
                System.out.println("1 Zahl auf Stack ablegen");
                System.out.println("2 obersten Wert lesen");
                System.out.println("3 Zahl von Stack loeschen");
                System.out.println("4 Kompletten Stack anzeigen");
                System.out.println("jede andere Eingabe beendet das Programm\n");

                int i = TastaturEingabe.readInt("Bitte Zahl eingeben: ");

                switch(i)
                {
                    case 1:
                    {
                        i = TastaturEingabe.readInt("Bitte Stack-Wert eingeben:");
                        stack.push(i);
                        break;
                    }
                    case 2:
                    {
                        if (stack.top()!=0)
                            System.out.println("Die oberste Zahl ist: " + stack.top());
                        break;
                    }
                    case 3:
                    {
                        if (stack.top()!=0)
                        {
                            System.out.println("Die oberste Zahl " + stack.top()+ " wird geloescht.");
                            stack.pop();
                        }
                        break;
                    }
                    case 4:
                    {
                        if (stack.top()!=0)
                        {
                            System.out.println("gesamter Stackinhalt: ");
                            stack.show();
                        }
                        break;
                    }
                    default:
                    {
                        doneFlag = true;
                    }
                }
            }

        }

}
