class PrintEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to printing even numbers.");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i + " ");
        }
    }
}
