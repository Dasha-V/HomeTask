package factory;

public class JpegMaker implements ImageFactory {

	@Override
	public Image createImage() {

		return new JpegImage();
	}

}
