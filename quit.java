import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

public class Quit implements Action 
{

	public void actionPerformed(ActionEvent e) 
	{
	System.exit(0);
	}

	public void addPropertyChangeListener(PropertyChangeListener arg0) 
	{

	}

	public Object getValue(String arg0) 
	{
		return null;
	}

	public boolean isEnabled() 
	{
		return false;
	}

	public void putValue(String arg0, Object arg1) 
	{

	}

	public void removePropertyChangeListener(PropertyChangeListener arg0) 
	{
	
	}

	public void setEnabled(boolean arg0) 
	{
	
	}

}
