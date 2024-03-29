public class Q4_1 {

//∗∗ Computes the winner of the Josephus problem using a circular queue. ∗/
              public static <E> E Josephus(LinkedQueue<E> queue, int k) {
            if (queue.isEmpty( )) return null;
            while (queue.size( ) > 1) {
                 for (int i=0; i < k-1; i++) // skip past k-1 elements
                queue.rotate( );
                E e = queue.dequeue( ); // remove the front element from the collection
                System.out.println(" " + e + " is out");
              }
            return queue.dequeue( ); // the winner
           }
 //∗∗ Builds a circular queue from an array of objects. ∗/
                public static <E>LinkedQueue<E> buildQueue(E a[ ]) {
           LinkedQueue<E> queue = new LinkedQueue<>( );
            for (int i=0; i<a.length; i++)
                queue.enqueue(a[i]);
           return queue;
          }

      //∗∗ Tester method ∗/
                 public static void main(String[ ] args) {
            String[ ] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
             String[ ] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
             String[ ] a3 = {"Mike", "Roberto"};
             System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
             System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
             System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));
            }
}
/*
يوفر هذا الكود دالة Josephus لحل مشكلة جوزيفوس باستخدام قائمة انتظار دائرية.
يمكن استخدام الدالة مع أمثلة مختلفة ومقادير مختلفة لـ k لمعرفة الفائز في كل حالة.
 */


