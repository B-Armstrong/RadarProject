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
			System.out.print(x.cboRadar.getSelectedItem());
			if (x.cboRadar.getSelectedItem().equals ("1720"))
			{
				x.dataList.removeAllElements();
				x.dataList.addElement( "9M302" );
				x.lstResults.setListData( x.dataList );
				
			}

				
		}
}
	