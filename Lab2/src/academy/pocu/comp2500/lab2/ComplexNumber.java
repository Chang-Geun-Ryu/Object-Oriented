package academy.pocu.comp2500.lab2;

public final class ComplexNumber {
    public final double Real;
    public final double Imaginary;

    public ComplexNumber() {
        this.Real = 0.0;
        this.Imaginary = 0.0;
    }

    public ComplexNumber(double real) {
        this.Real = real;
        this.Imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.Real = real;
        this.Imaginary = imaginary;
    }

    public boolean isReal() {
        return this.Imaginary == 0.0;
    }

    public boolean isImaginary() {
        return this.Real == 0.0;
    }

    public ComplexNumber getConjugate() {
        return new ComplexNumber(this.Real, -this.Imaginary);
    }

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.Real + num.Real, this.Imaginary + num.Imaginary);
    }

    public ComplexNumber subtract(ComplexNumber num) {
        return new ComplexNumber(this.Real - num.Real, this.Imaginary - num.Imaginary);
    }

    public ComplexNumber multiply(ComplexNumber num) {
        return new ComplexNumber(this.Real * num.Real - this.Imaginary * num.Imaginary, this.Real * num.Imaginary + this.Imaginary * num.Real);
    }

    public ComplexNumber divide(ComplexNumber num) {
        ComplexNumber mul = this.multiply(num.getConjugate());
        double dTemp = Math.pow(num.Real, 2) + Math.pow(num.Imaginary, 2);
        return new ComplexNumber(mul.Real / dTemp, mul.Imaginary / dTemp);
    }
    /*
    (a + bi) / (c + di) = [(a + bi) / (c + di)] * [(c - di) / (c - di)]
                        = (a + bi)(c - di) / (c^2 + d^2)
     */

}
