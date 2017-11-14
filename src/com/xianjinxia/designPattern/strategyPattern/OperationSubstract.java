package com.xianjinxia.designPattern.strategyPattern;

/**
 * 减法运算
 * @date 2017年11月14日
 */
public class OperationSubstract implements Strategy {
	
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
