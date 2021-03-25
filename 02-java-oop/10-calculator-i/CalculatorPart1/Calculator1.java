public class Calculator1
{
    private double operandOne;
    private double operandTwo;
    private char operation;
    private double result;

    public double getOperandOne(double operandOne)
    {
        return operandOne;
    }

    public void setOperandOne(double operandOne)
    {
        this.operandOne = operandOne;
    }

    public double getOperandTwo(double operandTwo)
    {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo)
    {
        this.operandTwo = operandTwo;
    }


    public double getOperation(char operation)
    {
        return operation;
    }

    public void setOperation(char operation)
    {
        this.operation = operation;
    }

    public void performOperation()
    {
        if (this.operation=='+')
        {
            this.result= operandOne + operandTwo;
        }
        if (this.operation=='-') 
        {
            this.result = operandOne - operandTwo;
        }

    }

    public void getResult()
        {

            System.out.println("The result of the operation is "  +  this.operandOne + " " + this.operation  + " " + this.operandTwo + "=" + this.result);
        }
    

}
