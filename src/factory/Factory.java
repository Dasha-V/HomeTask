package factory;

public class Factory {

	public static ImageFactory createNewImage(String maker) {
		if (maker.equals("gif")) {
			return new GifMaker();
		} else if (maker.equals("jpg")) {
			return new JpegMaker();
		}

		throw new RuntimeException("неподдерживаемый формат");

	}

}
