package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class DutchFlag implements Flag{
	public List<Color> getColors(){
		return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
	}

}
