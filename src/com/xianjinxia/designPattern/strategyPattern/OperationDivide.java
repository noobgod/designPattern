package com.xianjinxia.designPattern.strategyPattern;


/**
 * 除法运算
 * @date 2017年11月14日
 */
public class OperationDivide implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 / num2;
	}

}
