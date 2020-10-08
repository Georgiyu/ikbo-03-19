package prac7;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите способ хранения данных \n 1) Stack \n 2) Queue \n 3) Deque \n 4) DoubleList \n");
        int m = in.nextInt();
        int f;

        switch (m) {
            case(1):
            Stack stack = new Stack(5);
            Stack stack2 = new Stack(5);
            Integer[] arr = new Integer[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            Collections.shuffle(Arrays.asList(arr));
            for (int i = 0; i < arr.length / 2; i++) {
                stack.push(arr[i]);
            }
            stack.show_stack();
            for (int i = 5; i < arr.length; i++) {
                stack2.push(arr[i]);
            }
            stack2.show_stack();
            int r = 0;
            int schetchik = 0;
            while ((stack.top != 10) && (stack2.top != 10)) {
                if ((stack.get_element() == 9) && (stack2.get_element() == 0)) {
                    stack2.push(stack2.get_element());
                    stack2.push(stack.get_element());
                    stack.delete_first_element();
                    stack2.delete_first_element();
                    stack.top--;
                    stack2.top--;
                    r++;
                    schetchik++;
                }
                if ((stack.get_element() == 0) && (stack2.get_element() == 9)) {
                    stack.push(stack.get_element());
                    stack.push(stack2.get_element());
                    stack2.delete_first_element();
                    stack.delete_first_element();
                    stack.top--;
                    stack2.top--;
                    r++;
                    schetchik++;
                }
                if ((stack.get_element() < stack2.get_element()) && (r == 0)) {
                    stack2.push(stack2.get_element());
                    stack2.push(stack.get_element());
                    stack.delete_first_element();
                    stack2.delete_first_element();
                    stack.top--;
                    stack2.top--;
                    schetchik++;
                } else {
                    if (stack.get_element() > stack2.get_element() && (r == 0)) {
                        stack.push(stack.get_element());
                        stack.push(stack2.get_element());
                        stack2.delete_first_element();
                        stack.delete_first_element();
                        stack.top--;
                        stack2.top--;
                        schetchik++;
                    }
                }
                r = 0;
                if (schetchik == 106) {
                    System.out.print("botva");
                    System.exit(0);
                }
            }
            if (stack.top == 10) {
                System.out.print("second " + schetchik);
                System.exit(0);
            }
            if (stack2.top == 10) {
                System.out.print("first " + schetchik);
                System.exit(0);
            }

            case(2):
                Queue queue1 = new LinkedList();
                Queue queue2 = new LinkedList();
                Integer[] arr1 = new Integer[10];
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = i;
                }
                Collections.shuffle(Arrays.asList(arr1));
                for (int i = 0; i < arr1.length / 2; i++) {
                    queue1.add(arr1[i]);
                }
                System.out.println(queue1);
                for (int i = 5; i < arr1.length ; i++) {
                    queue2.add(arr1[i]);
                }
                System.out.println(queue2);
                int rl = 0;
                int schetchik1 = 0;
                while (!(queue1.isEmpty())&&!(queue2.isEmpty())) {
                    if (((int)queue1.peek
                            () == 9) && ((int)queue2.peek() == 0)) {
                        queue2.add(queue2.peek());
                        queue2.add(queue1.peek());
                        queue1.poll();
                        queue2.poll();
                        schetchik1++;
                        rl++;
                    }
                    if (((int)queue1.peek() == 0) && ((int)queue2.peek() == 9)) {
                        queue1.add(queue1.peek());
                        queue1.add(queue2.peek());
                        queue1.poll();
                        queue2.poll();
                        schetchik1++;
                        rl++;
                    }
                    if (((int)queue1.peek() < (int)queue2.peek()) && (rl == 0)) {
                        queue2.add(queue2.peek());
                        queue2.add(queue1.peek());
                        queue1.poll();
                        queue2.poll();
                        schetchik1++;
                        rl++;
                    }
                    else {
                        if (((int)queue1.peek() > (int)queue2.peek()) && (rl == 0)) {
                            queue1.add(queue1.peek());
                            queue1.add(queue2.peek());
                            queue1.poll();
                            queue2.poll();
                            schetchik1++;
                            rl++;
                        }
                    }
                    rl = 0;
                    if (schetchik1 == 106) {
                        System.out.print("botva");
                        System.exit(0);
                    }
                }
                if (queue1.peek() == null) {
                    System.out.print("second " + schetchik1);
                    System.exit(0);
                }
                if (queue2.peek() == null) {
                    System.out.print("first " + schetchik1);
                    System.exit(0);
                }
            case(3):
                Deque deque1 = new ArrayDeque();
                Deque deque2 = new ArrayDeque();
                Integer[] arr2 = new Integer[10];
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = i;
                }
                Collections.shuffle(Arrays.asList(arr2));
                for (int i = 0; i < arr2.length / 2; i++) {
                    deque1.add(arr2[i]);
                }
                System.out.println(deque1);
                for (int i = 5; i < arr2.length ; i++) {
                    deque2.add(arr2[i]);
                }
                System.out.println(deque2);
                int rlm = 0;
                int schetchik2 = 0;
                while (!(deque1.isEmpty())&&!(deque2.isEmpty())) {
                    if (((int)deque1.peekFirst() == 9) && ((int)deque2.peekFirst() == 0)) {
                        deque2.add(deque2.peekFirst());
                        deque2.add(deque1.peekFirst());
                        deque1.poll();
                        deque2.poll();
                        schetchik2++;
                        rlm++;
                    }
                    if (((int)deque1.peekFirst() == 0) && ((int)deque2.peekFirst() == 9)) {
                        deque1.add(deque1.peekFirst());
                        deque1.add(deque2.peekFirst());
                        deque1.poll();
                        deque2.poll();
                        schetchik2++;
                        rlm++;
                    }
                    if (((int)deque1.peekFirst() < (int)deque2.peekFirst()) && (rlm == 0)) {
                        deque2.add(deque2.peekFirst());
                        deque2.add(deque1.peekFirst());
                        deque1.poll();
                        deque2.poll();
                        schetchik2++;
                        rlm++;
                    }
                    else {
                        if (((int)deque1.peekFirst() > (int)deque2.peekFirst()) && (rlm == 0)) {
                            deque1.add(deque1.peekFirst());
                            deque1.add(deque2.peekFirst());
                            deque1.poll();
                            deque2.poll();
                            schetchik2++;
                            rlm++;
                        }
                    }
                    rlm = 0;
                    if (schetchik2 == 106) {
                        System.out.print("botva");
                        System.exit(0);
                    }
                }
                if (deque1.peek() == null) {
                    System.out.print("second " + schetchik2);
                    System.exit(0);
                }
                if (deque2.peek() == null) {
                    System.out.print("first " + schetchik2);
                    System.exit(0);
                }
            case(4):
                List<Double> list1 = new ArrayList<Double>();
                List<Double> list2 = new ArrayList<Double>();
                Double[] arr3 = new Double[10];

                for (double i = 0; i < arr3.length; i++) {
                    f=(int)i;
                    arr3[f] = i;
                }
                Collections.shuffle(Arrays.asList(arr3));
                for (int i = 0; i < arr3.length / 2; i++) {
                    list1.add(arr3[i]);
                }
                System.out.println(list1);
                for (int i = 5; i < arr3.length ; i++) {
                    list2.add(arr3[i]);
                }
                System.out.println(list2);
                int rlms = 0;
                int schetchik3 = 0;
                while (!(list1.isEmpty())&&!(list1.isEmpty())) {
                    if ((list1.get(0) == 9) && (list2.get(0) == 0)) {
                        list2.add(list2.get(0));
                        list2.add(list1.get(0));
                        list1.remove(0);
                        list2.remove(0);
                        schetchik3++;
                        rlms++;
                    }
                    if ((list1.get(0) == 0) && (list2.get(0) == 9)) {
                        list1.add(list1.get(0));
                        list1.add(list2.get(0));
                        list1.remove(0);
                        list2.remove(0);
                        schetchik3++;
                        rlms++;
                    }
                    if ((list1.get(0) < list2.get(0)) && (rlms == 0)) {
                        list2.add(list2.get(0));
                        list2.add(list1.get(0));
                        list1.remove(0);
                        list2.remove(0);
                        schetchik3++;
                        rlms++;
                    }
                    else {
                        if ((list1.get(0) > list2.get(0)) && (rlms == 0)) {
                            list1.add(list1.get(0));
                            list1.add(list2.get(0));
                            list1.remove(0);
                            list2.remove(0);
                            schetchik3++;
                            rlms++;
                        }
                    }
                    rlms = 0;
                    if (schetchik3 == 106) {
                        System.out.print("botva");
                        System.exit(0);
                    }
                }
                if (list1.isEmpty()) {
                    System.out.print("second " + schetchik3);
                    System.exit(0);
                }
                if (list2.isEmpty()) {
                    System.out.print("first " + schetchik3);
                    System.exit(0);
                }


        }
    }
}
