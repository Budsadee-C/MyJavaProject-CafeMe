package myProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class setGui implements gui {
	public void setAdd()
	{
		tab1.addTab("Coffee Menu", null, coffee_panel, null);
		tab1.addTab("Drink Menu", null, drink_pannel, null);
		tab1.addTab("Dishes-Menu", null, dishes_pannel, null);
		
		coffee_panel.add(panel_5);
		drink_pannel.add(panel_4);
		dishes_pannel.add(panel_3);
		banner_pannel.add(lblNewLabel);
		panel.add(netTotal_txt);
		panel.add(netTotal_txt);
		panel.add(subTotal_txt);
		panel.add(vat_txt);
		panel.add(save_btn);
		panel.add(reset_btn);
		panel.add(print_btn);
		panel.add(total_btn);
		panel.add(print_btn);
		panel.add(total_btn);
		panel.add(lblTotals);
		panel.add(lblTotal);
		panel.add(lblNetTotal);
		panel.add(lblTotals);
		panel_3.add(f5_check);
		panel_3.add(f4_check);
		panel_3.add(f3_check);
		panel_3.add(f2_check);
		panel_3.add(f1_check);
		panel_3.add(f1_txt);
		panel_3.add(f2_txt);		
		panel_3.add(f3_txt);
		panel_3.add(f4_txt);
		panel_3.add(f5_txt);
		panel_3.add(lblNewLabel_4);
		panel_3.add(label_18);
		panel_3.add(label_20);
		panel_3.add(label_21);
		panel_3.add(label_22);
		panel_3.add(label_26);
		panel_3.add(label_27);
		panel_3.add(label_23);
		panel_3.add(label_24);
		panel_3.add(label_25);
		panel_4.add(d1_check);
		panel_4.add(d2_check);
		panel_4.add(d3_check);
		panel_4.add(d4_check);
		panel_4.add(d5_check);
		panel_4.add(d1_txt);
		panel_4.add(d2_txt);
		panel_4.add(d3_txt);
		panel_4.add(d4_txt);
		panel_4.add(d5_txt);
		panel_4.add(label_7);
		panel_4.add(label_8);
		panel_4.add(label_9);
		panel_4.add(label_10);
		panel_4.add(label_11);
		panel_4.add(label_12);
		panel_4.add(label_16);
		panel_4.add(label_17);
		panel_4.add(lblNewLabel_1);
		panel_4.add(lblNewLabel_3);
		panel_5.add(c1_check);
		panel_5.add(c2_check);
		panel_5.add(c3_check);
		panel_5.add(c4_check);
		panel_5.add(c5_check);
		panel_5.add(label_1);
		panel_5.add(label_2);
		panel_5.add(label_3);
		panel_5.add(label_4);
		panel_5.add(label_5);
		panel_5.add(label_15);
		panel_5.add(label_14);
		panel_5.add(label_13);
		panel_5.add(label_6);
		panel_5.add(c1_txt);
		panel_5.add(c2_txt);
		panel_5.add(c3_txt);
		panel_5.add(c4_txt);
		panel_5.add(c5_txt);
		panel_5.add(label);
	}
	public void setIcon()
	{
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Cosmopolitan.png"));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Shirley_Temple.png"));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\136608.png"));
		label.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\\u03B6\u03B5\u03C3\u03C4\u03AE-\u03C3\u03BF\u03BA\u03BF\u03BB\u03AC\u03C4\u03B1-hot-chocolate.png"));
		label_1.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\cozy-cafe-Caffe-Latte-Coffee.png"));
		label_2.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Coffee_with_Hearts_Transparent_PNG_Picture.png"));
		label_3.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Chocolademelk.png"));
		label_6.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\cup-of-tea-icon.png"));
		label_7.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Mai-Tai-Drink.png"));
		label_8.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\32438-tropical-drink-icon.png"));
		label_9.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Orange_Cocktail_PNG_Clipart-550.png"));
		label_18.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Gumbo.png"));
		label_19.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\banner1.png"));
		label_20.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Macaroni_and_Cheese.png"));
		label_24.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\jidlo.png"));
		label_25.setIcon(new ImageIcon("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\Eggs_and_Bacon_PNG_Vector_Clipart.png"));
		
	}
	public void setBound()
	{
		tab1.setBounds(25, 124, 321, 687);
		lblNewLabel.setBounds(15, 0, 169, 53);
		lblNewLabel_1.setBounds(88, 495, 62, 110);
		lblNewLabel_3.setBounds(96, 16, 62, 98);
		lblNewLabel_4.setBounds(56, 46, 113, 79);
		label.setBounds(78, 385, 69, 123);
		label_1.setBounds(78, 141, 69, 97);
		label_2.setBounds(68, 28, 79, 97);
		label_3.setBounds(78, 248, 79, 134);
		label_6.setBounds(68, 524, 95, 80);
		label_7.setBounds(96, 253, 54, 105);
		label_8.setBounds(96, 116, 57, 121);
		label_9.setBounds(89, 372, 69, 121);
		label_18.setBounds(56, 141, 113, 85);
		label_19.setBounds(448, 6, 116, 102);
		label_20.setBounds(56, 455, 113, 79);
		label_25.setBounds(56, 343, 108, 82);
		label_24.setBounds(56, 242, 108, 85);
		label_4.setBounds(185, 342, 69, 20);
		label_5.setBounds(193, 469, 69, 20);
		label_10.setBounds(195, 100, 69, 20);
		label_11.setBounds(195, 203, 69, 20);
		label_12.setBounds(193, 319, 69, 20);
		label_13.setBounds(186, 220, 69, 20);
		label_14.setBounds(186, 120, 69, 20);
		label_15.setBounds(185, 584, 69, 20);
		label_16.setBounds(195, 564, 69, 20);
		label_17.setBounds(193, 443, 69, 20);
		label_23.setBounds(194, 307, 69, 20);
		label_26.setBounds(194, 407, 69, 20);
		panel.setBounds(361, 555, 602, 256);
		panel_4.setBounds(15, 16, 286, 621);
		banner_pannel.setBounds(263, 50, 184, 53);
		netTotal_txt.setBounds(418, 16, 146, 67);
		subTotal_txt.setBounds(133, 17, 146, 58);
		vat_txt.setBounds(133, 91, 146, 58);
		total_btn.setBounds(91, 187, 121, 53);
		reset_btn.setBounds(253, 187, 121, 53);
		print_btn.setBounds(418, 187, 121, 53);
		lblNewLabel.setBounds(15, 0, 169, 53);
		lblTotal.setBounds(15, 23, 103, 58);
		lblNetTotal.setBounds(311, 23, 103, 58);
		lblTotals.setBounds(15, 90, 103, 58);
		c1_check.setBounds(28, 78, 29, 37);
		c2_check.setBounds(28, 179, 29, 37);
		c3_check.setBounds(28, 301, 29, 37);
		c4_check.setBounds(28, 428, 29, 37);
		c5_check.setBounds(28, 550, 29, 37);
		d1_check.setBounds(42, 58, 29, 37);
		d2_check.setBounds(42, 161, 29, 37);
		d3_check.setBounds(42, 266, 29, 37);
		d4_check.setBounds(42, 401, 29, 37);
		d5_check.setBounds(42, 531, 29, 37);
		f1_check.setBounds(16, 71, 29, 37);
		f2_check.setBounds(16, 177, 29, 37);
		f3_check.setBounds(16, 275, 29, 37);
		f4_check.setBounds(16, 375, 29, 37);
		f5_check.setBounds(16, 478, 29, 37);
		d1_txt.setBounds(185, 58, 86, 37);
		d2_txt.setBounds(185, 161, 86, 37);
		d3_txt.setBounds(185, 277, 86, 37);
		d4_txt.setBounds(185, 401, 86, 37);
		d5_txt.setBounds(185, 519, 86, 37);
		c1_txt.setBounds(176, 78, 86, 37);
		c2_txt.setBounds(176, 179, 86, 37);
		c3_txt.setBounds(176, 301, 86, 37);
		c4_txt.setBounds(176, 428, 86, 37);
		c5_txt.setBounds(176, 540, 86, 37);
		f1_txt.setBounds(184, 63, 86, 37);
		f2_txt.setBounds(184, 167, 86, 37);
		f3_txt.setBounds(184, 265, 86, 37);
		f4_txt.setBounds(184, 365, 86, 37);
		f5_txt.setBounds(184, 478, 86, 37);
		panel_3.setBounds(15, 26, 286, 585);
		panel_5.setBounds(15, 26, 294, 611);
		label_21.setBounds(194, 105, 69, 20);
		label_22.setBounds(194, 209, 69, 20);
		label_27.setBounds(194, 520, 69, 20);
		result_txt.setBounds(378, 146, 563, 393);
	}
	public void setAttribute()
	{
		
		tab1.setForeground(new Color(169, 169, 169));
		total_btn.setForeground(new Color(255, 99, 71));
		reset_btn.setForeground(new Color(255, 99, 71));
		print_btn.setForeground(new Color(255, 99, 71));
		coffee_panel.setBackground(new Color(255, 245, 238));
		banner_pannel.setBackground(new Color(255, 245, 238));
		drink_pannel.setBackground(new Color(255, 245, 238));
		dishes_pannel.setBackground(new Color(255, 245, 238));
		result_txt.setForeground(Color.BLACK);
		d1_check.setBackground(new Color(255, 245, 238));
		d2_check.setBackground(new Color(255, 245, 238));
		d3_check.setBackground(new Color(255, 245, 238));
		d4_check.setBackground(new Color(255, 245, 238));
		d5_check.setBackground(new Color(255, 245, 238));
		c1_check.setBackground(new Color(255, 245, 238));
		c2_check.setBackground(new Color(255, 245, 238));
		c3_check.setBackground(new Color(255, 245, 238));
		c4_check.setBackground(new Color(255, 245, 238));
		c5_check.setBackground(new Color(255, 245, 238));
		f1_check.setBackground(new Color(255, 245, 238));
		f2_check.setBackground(new Color(255, 245, 238));
		f3_check.setBackground(new Color(255, 245, 238));
		f4_check.setBackground(new Color(255, 245, 238));
		f5_check.setBackground(new Color(255, 245, 238));
		print_btn.setBackground(new Color(255, 222, 173));
		reset_btn.setBackground(new Color(255, 222, 173));
		panel.setBackground(new Color(255, 239, 213));
		panel_3.setBackground(new Color(255, 245, 238));
		panel_4.setBackground(new Color(255, 245, 238));
		panel_5.setBackground(new Color(255, 245, 238));
		total_btn.setBackground(new Color(255, 222, 173));
		
		lblNewLabel.setFont(new Font("Pristina", Font.PLAIN, 39));
		netTotal_txt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		subTotal_txt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		vat_txt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		total_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		reset_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		print_btn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotals.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNetTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		result_txt.setFont(new Font("Monospaced", Font.BOLD, 18));
		c1_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c3_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c2_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c4_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c5_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		d1_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		d2_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		d3_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		d4_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		d5_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c1_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		c2_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		c3_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		c4_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		c5_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		d1_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		d4_check.setFont(new Font("Tahoma", Font.PLAIN, 16));
		f1_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		f2_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		f3_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		f4_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		f5_check.setFont(new Font("Tahoma", Font.PLAIN, 30));
		f1_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		f2_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		f3_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		f4_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		f5_txt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		panel.setLayout(null);
		banner_pannel.setLayout(null);
		banner_pannel.setLayout(null);
		coffee_panel.setLayout(null);
		drink_pannel.setLayout(null);
		dishes_pannel.setLayout(null);
		panel.setLayout(null);
		panel_3.setLayout(null);
		panel_4.setLayout(null);
		panel_5.setLayout(null);
		c1_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		c1_txt.setColumns(10);
		c2_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		c2_txt.setColumns(10);
		c3_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		c3_txt.setColumns(10);
		c4_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		c4_txt.setColumns(10);
		c5_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		c5_txt.setColumns(10);
		d1_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		d1_txt.setColumns(10);
		d2_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		d2_txt.setColumns(10);
		d3_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		d3_txt.setColumns(10);
		d4_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		d4_txt.setColumns(10);
		d5_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		d5_txt.setColumns(10);
		netTotal_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		netTotal_txt.setColumns(10);
		subTotal_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		subTotal_txt.setColumns(10);	
		vat_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		vat_txt.setColumns(10);	
		f1_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		f1_txt.setColumns(10);
		f2_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		f2_txt.setColumns(10);
		f3_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		f3_txt.setColumns(10);
		f4_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		f4_txt.setColumns(10);
		f5_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		f5_txt.setColumns(10);

		panel_3.setBorder(BorderFactory.createTitledBorder("Dishes-Menu"));
		panel_4.setBorder(BorderFactory.createTitledBorder("Drink-Menu"));
		panel_5.setBorder(BorderFactory.createTitledBorder("Coffee & Tea"));
	}
	public void setQuantity(JCheckBox a,JTextField b)
	{
		if(a.isSelected())
		{
			b.setEditable(true);
			b.setText("");
		}
		else
		{
			b.setEditable(false);
			b.setText("0");
		}
	}
	public void Resetcheck(boolean b,boolean a)
	{
		c1_check.setEnabled(b);
		c2_check.setEnabled(b);
		c3_check.setEnabled(b);
		c4_check.setEnabled(b);
		c5_check.setEnabled(b);
		d1_check.setEnabled(b);
		d2_check.setEnabled(b);
		d3_check.setEnabled(b);
		d4_check.setEnabled(b);
		d5_check.setEnabled(b);
		f1_check.setEnabled(b);
		f2_check.setEnabled(b);
		f3_check.setEnabled(b);
		f4_check.setEnabled(b);
		f5_check.setEnabled(b);
		c1_check.setSelected(a);
		c2_check.setSelected(a);
		c3_check.setSelected(a);
		c4_check.setSelected(a);
		c5_check.setSelected(a);
		d1_check.setSelected(a);
		d2_check.setSelected(a);
		d3_check.setSelected(a);
		d4_check.setSelected(a);
		d5_check.setSelected(a);
		f1_check.setSelected(a);
		f2_check.setSelected(a);
		f3_check.setSelected(a);
		f4_check.setSelected(a);
		f5_check.setSelected(a);
		c1_txt.setEditable(a);
		c2_txt.setEditable(a);
		c3_txt.setEditable(a);
		c4_txt.setEditable(a);
		c5_txt.setEditable(a);
		d1_txt.setEditable(a);
		d2_txt.setEditable(a);
		d3_txt.setEditable(a);
		d4_txt.setEditable(a);
		d5_txt.setEditable(a);
		f1_txt.setEditable(a);
		f2_txt.setEditable(a);
		f3_txt.setEditable(a);
		f4_txt.setEditable(a);
		f5_txt.setEditable(a);
	}
	public void reset()
	{
		Resetcheck(true,false);
		c1_txt.setText("0");
		c2_txt.setText("0");
		c3_txt.setText("0");
		c4_txt.setText("0");
		c5_txt.setText("0");
		d1_txt.setText("0");
		d2_txt.setText("0");
		d3_txt.setText("0");
		d4_txt.setText("0");
		d5_txt.setText("0");
		f1_txt.setText("0");
		f2_txt.setText("0");
		f3_txt.setText("0");
		f4_txt.setText("0");
		f5_txt.setText("0");
		netTotal_txt.setEditable(false);
		netTotal_txt.setText("0");
		subTotal_txt.setEditable(false);
		subTotal_txt.setText("0");
		vat_txt.setEditable(false);
		vat_txt.setText("0");
		result_txt.setEditable(false);
		//result_txt.setEnabled(false);
		print_btn.setEnabled(false);
	}
}
