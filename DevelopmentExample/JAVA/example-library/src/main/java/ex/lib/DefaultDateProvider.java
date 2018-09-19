package ex.lib;

import java.util.Date;

public final class DefaultDateProvider
    implements
    DateProvider {

    @Override
    public Date now() {
        return new Date();
    }
}
