package myProject;

import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;
public class report {

	private JFrame frame;
	private JTable table;
	private Object data[][]={ {"101","Amit","670000"},    
            {"102","Jai","780000"},    
            {"101","Sachin","700000"}};    
	private String column[]={"No","List","Total"};   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					report window = new report();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public report() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
  
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(100, 100, 629, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(725,555);
		
		DefaultTableModel model = new DefaultTableModel(data, column);
		frame.getContentPane().setLayout(null);
		table = new JTable(model);
		table.setBounds(112, 354, 357, 286);
		JScrollPane scroll=new JScrollPane(table); 
		scroll.setBounds(15, 88, 673, 395);
		scroll.setBorder(BorderFactory.createEmptyBorder()); //How to remove the border of JScrollPane.
		scroll.setPreferredSize(new Dimension(350, 180));
		frame.getContentPane().add(scroll);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(120, 29, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0E23\u0E32\u0E22\u0E07\u0E32\u0E19\u0E15\u0E48\u0E32\u0E07\u0E46 \u0E41\u0E15\u0E48\u0E25\u0E30\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23", "\u0E23\u0E32\u0E22\u0E07\u0E32\u0E19\u0E01\u0E32\u0E23\u0E02\u0E32\u0E22\u0E1B\u0E23\u0E30\u0E08\u0E33\u0E1B\u0E35", "\u0E23\u0E32\u0E22\u0E07\u0E32\u0E19\u0E01\u0E32\u0E23\u0E02\u0E32\u0E22\u0E1B\u0E23\u0E30\u0E08\u0E33\u0E40\u0E14\u0E37\u0E2D\u0E19"}));
		comboBox.setBounds(249, 26, 184, 26);
		frame.getContentPane().add(comboBox);
		
	   // frame.getContentPane().add(scroll);          
		//frame.getContentPane().add(table);
        
	}
}
