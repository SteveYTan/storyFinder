package team29.storyfinder.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import team29.storyfinder.R;
import team29.storyfinder.StoryFragment;

public class storyActivity extends AppCompatActivity {


    private RecyclerView recView;
   // private myAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.activity_story, StoryFragment.newInstance())
                    .commit();
        }
    }
}