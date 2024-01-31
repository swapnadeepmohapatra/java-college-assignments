public class Pattern {
    public static void main(String[] args) {
        Pattern7();
    }

    public static void Pattern1() {
        for (int i = 0; i <= 7; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public static void Pattern2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Pattern3() {
        int n = 9;
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int j = 1; j < n - i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < n - i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public static void Pattern4() {
        int n = 6;
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("*");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Pattern5() {
        int n = 4;
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Pattern6() {
        int n = 3;
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void Pattern7() {
        int n = 4;
        for (int i = 0; i <= n * 2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = n; j / 2 >= n - i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = n; j / 2 >= n - i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 0; i <= n * 2; i++) {
            System.out.print("*");
        }
    }
}