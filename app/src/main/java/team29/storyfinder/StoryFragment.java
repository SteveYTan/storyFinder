package team29.storyfinder;

/**
 * Created by Leca on 11/30/16.
 */

import android.app.Fragment;
        import android.os.Bundle;
        import android.support.v7.widget.CardView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

public class StoryFragment extends Fragment {

    CardView mCardView;

    public static StoryFragment newInstance() {
        StoryFragment fragment = new StoryFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }

    public StoryFragment() {
        // singleton
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.card_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mCardView = (CardView) view.findViewById(R.id.card_view);
    }
}