package com.example.ricky_000.calculator_lab_2;

/**
 * Created by ricky_000 on 2/18/2018.
 */

public class SimpleExpression {

    // Declaring Properties
    private Integer _Operand1;
    private Integer _Operand2;
    private String _Operator;
    private Integer _Value;

    public SimpleExpression() // Declaring Constructor
    {
        _Operand1 = 0;
        _Operand2 = 0;
        _Operator = "+";
        _Value = 0;
    }

    public void set_Operand1(int v)
    {
        _Operand1 = v;
    }

    public int getOperand1()
    {
        return _Operand1;
    }

    public void setOperand2(int v)
    {
        _Operand2 = v;
    }

    public int getOperand2()
    {
        return _Operand2;
    }

    public void setOperator(String s)
    {
        _Operator = s;
    }

    public String get_Operator()
    {
        return _Operator;
    }

    public Integer getValue()
    {
        computeValue();
        return _Value;
    }

    public void clearOperands()
    {
        _Operand1 = 0;
        _Operand2 = 0;
    }

    private void computeValue()
    {
        _Value = 0;

        if(_Operator.contentEquals("+"))
            _Value = _Operand1 + _Operand2;
        else if (_Operator.contentEquals("-"))
            _Value = _Operand1 - _Operand2;
        else if(_Operator.contentEquals("x"))
            _Value = _Operand1 * _Operand2;
        else if(_Operator.contentEquals("/") && _Operand2 !=0 )
            _Value = _Operand1 / _Operand2;
        else
            _Value = _Operand1 % _Operand2;
    }
}
