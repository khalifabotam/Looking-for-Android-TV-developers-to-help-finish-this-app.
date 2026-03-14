
package com.igiwaz.tv;

import android.view.ViewGroup;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;

public class CardPresenter extends Presenter {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        ImageCardView cardView = new ImageCardView(parent.getContext());
        cardView.setMainImageDimensions(313, 176);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        Movie movie = (Movie) item;
        ImageCardView cardView = (ImageCardView) viewHolder.view;
        cardView.setTitleText(movie.getTitle());
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {}
}
