package ortaggi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PrototipoCipolla extends PrototipoOrtaggio{
	
	public PrototipoCipolla() {
		caricaImmagine();
	}

	public PrototipoCipolla(PrototipoCipolla prototipoCipolla) {
		this.img = prototipoCipolla.img;
	}

	@Override
	public PrototipoOrtaggio clona() {
		
		return new PrototipoCipolla(this);
	}
	
	public void caricaImmagine()
	{
		try {
			img = ImageIO.read(new File("immaginiOrtaggi" + File.separator  + "cipolla.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
