
/**
 * Write a description of class Fraction here.
 *
 * Emma Lee
 * @version (a version number or a date)
 */
public class Fraction {

    //Instance variable
    private int numerator, denominator;
    
    //Constructors
public Fraction() {
    numerator = 1;
    denominator = 1;
    }
    
    public Fraction(int N, int D) {
        if (D ==0){
            System.out.println("error");
            D=1;
        }   //fixDenominator()
        
  
    numerator = N;
    denominator = D;
}
 
public Fraction (String frac) {
int slashIndex = frac.indexOf("/");    
if (slashIndex>0){
    String n = frac.substring(0, slashIndex);
    String d = frac.substring(slashIndex+1);
    numerator = Integer.parseInt(n);
    int D = Integer.parseInt(d);
     if (D ==0){
            System.out.println("error");
            D=1;
        }
        denominator = D;
} else {
    System.out.println("Invalid"); //Invalid fraction format
    numerator =1;
    denominator=1;
}
}
/**
 * Copy Constructor
 * @param frac A Fraction object to copy.
 */
public Fraction (Fraction frac){
    numerator = frac.numerator;
    denominator = frac.denominator;
    
}

public int getNum(){
    return numerator;
}
public int getDenom(){
    return denominator;
}
public String toString(){
   return numerator + "/" + denominator; //string cancatination 
}
public double toDouble(){
    return (double) numerator / denominator;
}

//mutators
public void setNumerator(int N){
    numerator = N;
}

public void setDenominator(int D){
    denominator = D;
  if (D ==0){
            System.out.println("error");
            D=1;
        
}

}
private int GCF(int a, int b){
    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

public int gcf(){
    //calculates and returns gcf 
    return GCF(numerator, denominator);
}

public void reduce(){  //static
    int gcf = GCF(numerator, denominator);
    numerator = numerator / gcf;
    denominator = denominator / gcf;
}

public static Fraction multiply(Fraction f1, Fraction f2){
    int prodNum = f1.getNum()*f2.getNum();
    int prodDenom = f1.getDenom()*f2.getDenom();
    Fraction prod = new Fraction(prodNum, prodDenom);
    prod.reduce();
    return prod;
}
public static Fraction divide(Fraction f1, Fraction f2){
    int quotNum = f1.getNum()*f2.getDenom();
    int quotDenom = f1.getDenom()*f2.getNum();
    Fraction quot = new Fraction(quotNum, quotDenom);
    quot.reduce();
    return quot;
}
public static Fraction add(Fraction f1, Fraction f2){
    int sumNum = f1.getNum()*f2.getDenom()+f2.getNum()*f1.getDenom();
    int sumDenom = f1.getDenom()*f2.getNum();
    Fraction sum = new Fraction(sumNum, sumDenom);
    sum.reduce();
    return sum;
}

   }
   
   