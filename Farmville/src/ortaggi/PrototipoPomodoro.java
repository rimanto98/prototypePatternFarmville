package ortaggi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PrototipoPomodoro extends PrototipoOrtaggio{
	
	public PrototipoPomodoro() {
		caricaImmagine();
	}

	public PrototipoPomodoro(PrototipoPomodoro prototipoPomodoro) {
		this.img = prototipoPomodoro.img;
	}

	@Override
	public PrototipoOrtaggio clona() {
		
		return new PrototipoPomodoro(this);
	}
	
	public void caricaImmagine()
	{
		try {
			img = ImageIO.read(new File("immaginiOrtaggi" + File.separator  + "pomodoro.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
