package academy.pocu.comp2500.lab2;

public class Program {
    private static final double DOUBLE_EPSILON = 0.00001;

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber();
        ComplexNumber num2 = new ComplexNumber(10.0);
        ComplexNumber num3 = new ComplexNumber(2.5, -5.1);
        ComplexNumber num4 = new ComplexNumber(0.0, 0.0012);

        assert (num1.Real == 0.0);
        assert (num1.Imaginary == 0.0);

        assert (num2.Real == 10.0);
        assert (num2.Imaginary == 0.0);

        assert (num3.Real == 2.5);
        assert (num3.Imaginary == -5.1);

        assert num2.isReal();
        assert !num3.isReal();

        assert num4.isImaginary();
        assert !num3.isImaginary();

        ComplexNumber num3Conjugate = num3.getConjugate();

        assert num3Conjugate.Real == 2.5;
        assert num3Conjugate.Imaginary == 5.1;

        ComplexNumber sum = num2.add(num3);

        assert Math.abs(sum.Real - 12.5) < DOUBLE_EPSILON;
        assert Math.abs(sum.Imaginary - (-5.1)) < DOUBLE_EPSILON;

        ComplexNumber diff = num4.subtract(num3);

        assert Math.abs(diff.Real - (-2.5)) < DOUBLE_EPSILON;
        assert Math.abs(diff.Imaginary - 5.1012) < DOUBLE_EPSILON;

        ComplexNumber product = num3.multiply(num4);

        assert Math.abs(product.Real - 0.00612) < DOUBLE_EPSILON;
        assert Math.abs(product.Imaginary - 0.003) < DOUBLE_EPSILON;

        ComplexNumber quotient = num4.divide(num3);

        assert Math.abs(quotient.Real - (-1.89709E-4)) < DOUBLE_EPSILON;
        assert Math.abs(quotient.Imaginary - 9.29944E-5) < DOUBLE_EPSILON;
    }
}