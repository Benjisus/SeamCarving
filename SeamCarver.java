package seamCarver;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class SeamCarving {

	private BufferedImage image;
	private Component parentComponent;
	
	public SeamCarving() {
		image = null;
		this.parentComponent = parentComponent;
	}
	
	public void start()
	{
		chooseImage();
	}

	private void chooseImage()
	{
		final JFileChooser fileChooser = new JFileChooser();
		int returnState = fileChooser.showOpenDialog(parentComponent);
		File file = fileChooser.getSelectedFile();
		
		try
		{
			image = ImageIO.read(file);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
