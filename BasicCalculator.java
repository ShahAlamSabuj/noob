import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;


class BasicCalculator{
	
	static int operation = 0;
	static double input1 = 0;
    
    public static void main(String sabuj[]){
        
        JFrame frame1=new JFrame("BasicCalculator");
        frame1.setLayout(null);
        final JTextField textbox=new JTextField(10);
        textbox.setBounds(10,10,200,30);
        
        JButton n0 = new JButton("0");
        JButton n1 = new JButton("1");
        JButton n2 = new JButton("2");
        JButton n3 = new JButton("3");
        JButton n4 = new JButton("4");
        JButton n5 = new JButton("5");
        JButton n6 = new JButton("6");
        JButton n7 = new JButton("7");
        JButton n8 = new JButton("8");
        JButton n9 = new JButton("9");
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("x");
        JButton div = new JButton("÷");
        JButton dot = new JButton(".");
        JButton equal = new JButton("=");
        JButton clr = new JButton("c");
    
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(10,60,200,150);
        buttonPanel.setBackground(Color.white);
        
        buttonPanel.setLayout(new GridLayout(5,4,5,5));
        buttonPanel.add(n0);
        buttonPanel.add(n1);
        buttonPanel.add(n2);
        buttonPanel.add(add);
        buttonPanel.add(n3);
        buttonPanel.add(n4);
        buttonPanel.add(n5);
        buttonPanel.add(sub);
        buttonPanel.add(n6);
        buttonPanel.add(n7);
        buttonPanel.add(n8);
        buttonPanel.add(mul);
        buttonPanel.add(n9);
        buttonPanel.add(dot);
        buttonPanel.add(equal);
        buttonPanel.add(div);
        buttonPanel.add(clr);
        
        
        class MyListener implements ActionListener{
        	
            public void actionPerformed(ActionEvent ae){
                String keyPress = ae.getActionCommand();
                
                if(keyPress.equals("+")){
                    input1 = Double.parseDouble(textbox.getText());
                    operation = 1;
                    textbox.setText("");
                    
                }
                else if(keyPress.equals("-")){
                    input1 = Double.parseDouble(textbox.getText());
                    operation = 2;
                    textbox.setText("");
                }
                else if(keyPress.equals("x")){
                    input1 = Double.parseDouble(textbox.getText());
                    operation = 3;
                    textbox.setText("");
                }
                else if(keyPress.equals("÷")){
                    input1 = Double.parseDouble(textbox.getText());
                    operation = 4;
                    textbox.setText("");
                    
                }
                else if(keyPress.equals("0")){
                    textbox.setText(textbox.getText().concat("0"));
                }
                else if(keyPress.equals("1")){
                    textbox.setText(textbox.getText().concat("1"));
                }
                else if(keyPress.equals("2")){
                    textbox.setText(textbox.getText().concat("2"));
                }
                else if(keyPress.equals("3")){
                    textbox.setText(textbox.getText().concat("3"));
                }
                else if(keyPress.equals("4")){
                    textbox.setText(textbox.getText().concat("4"));
                }
                else if(keyPress.equals("5")){
                    textbox.setText(textbox.getText().concat("5"));
                }
                else if(keyPress.equals("6")){
                    textbox.setText(textbox.getText().concat("6"));
                }
                else if(keyPress.equals("7")){
                    textbox.setText(textbox.getText().concat("7"));
                }
                else if(keyPress.equals("8")){
                    textbox.setText(textbox.getText().concat("8"));
                }
                else if(keyPress.equals("9")){
                    textbox.setText(textbox.getText().concat("9"));
                }
                else if(keyPress.equals(".")){
                    textbox.setText(textbox.getText().concat("."));
                }
                else if(keyPress.equals("=")){
                    double input2 = Double.parseDouble(textbox.getText());
                    double result = 0; 
                   
                    switch(operation){
                    
                        case 1:
                        	
                        	result = input1+input2;
                        	
                        break;
                        case 2:
                        	result = input1-input2;
                        break;
                        case 3:
                        	result = input1*input2;
                        break;
                        case 4:
                        	result = input1/input2;
                        break;
                        default :
                        	result = 0;
                    }
                    textbox.setText("" + result);
                        
                }
                else if(keyPress.equals("c")){
                	textbox.setText("");
                	}
                }
            }
        MyListener action=new MyListener();
        
        add.addActionListener(action);
        sub.addActionListener(action);
        mul.addActionListener(action);
        div.addActionListener(action);
        clr.addActionListener(action);
        equal.addActionListener(action);
        n0.addActionListener(action);
        n1.addActionListener(action);
        n2.addActionListener(action);
        n3.addActionListener(action);
        n4.addActionListener(action);
        n5.addActionListener(action);
        n6.addActionListener(action);
        n7.addActionListener(action);
        n8.addActionListener(action);
        n9.addActionListener(action);
        dot.addActionListener(action);
        
        frame1.add(textbox);
        frame1.add(buttonPanel);
        frame1.setBounds(300,200,230,250);
        frame1.setVisible(true);
    }
}

