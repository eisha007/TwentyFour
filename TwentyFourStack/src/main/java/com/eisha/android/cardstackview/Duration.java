package com.eisha.android.cardstackview;

public enum Duration {
    Fast(50), Normal(100), Slow(200);

    public final int duration;

    Duration(int duration) {
        this.duration = duration;
    }

    public static Duration fromVelocity(int velocity) {
        if (velocity < 1000) {
            return Slow;
        } else if (velocity < 5000) {
            return Normal;
        }
        return Fast;
    }
}
