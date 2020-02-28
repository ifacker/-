package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class Controller {

    int i = 0;

    public Scene createBtn() {
//		Button btn = new Button();
//		btn.setText("一键喷石雕");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
////				System.out.println("石雕草拟吗！");
//
//			}
//		});

        //创建按钮对象
        Button bt0 = new Button("0");
        Button bt1 = new Button("1");
        Button bt2 = new Button("2");
        Button bt3 = new Button("3");
        Button bt4 = new Button("4");
        Button bt5 = new Button("5");
        Button bt6 = new Button("6");
        Button bt7 = new Button("7");
        Button bt8 = new Button("8");
        Button bt9 = new Button("9");
        Button btPoint = new Button(".");
        Button btEqual = new Button("=");
        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        Button btMultiply = new Button("*");
        Button btDivide = new Button("/");
        Button btClear = new Button("清除");
        Button btBack = new Button("退格");
        Button btLBracket = new Button("(");
        Button btRBracket = new Button(")");

        //创建文本对象
        TextField textField = new TextField();
        textField.setText("");
        textField.setPromptText("请输入...");
        textField.setAlignment(Pos.CENTER);
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                if (textField.getText().contains("=") && i == 0) {
                    i++;
//					String[] strA = textField.getText().split("=");
//					if (strA[1] == null) {
                    CoreOperation coreOperation = new CoreOperation();
                    String result = coreOperation.operation(textField);
                    textField.setText(textField.getText() + result);
                } else {
                    i = 0;
                }
            }
        });
//		textField.setPadding(new Insets(10));

        //给 button 赋能
        btPoint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btPoint, textField);
            }
        });
        btEqual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btEqual, textField);

                //这里不需要创建监听对象
//				CoreOperation coreOperation = new CoreOperation();
//				coreOperation.operation(textField);

            }
        });
        btAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btAdd, textField);
            }
        });
        btSubtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btSubtract, textField);
            }
        });
        btMultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btMultiply, textField);
            }
        });
        btDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btDivide, textField);
            }
        });
        bt0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt0, textField);
            }
        });
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt1, textField);
            }
        });
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt2, textField);
            }
        });
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt3, textField);
            }
        });
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt4, textField);
            }
        });
        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt5, textField);
            }
        });
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt6, textField);
            }
        });
        bt7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt7, textField);
            }
        });
        bt8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt8, textField);
            }
        });
        bt9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(bt9, textField);
            }
        });
        btClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText("");
            }
        });
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String strOld = textField.getText();
				if (strOld == null || strOld.equals("")) {
					return;
				}
                else{
					textField.setText(strOld.substring(0, strOld.length() - 1));
				}
            }
        });
        btLBracket.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btLBracket, textField);
            }
        });
        btRBracket.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonFunction btnFun = new ButtonFunction();
                btnFun.ButtonFun(btRBracket, textField);
            }
        });


        //显示区的布局
        GridPane gridPaneTop = new GridPane();
        gridPaneTop.setAlignment(Pos.CENTER);
        gridPaneTop.setMaxHeight(6);
        gridPaneTop.add(textField, 0, 0);
        gridPaneTop.setPadding(new Insets(30, 0, 0, 5));

        //创建 gridpane 布局
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);
        gridPane.add(bt1, 0, 0);
        gridPane.add(bt2, 1, 0);
        gridPane.add(bt3, 2, 0);
        gridPane.add(btAdd, 3, 0);
        gridPane.add(btClear, 4, 0);
        gridPane.add(bt4, 0, 1);
        gridPane.add(bt5, 1, 1);
        gridPane.add(bt6, 2, 1);
        gridPane.add(btSubtract, 3, 1);
        gridPane.add(btBack, 4, 1);
        gridPane.add(bt7, 0, 2);
        gridPane.add(bt8, 1, 2);
        gridPane.add(bt9, 2, 2);
        gridPane.add(btMultiply, 3, 2);
        gridPane.add(btLBracket, 4, 2);
        gridPane.add(btPoint, 0, 3);
        gridPane.add(bt0, 1, 3);
        gridPane.add(btEqual, 2, 3);
        gridPane.add(btDivide, 3, 3);
        gridPane.add(btRBracket, 4, 3);

        //创建 BorderPane 布局
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(gridPane);
        borderPane.setTop(gridPaneTop);

        StackPane root = new StackPane();
        root.getChildren().add(borderPane);
        Scene scene = new Scene(root, 300, 250);
        return scene;
    }

}
