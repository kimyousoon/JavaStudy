package ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class imageDownloader {
	public static void main(String[] args) {
		// Shift + Ctrl + o(¾ËÆÄºª) : ÀüÃ¼ import

		File outputFile = new File("c:/dev/test.jpg");

		URL url = null;
		BufferedImage bi = null;

		try {
			url = new URL(
					"http://img.insight.co.kr/static/2018/03/26/700/mf7zvffpgp0lmz9b6512.jpg");
			bi = ImageIO.read(url);
			ImageIO.write(bi, "png", outputFile);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
