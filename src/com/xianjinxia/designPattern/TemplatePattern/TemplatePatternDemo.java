package com.xianjinxia.designPattern.TemplatePattern;

/**
 * 模板模式
 * @date 2017年11月14日
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println("**************************");
		game = new Football();
		game.play();
	}
}
