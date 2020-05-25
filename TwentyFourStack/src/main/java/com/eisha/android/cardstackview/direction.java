package com.eisha.android.cardstackview;

import java.util.Arrays;
import java.util.List;

public enum direction {
    Left, Right, Top, Bottom;

    public static final List<direction> HORIZONTAL = Arrays.asList(direction.Left, direction.Right);
    public static final List<direction> VERTICAL = Arrays.asList(direction.Top, direction.Bottom);
    public static final List<direction> FREEDOM = Arrays.asList(direction.values());
}
