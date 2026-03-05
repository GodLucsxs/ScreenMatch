public class calculadora {
    private double num1;
    private double num2;
    private char operação;

    public char getOperação() {
        return operação;
    }

    public void setOperação(char operação) {
        this.operação = operação;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    void Calcular (){
        switch (operação){
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("ERRO 404");
        }

    }
}
