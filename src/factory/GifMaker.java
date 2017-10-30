package factory;

public class GifMaker implements ImageFactory {

	@Override
	public Image createImage() {

		return new GifImage();
	}

}
