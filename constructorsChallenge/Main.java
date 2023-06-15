public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Pratik", 1000, "pratik@gmail.com");
        System.out.println(c1.getName());
        System.out.println(c1.getCreditLimit());
        System.out.println(c1.getEmail());

        Customer c2 = new Customer();
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c2.getEmail());
    }
}
