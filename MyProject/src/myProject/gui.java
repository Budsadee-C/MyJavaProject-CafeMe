package myProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public interface gui{
	JPanel contentPane = new JPanel();
	JTextField subTotal_txt = new JTextField();
	JTextField vat_txt= new JTextField();
	JTextField netTotal_txt= new JTextField();
	JTextField d1_txt= new JTextField();
	JTextField d2_txt= new JTextField();
	JTextField d3_txt= new JTextField();
	JTextField d4_txt= new JTextField();
	JTextField d5_txt= new JTextField();
	JTextField c1_txt= new JTextField();
	JTextField c2_txt= new JTextField();
	JTextField c3_txt= new JTextField();
	JTextField c4_txt= new JTextField();
	JTextField c5_txt= new JTextField();
	JTextField f1_txt= new JTextField();
	JTextField f2_txt= new JTextField();
	JTextField f3_txt= new JTextField();
	JTextField f4_txt= new JTextField();
	JTextField f5_txt= new JTextField();
	JCheckBox c1_check= new JCheckBox();
	JCheckBox c2_check= new JCheckBox();
	JCheckBox c3_check= new JCheckBox();
	JCheckBox c4_check= new JCheckBox();
	JCheckBox c5_check= new JCheckBox();
	JCheckBox d1_check= new JCheckBox();
	JCheckBox d2_check= new JCheckBox();
	JCheckBox d3_check= new JCheckBox();
	JCheckBox d4_check= new JCheckBox();
	JCheckBox d5_check= new JCheckBox();
	JCheckBox f1_check= new JCheckBox();
	JCheckBox f2_check= new JCheckBox();
	JCheckBox f3_check= new JCheckBox();
	JCheckBox f4_check= new JCheckBox();
	JCheckBox f5_check= new JCheckBox();
	JButton save_btn = new JButton("Save");
	JButton total_btn = new JButton("Total");
	JButton print_btn = new JButton("Print");
	JButton reset_btn = new JButton("Reset");
	JTextArea result_txt = new JTextArea();
	JPanel banner_pannel = new JPanel();
	JLabel lblNewLabel = new JLabel("Cafe@Home");
	JLabel lblTotals = new JLabel("Vat(12%)");
	JLabel lblTotal = new JLabel("Sub Total");
	JLabel lblNetTotal = new JLabel("Net Total");
	JLabel label = new JLabel("");
	JLabel label_1 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel label_6 = new JLabel("");
	JLabel label_7 = new JLabel("");
	JLabel label_8 = new JLabel("");
	JLabel label_9 = new JLabel("");
	JLabel label_18 = new JLabel("");
	JLabel label_19 = new JLabel("");
	JLabel label_20 = new JLabel("");
	JLabel label_24 = new JLabel("");
	JLabel label_25 = new JLabel("");
	
	JLabel lblNewLabel_1 = new JLabel("");
	JLabel lblNewLabel_3 = new JLabel("");
	JLabel lblNewLabel_4 = new JLabel("");
	
	JLabel label_10 = new JLabel("(quantity)");
	JLabel label_11 = new JLabel("(quantity)");
	JLabel label_12 = new JLabel("(quantity)");
	JLabel label_4 = new JLabel("(quantity)");
	JLabel label_5 = new JLabel("(quantity)");
	JLabel label_13 = new JLabel("(quantity)");
	JLabel label_14 = new JLabel("(quantity)");
	JLabel label_15 = new JLabel("(quantity)");
	JLabel label_16 = new JLabel("(quantity)");
	JLabel label_17 = new JLabel("(quantity)");
	JLabel label_21 = new JLabel("(quantity)");
	JLabel label_22 = new JLabel("(quantity)");
	JLabel label_26 = new JLabel("(quantity)");
	JLabel label_27 = new JLabel("(quantity)");
	JLabel label_23 = new JLabel("(quantity)");
	
	JTabbedPane tab1 = new JTabbedPane(JTabbedPane.TOP);
	JPanel coffee_panel = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	JPanel panel_5 = new JPanel();
	JPanel drink_pannel = new JPanel();
	JPanel dishes_pannel = new JPanel();
}
