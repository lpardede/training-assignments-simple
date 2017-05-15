package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class GeneralFlag {
    private final List<Color> colors;

    public GeneralFlag(Color... colors) {
        this.colors = Arrays.asList(colors);
    }

    public List<Color> getColors() {
        return colors;
    }
}