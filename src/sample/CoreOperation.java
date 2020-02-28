package sample;

import javafx.scene.control.TextField;

import javax.script.*;

public class CoreOperation {

	private static final String ADD = "+";
	private static final String SUBTRACT = "-";
	private static final String MULTIPLY = "*";
	private static final String DIVIDE = "/";

	public String operation(TextField textField) {
		String str = textField.getText();

//		String strr = "3/2";
//		Integer def = Integer.valueOf(abc);
//		int def = 3/2;
//		System.out.println(def);

//		String strr = "43*(2 + 1.4)+2*32/(3-2.1)";

		String[] strA = str.split("=");
//		System.out.printf(strA[0]);

		String result = shiBieSuanShi(strA[0]);
//		textField.setText(str + result);
		return result;
	}

	//识别算式
	private String shiBieSuanShi(String str) {
//		String[] strArray = str.split("[+,\\-,*,/,=]");
//		for (String s : strArray) {
//			System.out.println(s);
//		}

//		if (str.indexOf("*") != -1 || str.indexOf("/") != -1) {
//			int a = str.indexOf("*");
//			int b = str.indexOf("/");
//			//先运算除号
//			if (a > b && b != -1) {
//
//			}
//		}

		//调用js进行运算，但是算不了除法
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = null;
		try {
			result = engine.eval(str);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
//		System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);
		return result.toString();

		//最新一代算法，解决除法运算难等问题
//		String fun = "function run(str){var result=str}";
//		ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
//		try {
//			engine.eval(fun);
//			if (engine instanceof Invocable){
//				Invocable inv = (Invocable)engine;
//				Object result = (String)inv.invokeFunction("run",str);
////				int a = (int)inv.invokeFunction("run",str);
//				return 1;
//			}else{
//				System.out.println("error");
//			}
//		}catch (ScriptException | NoSuchMethodException e ){
//			System.out.println(e);
//		}
//		return null;
	}

	//运算池
	private Integer runPool(Integer a, String str, Integer b) {
		Integer c = 0;
		if (str == ADD) {
			c = a + b;
		} else if (str == SUBTRACT) {
			c = a - b;
		} else if (str == MULTIPLY) {
			c = a * b;
		} else if (str == DIVIDE) {
			if (b == 0) {
				return 0;
			}
			c = a / b;
		}
		return c;
	}

	private Double runPool(Double a, String str, Double b) {
		Double c = 0.0;
		if (str == ADD) {
			c = a + b;
		} else if (str == SUBTRACT) {
			c = a - b;
		} else if (str == MULTIPLY) {
			c = a * b;
		} else if (str == DIVIDE) {
			if (b == 0) {
				return 0.0;
			}
			c = a / b;
		}
		return c;
	}
}
