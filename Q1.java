public class Q1 {
    public static void main(String[] args) {
        ArrauQueue<Integer> queue = new ArrauQueue<>(6);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.size());
        queue.rotate(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.print(queue);

    }
}
/*
ينشئ الكود قائمة انتظار صفية بسعة 6 عناصر.
يضيف 5 عناصر (10, 20, 30, 40, 50) إلى القائمة.
يدور القائمة بواحد، وبالتالي يحول ترتيب العناصر.
يطبع القيمة false لأن القائمة لم تفرغ، و5 لأن عدد العناصر لم يتغير، ثم يطبع عناصر القائمة.
 */