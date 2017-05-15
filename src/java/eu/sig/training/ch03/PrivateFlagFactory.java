package eu.sig.training.ch03;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrivateFlagFactory {
	private static final Map<Nationality, Flag> FLAGS = new HashMap<Nationality, Flag>();
	
	static{
		FLAGS.put(Nationality.DUTCH, new DutchFlag());
	}
	
	public List<Color> getFlagColors(Nationality nationality){
		Flag flag = FLAGS.get(nationality);
		flag = flag != null? flag : new DefaultFlag();
		return flag.getColors();
	}
}
