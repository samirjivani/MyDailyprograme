
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ItemListener 
{
	MyFrame mf;
	
	MyActionListener(MyFrame m){
		this.mf = m;
	}
	
	public void itemStateChanged(ItemEvent e)//from javadocx
	{
		if(e.getStateChange()==e.SELECTED)
		{
			System.out.println(e.getItem().toString()+"IS SELECTED");
		}
		else
		{
			System.out.println(e.getItem().toString()+"IS  not SELECTED");
		}
	}
}