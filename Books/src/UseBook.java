public class UseBook {
    public static void main(String[] args) {
        Fiction Novel1 = new Fiction ("The Lord of The Rings");
        NonFiction Novel2 = new NonFiction ("Silent Spring");
        System.out.println("Fiction" + Novel1.getTitle() + "costs $" + Novel1.getPrice());
        System.out.println("NonFiction" + Novel2.getTitle() + "costs $" + Novel2.getPrice());
    }
}
