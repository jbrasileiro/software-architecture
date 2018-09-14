package ex.lib.v01;

import java.util.Objects;

public class Example {

    public String example(
        final Object value) {
        return "example+".concat(Objects.toString(value));
    }
}
