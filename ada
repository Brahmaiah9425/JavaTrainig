class AdditionOverloading{
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(int a, double b) {
        return a + b;
    }
    double add(double a, int b) {
        return a + b;
    }
    public static void main(String args[])
    {
        AdditionOverloading ad = new AdditionOverloading();
        System.out.println("Addition of two integers: " + ad.add(5, 10));
        System.out.println("Addition of two doubles: " + ad.add(5.5, 10.5));
        System.out.println("Addition of three integers: " + ad.add(5, 10, 15));
        System.out.println("Addition of int and double: " + ad.add(5, 10.5));
        System.out.println("Addition of double and int: " + ad.add(5.5, 10));
    }
}