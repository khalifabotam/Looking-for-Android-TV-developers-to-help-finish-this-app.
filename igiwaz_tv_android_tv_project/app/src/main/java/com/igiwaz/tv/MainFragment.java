
package com.igiwaz.tv;

import android.os.Bundle;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;

public class MainFragment extends BrowseSupportFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setTitle("Igiwaz TV");

        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(new CardPresenter());

        listRowAdapter.add(new Movie("Film 1"));
        listRowAdapter.add(new Movie("Film 2"));
        listRowAdapter.add(new Movie("Film 3"));

        HeaderItem header = new HeaderItem(0, "Films populaires");
        rowsAdapter.add(new ListRow(header, listRowAdapter));

        setAdapter(rowsAdapter);
    }
}
