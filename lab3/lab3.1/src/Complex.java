import java.util.Scanner;
public class Complex {
    private float i, j;
    public Complex (float i, float j){
        this.i = i;
        this.j = j;
    }

    public void setReal(float i){this.i = i;}
    public void setImg(float j){this.j = j;}
    public float complex_i (){return this.i;}
    public float complex_j (){return this.j;}
    public void copy (Complex x){
        this.i = x.complex_i();
        this.j = x.complex_j();
    }
    public Complex () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественную часть комплексного числа: ");
        this.i = scanner.nextFloat();
        System.out.print("Введите мнимую часть комплексного числа: ");
        this.j = scanner.nextFloat();
    }
    public Complex (float i) {
        this.i = i;
        this.j = 0;
    }

    public void complex_out(){
        System.out.println(this.i+"+"+this.j+"j");
    }

    public Complex add(Complex x){
        return new Complex(x.i+this.i, x.j+this.j);
    }

    public Complex sub(Complex x){
        return new Complex(this.i-x.i, this.j-x.j);
    }

    public Complex mul (Complex x){
        return new Complex(this.i*x.i - this.j*x.j, this.j*x.i+this.i*x.j);
    }

    public Complex div (Complex x){
        return new Complex((this.i*x.i+this.j*x.j)/(x.i*x.i+x.j*x.j), (this.j*x.i-this.i*x.j)/(x.i*x.i+x.j*x.j));
    }
}
