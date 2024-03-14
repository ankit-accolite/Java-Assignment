package Question2;
public class Calculator implements Calc {
    public int sum(int val1 , int val2)
    {
        return val1+val2;   
    }

    public int multiply(int val1 , int val2)
    {
        if(val1==0 || val2==0)
            throw new ArithmeticException("For Arithmetic Operation Value cannot be 0");

        return val1*val2;
    }

    public int subtract(int val1 , int val2)
    {
        return val1-val2;   
    }

    public int modoulas(int val1 , int val2)
    {
        return val1%val2;   
    }

    public float division(int val1 , int val2) throws ArithmeticException
    {
        if(val1==0 || val2==0)
            throw new ArithmeticException("For Arithmetic Operation Value cannot be 0");

        return val1/val2;   
    }
}
