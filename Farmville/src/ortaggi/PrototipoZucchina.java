package ortaggi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PrototipoZucchina extends PrototipoOrtaggio{
	
	public PrototipoZucchina() {
		caricaImmagine();
	}

	public PrototipoZucchina(PrototipoZucchina prototipoZucchina) {
		this.img = prototipoZucchina.img;
	}

	@Override
	public PrototipoOrtaggio clona() {
		
		return new PrototipoZucchina(this);
	}
	
	public void caricaImmagine()
	{
		try {
			img = ImageIO.read(new File("immaginiOrtaggi" + File.separator  + "zucchina.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
