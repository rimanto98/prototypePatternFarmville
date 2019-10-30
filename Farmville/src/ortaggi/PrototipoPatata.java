package ortaggi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PrototipoPatata extends PrototipoOrtaggio{
	
	public PrototipoPatata() {
		caricaImmagine();
	}

	public PrototipoPatata(PrototipoPatata prototipoPatata) {
		this.img = prototipoPatata.img;
	}

	@Override
	public PrototipoOrtaggio clona() {
		
		return new PrototipoPatata(this);
	}
	
	public void caricaImmagine()
	{
		try {
			img = ImageIO.read(new File("immaginiOrtaggi" + File.separator  + "potato.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
