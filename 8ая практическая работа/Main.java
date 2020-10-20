package prac8;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 ---------------------------");

        WaitList<Integer> list = new WaitList<>();

        System.out.println("isEmpty?   " + list.isEmpty());

        list.add(53);
        list.add(22);
        list.add(45);
        list.add(423);
        list.add(599);
        list.add(65);
        list.add(393);
        list.add(11);
        list.add(233);

        System.out.println("isEmpty?   " + list.isEmpty());

        System.out.println(list);

        list.remove();
        list.remove();
        list.remove();

        System.out.println(list);

        System.out.println("2 ---------------------------");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);

        System.out.println("isEmpty?   " + list2.isEmpty());

        list2.add(522);
        list2.add(23);
        list2.add(40);
        list2.add(45);
        list2.add(524);
        list2.add(61);
        list2.add(923);
        list2.add(14);
        list2.add(223);

        System.out.println("isEmpty?   " + list2.isEmpty());

        System.out.println(list2);

        list2.remove();
        list2.remove();
        list2.remove();

        System.out.println(list2);

        System.out.println("3 ---------------------------");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();

        System.out.println("isEmpty?   " + list3.isEmpty());

        list3.add(598);
        list3.add(27);
        list3.add(412);
        list3.add(44);
        list3.add(50);
        list3.add(16);
        list3.add(769);
        list3.add(18);
        list3.add(723);

        System.out.println("isEmpty?   " + list3.isEmpty());

        System.out.println(list3);

        list3.remove(723);
        list3.remove(16);
        list3.remove(50);

        System.out.println(list3);
    }
}
