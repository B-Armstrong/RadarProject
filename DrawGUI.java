import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;



class DrawGUI extends JFrame 
{
Vector dataList = new Vector();

	JLabel lblTitle = new JLabel
		("Select by Magnetron or Radar.",JLabel.LEFT);
	JRadioButton radMagnetron = new JRadioButton
		("Magnetron Part Number",false);
	JRadioButton radRadar = new JRadioButton
		("Radar Model Number",true);
	
	JList lstResults = new JList(dataList);
			
	ButtonGroup radioGroup = new ButtonGroup();
	
	JComboBox cboMagnetron = new JComboBox();
	JComboBox cboRadar = new JComboBox();
	
	JComboBoxListener cboListener = new JComboBoxListener(this);
	RadioButtonListener rbListener = new RadioButtonListener(this);
	FrameListener fListener = new FrameListener();
	
				
	DrawGUI() throws IOException
	{
		int x = 0;		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.add(lblTitle);
		c.add(radMagnetron);
		c.add(radRadar);
		c.add(lstResults);
		c.add(cboMagnetron);
		c.add(cboRadar);
		cboMagnetron.setEnabled(false);
		cboRadar.setEnabled(true);
		Open.openFile("Magnetrons.dat");
		Item = Open.getData(); 
		StringTokenizer m = new StringTokenizer(Item, ":");
		while(m.hasMoreTokens()==true)
		{
			cboMagnetron.addItem(m.nextToken());		
		}
		Open.openFile("Radar.dat");
		Item = Open.getData();
		StringTokenizer r = new StringTokenizer(Item, ":");
		
		while(r.hasMoreTokens()==true)
		{	
			cboRadar.addItem(r.nextToken());
		}
		Open.openFile("Data.dat");
		Item = Open.getData();
		StringTokenizer	d = new StringTokenizer(Item, "|");
		StringTokenizer e = new StringTokenizer(Item, ";");
		
		while (d.hasMoreTokens() == true)
		{
		fix = e.nextToken();
		manufacturer = fix.substring(1);
		model = e.nextToken();
		magnetron = e.nextToken();
		rad[x] = new Radar(manufacturer, model, magnetron);
		x += 1;
		d.nextToken();
		}		
		rad[0].setCount(x);
		radioGroup.add(radMagnetron);
		radioGroup.add(radRadar);
		cboMagnetron.addActionListener(cboListener);
		cboRadar.addActionListener(cboListener);			
		radMagnetron.addActionListener(rbListener);
		radRadar.addActionListener(rbListener);
		this.addWindowListener(fListener);
		lstResults.setListData(dataList);
		lblTitle.setBounds(125,00,300,30);
		radMagnetron.setBounds(25,30,175,30);
		radRadar.setBounds(275,30,175,30);
		lstResults.setBounds(25,110,425,265);
		cboMagnetron.setBounds(25,75,175,20);
		cboRadar.setBounds(275,75,175,20);
		
		lblTitle.setForeground(Color.BLUE);
		cboMagnetron.setBackground(Color.WHITE);
		cboRadar.setBackground(Color.WHITE);
		lstResults.setSelectionMode(2);
		
		setLocation(250,200);
		setSize(480,410);
		setTitle("Magnetron Reference");
		setVisible(true);
		setResizable(false);
	}
private String fix;
private String manufacturer;
private String model;
private String magnetron;
private String Item;

Radar[] rad = new Radar[150];

}	

		
		
		
	

