package Week_01;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author xingchen.lin
 * @desc
 * @time 2020/4/18 4:36 下午.
 */
public class ChangeDeque {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);

        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);



        Deque<String> changedDeque = new LinkedList<>();
        changedDeque.addFirst("a");
        changedDeque.addFirst("b");
        changedDeque.addFirst("c");
        System.out.println(changedDeque);

        str = changedDeque.peekFirst();
        System.out.println(str);
        System.out.println(changedDeque);

        while (changedDeque.size() > 0) {
            System.out.println(changedDeque.pollFirst());
        }
        System.out.println(changedDeque);

    }

}
