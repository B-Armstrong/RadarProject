import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

class DrawRadarGUI extends JFrame
{
	JLabel lblTitle = new JLabel
		("Select by Magnetron or Radar.",JLabel.LEFT);
	JRadioButton radMagnetron = new JRadioButton
		("Magnetron Part Number",false);
	JRadioButton radRadar = new JRadioButton
		("Radar Model Number",false);
	JList lstResults = new JList();
	
	ButtonGroup radioGroup = new ButtonGroup();
	
	JComboBox cboMagnetron = new JComboBox();
	JComboBox cboRadar = new JComboBox();
	
	JComboBoxListener cbListener = new JComboBoxListener(this);	
	RadioButtonListener rbListener = new RadioButtonListener(this);
	FrameListener fListener = new FrameListener();
		
	DrawRadarGUI()
	{
		Container c = getContentPane();
		c.setLayout(null);
		 
		c.add(lblTitle);
		c.add(radMagnetron);
		c.add(radRadar);
		c.add(lstResults);
		c.add(cboMagnetron);
		c.add(cboRadar);
		
		radioGroup.add(radMagnetron);
		radioGroup.add(radRadar);
		
		radMagnetron.addActionListener(rbListener);
		radRadar.addActionListener(rbListener);
		this.addWindowListener(fListener);
		
		lblTitle.setBounds(125,00,300,30);
		radMagnetron.setBounds(25,30,175,30);
		radRadar.setBounds(275,30,175,30);
		lstResults.setBounds(25,110,425,265);
		cboMagnetron.setBounds(25,75,175,20);
		cboRadar.setBounds(275,75,175,20);
		
		lblTitle.setForeground(Color.BLUE);
		cboMagnetron.setBackground(Color.WHITE);
		cboRadar.setBackground(Color.WHITE);
		lstResults.setLayoutOrientation(2);
		
		setLocation(250,200);
		setSize(480,410);
		setTitle("Magnetron Reference");
		setVisible(true);
		setResizable(false);
		
		
	}				
	
	
}
