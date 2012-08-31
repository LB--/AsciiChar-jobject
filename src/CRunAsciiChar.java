//import Services.CFontInfo;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import Extensions.*;
import Services.*;
import RunLoop.*;
//import Expressions.*;
import Sprites.*;
import Conditions.*;
import Actions.*;
import Expressions.*;
//import Objects.*;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;

public class CRunAsciiChar extends CRunExtension
{
	public CRunAsciiChar()
	{
	}
	@Override public int getNumberOfConditions()
	{
		return 0;
	}
	@Override public boolean createRunObject(CBinaryFile file, CCreateObjectInfo cob, int version)
	{
		return true;
	}
	@Override public void destroyRunObject(boolean bFast)
	{
	}
	@Override public int handleRunObject()
	{
		return REFLAG_ONESHOT;
	}
	@Override public void displayRunObject(Graphics2D g2)
	{
	}
	@Override public void pauseRunObject()
	{
	}
	@Override public void continueRunObject()
	{
	}
	@Override public boolean saveRunObject(DataOutputStream stream)
	{
		return true;
	}
	@Override public boolean loadRunObject(DataInputStream stream)
	{
		return true;
	}
	@Override public void saveBackground(BufferedImage img)
	{
	}
	@Override public void restoreBackground(Graphics2D g)
	{
	}
	@Override public void killBackground()
	{
	}
	@Override public CFontInfo getRunObjectFont()
	{
		return null;
	}
	@Override public void setRunObjectFont(CFontInfo fi, CRect rc)
	{
	}
	@Override public int getRunObjectTextColor()
	{
		return 0;
	}
	@Override public void setRunObjectTextColor(int rgb)
	{
	}
	@Override public CMask getRunObjectCollisionMask(int flags)
	{
		return null;
	}
	@Override public BufferedImage getRunObjectSurface()
	{
		return null;
	}
	@Override public void getZoneInfos()
	{
	}

	// Conditions
	// --------------------------------------------------
	@Override public boolean condition(int num, CCndExtension cnd)
	{
		return false;
	}

	// Actions
	// -------------------------------------------------
	@Override public void action(int num, CActExtension act)
	{
	}

	// Expressions
	// --------------------------------------------
	@Override public CValue expression(int num)
	{
		CValue param = ho.getExpParam();
		switch(num)
		{
		case 0:	return new CValue((int)param.getString().charAt(0));
		case 1:	return new CValue(""+(char)param.getInt());
		}
		return null;
	}
}
