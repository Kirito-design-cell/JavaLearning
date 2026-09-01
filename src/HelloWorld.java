public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
git init
git add .
git commit -m "first commit: HelloWorld and primes"
git branch -M main
git remote add origin https://github.com/Kirito-design-cell/JavaLeaning.git
git push -u origin main