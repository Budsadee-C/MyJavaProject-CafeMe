package myProject;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JCheckBox;

public class MyMainMenu extends JFrame implements gui {
	private int c_quan[]=new int[5];
	private int d_quan[]=new int[5];
	private int f_quan[]=new int[5];
	private int c_price[]= {55,75,105,85,45};
	private int d_price[]= {35,55,55,55,85};
	private int f_price[]= {75,200,250,185,115};
	
	private int total=0;
	private int list=0;
	private String keep[]=new String[15];
	private int keep_price[]=new int[15];
	private int keep_quan[]=new int[15];
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private JPanel contentPane = new JPanel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMainMenu frame = new MyMainMenu();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setInit()
	{
		Arrays.setAll(c_quan,i->0);
		Arrays.setAll(d_quan,i->0);
		Arrays.setAll(f_quan,i->0);
		Arrays.setAll(keep_price,i->0);
		Arrays.setAll(keep_quan,i->0);
		Arrays.setAll(keep,i->"");
		result_txt.setText("");
		total_btn.setEnabled(true);
		list=0;
		total=0;
	}
	public void setCatch(JTextField txt)
	{
		JOptionPane.showMessageDialog(null,"Error","Invalid input",JOptionPane.ERROR_MESSAGE);
		txt.setText("");
		list--;
		keep[list]="";
		keep_price[list]=0;
		keep_quan[list]=0;
		
	}
	public MyMainMenu() {
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nice\\eclipse-workspace\\MyProject\\image\\7e4ac9c442b9f0d9cd45670d9a0a50c7_coffee-png-transparent-free-images-png-only_862-1003.png"));
		setBackground(new Color(255, 245, 238));
		setTitle("Cafe@Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 913);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(banner_pannel);
		contentPane.add(panel);
		contentPane.add(result_txt);
		contentPane.add(tab1);
		contentPane.add(panel);
		contentPane.add(label_19);
		
		setInit();
		
		setGui set = new setGui();
		set.setAdd();
		set.setIcon();
		set.setBound();
		set.setAttribute();
		set.reset();
		
		total_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int coffee = (c_quan[0]*c_price[0])+(c_quan[1]*c_price[1])+(c_quan[2]*c_price[2])+(c_quan[3]*c_price[3])+(c_quan[4]*c_price[4]);
				int drink = (d_quan[0]*d_price[0])+(d_quan[1]*d_price[1])+(d_quan[2]*d_price[2])+(d_quan[3]*d_price[3])+(d_quan[4]*d_price[4]);
				int food = (f_quan[0]*f_price[0])+(f_quan[1]*f_price[1])+(f_quan[2]*f_price[2])+(f_quan[3]*f_price[3])+(f_quan[4]*f_price[4]);
				total =coffee+drink+food;
				subTotal_txt.setText(df.format(total));
				vat_txt.setText(df.format(total*0.12));
				netTotal_txt.setText(df.format(total+(total*0.12)));
				print_btn.setEnabled(true);
			}
		});
		print_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    Date dNow = new Date( );
			    SimpleDateFormat sm = new SimpleDateFormat ("E yyyy/MM/dd 'at' hh:mm:ss a");
				String show="\n     ***************************************\n";
				show+="\t\tCafe@home\n";
				show+="     ***************************************\n";
				show+="\t"+sm.format(dNow)+"\n";
				
				for(int i=0;i<list;i++)
				{
					show+="    No "+(i+1)+". "+keep[i]+"   \t"+keep_price[i]+" Baht*"+keep_quan[i]+"\n";
				}
				show+="\n\tAll "+list+" list	"+total+" Baht\n";
				show+="     \tVat(12%) "+df.format(total*0.12)+" Baht\n";
				show+="    \tNet Total "+df.format(total+(total*0.12))+" Baht\n";
				result_txt.setText(show);
				JOptionPane.showConfirmDialog(null,"Do you want to save this transaction?","Confirm to save in database",JOptionPane.YES_NO_OPTION);
				
				print_btn.setEnabled(false);
				total_btn.setEnabled(false);
				set.Resetcheck(false,false);
				
			}
		});
		reset_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setInit();
				set.reset();
				
			}
		});
		c1_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				set.setQuantity(c1_check,c1_txt);
			}
		});
		c2_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(c2_check,c2_txt);
			}
		});
		c3_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(c3_check,c3_txt);
			}
		});
		c4_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(c4_check,c4_txt);
			}
		});
		c1_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Latte Art";
					keep_price[list]=55;
					list++;
					c_quan[0] = Integer.parseInt(c1_txt.getText());
					keep_quan[list-1]=c_quan[0];
					
					
					
				}
				catch(NumberFormatException err)
				{
					setCatch(c1_txt);
				}
			}
		});
		c2_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Cappuccino";
					keep_price[list]=75;
					list++;
					c_quan[1] = Integer.parseInt(c2_txt.getText());
					keep_quan[list-1]=c_quan[1];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(c2_txt);
				}
			}
		});
		c3_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Americano";
					keep_price[list]=105;
					list++;
					c_quan[2] = Integer.parseInt(c3_txt.getText());
					keep_quan[list-1]=c_quan[2];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(c3_txt);
				}
			}
		});
		c4_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Cold Chocolate";
					keep_price[list]=85;
					list++;
					c_quan[3] = Integer.parseInt(c4_txt.getText());
					keep_quan[list-1]=c_quan[3];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(c4_txt);
				}
			}
		});
		c5_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Green Tea";
					keep_price[list]=45;
					list++;
					c_quan[4] = Integer.parseInt(c5_txt.getText());
					keep_quan[list-1]=c_quan[4];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(c5_txt);
				}
			}
		});
		c5_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(c5_check,c5_txt);
				
			}
		});
		d1_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(d1_check,d1_txt);
			}
		});
		d2_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(d2_check,d2_txt);
			}
		});
		d3_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(d3_check,d3_txt);
			}
		});
		d1_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Herbal Tea";
					keep_price[list]=35;
					list++;
					d_quan[0] = Integer.parseInt(d1_txt.getText());
					keep_quan[list-1]=d_quan[0];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(d1_txt);
				}
			}
		});
		d2_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Lemonade";
					keep_price[list]=55;
					list++;
					d_quan[1] = Integer.parseInt(d2_txt.getText());
					keep_quan[list-1]=d_quan[1];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(d2_txt);
				}
			}
		});
		d3_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Orange Juice";
					keep_price[list]=55;
					list++;
					d_quan[2] = Integer.parseInt(d3_txt.getText());
					keep_quan[list-1]=d_quan[2];
					
				}
				catch(NumberFormatException err)
				{
					setCatch(d3_txt);
				}
			}
		});
		d4_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(d4_check,d4_txt);
			}
		});
		d4_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Mocktail";
					keep_price[list]=55;
					list++;
					d_quan[3] = Integer.parseInt(d4_txt.getText());
					keep_quan[list-1]=d_quan[3];
				}
				catch(NumberFormatException err)
				{
					setCatch(d4_txt);
				}
			}
		});
		d5_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Punch";
					keep_price[list]=85;
					list++;
					d_quan[4] = Integer.parseInt(d5_txt.getText());
					keep_quan[list-1]=d_quan[4];
				}
				catch(NumberFormatException err)
				{
					setCatch(d5_txt);
				}
			}
		});
		d5_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(d5_check,d5_txt);
			}
		});
		f1_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Clam Chowder Spaghetti";
					keep_price[list]=75;
					list++;
					f_quan[0] = Integer.parseInt(f1_txt.getText());
					keep_quan[list-1]=f_quan[0];
				}
				catch(NumberFormatException err)
				{
					setCatch(f1_txt);
				}
			}
		});
		f2_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Tom Yam Krung";
					keep_price[list]=200;
					list++;
					f_quan[1] = Integer.parseInt(f2_txt.getText());
					keep_quan[list-1]=f_quan[1];

				}
				catch(NumberFormatException err)
				{
					setCatch(f2_txt);
				}
			}
		});
		f3_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Salmon Steak";
					keep_price[list]=250;
					list++;
					f_quan[2] = Integer.parseInt(f3_txt.getText());
					keep_quan[list-1]=f_quan[2];
				}
				catch(NumberFormatException err)
				{
					setCatch(f3_txt);
				}
			}
		});
		f4_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Breakfast Set";
					keep_price[list]=185;
					list++;
					f_quan[3] = Integer.parseInt(f4_txt.getText());
					keep_quan[list-1]=f_quan[3];
				}
				catch(NumberFormatException err)
				{
					setCatch(f4_txt);
				}
			}
		});
		f5_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					keep[list]="Spicy Pork Sausage";
					keep_price[list]=115;
					list++;
					f_quan[4] = Integer.parseInt(f5_txt.getText());
					keep_quan[list-1]=f_quan[4];
				}
				catch(NumberFormatException err)
				{
					setCatch(f5_txt);
				}
			}
		});
		f1_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(f1_check,f1_txt);
			}
		});
		f2_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(f2_check,f2_txt);
			}
		});
		f3_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				set.setQuantity(f3_check,f3_txt);
			}
		});
		f4_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(f4_check,f4_txt);
			}
		});
		f5_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.setQuantity(f5_check,f5_txt);
			}
		});
	}
}
