public class Test {
    public static void main(String[] args) {
        Membership m1, m2;
        m1 = new Membership("Ruben", 5, 2000);
        m2 = new Membership("Juan", 6, 2010);

        Club c1;
        c1 = new Club();

        c1.join(m1);
        c1.join(m2);
        System.out.println(c1.numberOfMembers());

        System.out.println(c1.joinedInMonth(6));

        System.out.println(c1.purge(6));
    }
}
