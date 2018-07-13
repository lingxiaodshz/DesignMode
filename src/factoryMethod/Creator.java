package factoryMethod;

import sun.font.CreatedFontTracker;

public abstract class Creator {
	public abstract <T extends Product> T create(Class<T> clazz);
}
