import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
	public int[] pixels;
	private String loc;
	public final int SIZE;
	
	public Texture(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Texture exit = new Texture("textures/exit.png", 64);
	public static Texture nobooty = new Texture("textures/nobooty.png", 64);
	public static Texture fewbooty = new Texture("textures/fewbooty.png", 64);
	public static Texture somebooty = new Texture("textures/somebooty.png", 64);
	public static Texture muchbooty = new Texture("textures/muchbooty.png", 64);
    public static Texture booty = new Texture("textures/booty.png", 64);
}