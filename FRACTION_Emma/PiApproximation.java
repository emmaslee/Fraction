
/**
 * Write a description of class PiApproximation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PiApproximation
{
    public static void main(String[] args) {
        
        final double EPSILON = 1e-15;

        Fraction MILU = new Fraction(355, 113);


        Fraction approximation = new Fraction(22, 7);
        while (Math.abs(Math.PI - approximation.toDouble()) > EPSILON) {
            if (approximation.toDouble() < Math.PI) {
                // If approx too small, increase numerator by 1
                approximation.setNumerator(approximation.getNum() + 1);
            } else {
                // If approx too large, increase the denominator by 1
                approximation.setDenominator(approximation.getDenom() + 1);
            }
        }

        System.out.println("The next closest fraction to π is: " +
                approximation.getNum() + "/" + approximation.getDenom());
    }


    static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public int getNum() {
            return numerator;
        }

        public int getDenom() {
            return denominator;
        }

        public double toDouble() {
            return (double) numerator / denominator;
        }

        public void setNumerator(int N) {
            numerator = N;
        }

        public void setDenominator(int D) {
            denominator = D;
            if (D == 0) {
                System.out.println("error");
                D = 1;
            }
        }
    }
}


