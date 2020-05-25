package com.eisha.android.cardstackview;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

import com.eisha.android.cardstackview.internal.AnimationSetting;

public class SwipeAnimationSetting implements AnimationSetting {

    private final com.eisha.android.cardstackview.direction direction;
    private final int duration;
    private final Interpolator interpolator;

    private SwipeAnimationSetting(
            com.eisha.android.cardstackview.direction direction,
            int duration,
            Interpolator interpolator
    ) {
        this.direction = direction;
        this.duration = duration;
        this.interpolator = interpolator;
    }

    @Override
    public com.eisha.android.cardstackview.direction getDirection() {
        return direction;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public Interpolator getInterpolator() {
        return interpolator;
    }

    public static class Builder {
        private com.eisha.android.cardstackview.direction direction = com.eisha.android.cardstackview.direction.Right;
        private int duration = Duration.Normal.duration;
        private Interpolator interpolator = new AccelerateInterpolator();

        public Builder setDirection(com.eisha.android.cardstackview.direction direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setInterpolator(Interpolator interpolator) {
            this.interpolator = interpolator;
            return this;
        }

        public SwipeAnimationSetting build() {
            return new SwipeAnimationSetting(
                    direction,
                    duration,
                    interpolator
            );
        }
    }

}
