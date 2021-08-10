package me.wyq.test.v8u20;

public class CLQOOME {

    /**
     * 现象：a,null,null,....,null,b 有无数个null
     * @param args
     */
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        String a = "a";
        String b = "b";
        queue.offer(a);
        print(queue);
        for (int i = 0; i < 10; i++) {
//            if (i % 1024 == 0) {
                System.out.println("i = " + i);
//                if (hasNull(queue)) {
//                    break;
//                }
//            }
            queue.offer(b);
            print(queue);
            queue.remove(b);
            print(queue);
        }
    }

    private static boolean hasNull(ConcurrentLinkedQueue<String> queue) {
        ConcurrentLinkedQueue.Node<String> h = queue.head.next;
        while (h != null) {
            if (h.item == null) {
                return true;
            }
            h = queue.succ(h);
        }
        return false;
    }

    public static void print(ConcurrentLinkedQueue<String> queue) {
        ConcurrentLinkedQueue.Node<String> h = queue.head;
//        System.out.println(queue.toString());
        StringBuilder builder = new StringBuilder();
        while (h != null) {
//            builder.append("[").append(h.item).append(",").append(h.hashCode()).append("],");
            builder.append(h.item).append(",");
            h = queue.succ(h);
        }
        System.out.println(builder.toString());
    }
}
