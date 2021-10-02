import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class JComboBoxListener implements ActionListener
{
	DrawGUI x;
	
	JComboBoxListener(DrawGUI a)
		{
			x = a;
		}
		public void actionPerformed(ActionEvent e)
		{
		x.dataList.removeAllElements();	
		x.lstResults.setListData(x.dataList);
			if (x.radRadar.isSelected() == true)
			{ 
				for (int i = 0; i < x.rad[0].getCount(); i++)
				{
				Radar r = x.rad[i];
					if (x.cboRadar.getSelectedItem().equals (r.getModNum()))
					{
					x.dataList.addElement(r.getMagnetron());
					x.lstResults.setListData( x.dataList );
					}
				}
			}
			if (x.radMagnetron.isSelected() == true) 
			{
				for (int i = 0; i< x.rad[0].getCount(); i++)
				{
				Radar r = x.rad[i];
					if (x.cboMagnetron.getSelectedItem().equals(r.getMagnetron()))
					{
					x.dataList.addElement(r.getModNum()+ "     " + r.getManufacturer());
					}
				x.lstResults.setListData (x.dataList);
				}
			}
			
		}
}
	