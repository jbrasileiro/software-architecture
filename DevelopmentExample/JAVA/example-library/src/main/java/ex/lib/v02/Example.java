package ex.lib.v02;

import java.util.Locale;
import java.util.Objects;

public class Example {

    public String toStringLocale(
        final String input) {
        return "example+"
                .concat(Locale.getDefault().toString())
                .concat("+")
                .concat(Objects.toString(input));
    }
}
