package com.eisha.android.cardstackview;

import android.view.View;

public interface CardStackListener {
    void onCardDragging(direction direction, float ratio);
    void onCardSwiped(direction direction);
    void onCardRewound();
    void onCardCanceled();
    void onCardAppeared(View view, int position);
    void onCardDisappeared(View view, int position);

    CardStackListener DEFAULT = new CardStackListener() {
        @Override
        public void onCardDragging(direction direction, float ratio) {}
        @Override
        public void onCardSwiped(direction direction) {}
        @Override
        public void onCardRewound() {}
        @Override
        public void onCardCanceled() {}
        @Override
        public void onCardAppeared(View view, int position) {}
        @Override
        public void onCardDisappeared(View view, int position) {}
    };
}
