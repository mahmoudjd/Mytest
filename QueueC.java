package Dat_Alg;

public class QueueC {

    private final int max =10 ;
    private final int [] feld =new int[max];
    private int first ,last ,anzahl;

    public QueueC(){

        first = last = 0;
        anzahl = 0 ;

    }

    public boolean isEmpty() {

        return anzahl == 0 ;

    }

    public boolean istVoll(){

        return anzahl == max;

    }

    public void dequeue() {

        if (anzahl == 0 ) // if (isEmpty())
        {
            System.out.println("Queue ist leer");
        }

        else{
            anzahl --;
            first +=1;
            first %= max ;


        }
    }

    public void enqueue( int x) {

        if(istVoll()) //if (anzahl == max)

            System.out.println("Queue ist voll");

        else {
            feld[last ] = x ;
            anzahl ++;
            last += 1 ;
            last %= max ;

        }

    }

    public int front(){

        if(anzahl == 0 ){
            System.out.println("In der leeren Queue gibt es kein Element...");
            return -1 ;
        }

        else {
            return feld[first];
        }

    }


    public void Print(){

        if (isEmpty()) {
            System.out.println("Queue ist leer ");
        }

        else{

            for(int i = first; i< last; i++){

                System.out.print(feld[i]+" ");

            }
            System.out.println();

        }

    }


    public static void main(String[] args ){

        QueueC q = new QueueC();

        q.enqueue(5);
        q.enqueue(0);
        q.enqueue(3);

        q.Print();

        q.dequeue();
        //q.dequeue();

        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(7);
        q.enqueue(0);

        q.dequeue();
        //q.dequeue();


        q.Print();

        System.out.println("Front ist : "+q.front());
        System.out.println("Anzahl der Elemente ist : " + q.anzahl);

    }

}