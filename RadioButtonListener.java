import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class RadioButtonListener implements ActionListener
{
	DrawGUI x;
	
	RadioButtonListener(DrawGUI a)
		{
			x = a;
		}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Magnetron Part Number"))
		{
			x.cboRadar.setEnabled(false);
			x.cboMagnetron.setEnabled(true);
		}
		
		if (e.getActionCommand().equals("Radar Model Number"))
		{
			x.cboMagnetron.setEnabled(false);
			x.cboRadar.setEnabled(true);
			
		}	
	}
}