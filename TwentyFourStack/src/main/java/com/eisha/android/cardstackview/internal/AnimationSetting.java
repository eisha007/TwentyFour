package com.eisha.android.cardstackview.internal;

import android.view.animation.Interpolator;

import com.eisha.android.cardstackview.direction;

public interface AnimationSetting {
    direction getDirection();
    int getDuration();
    Interpolator getInterpolator();
}
