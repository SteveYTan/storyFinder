package team29.storyfinder.ui;

/**
 * Created by Leca on 11/30/16.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import team29.storyfinder.adapters.DerpAdapter;
import team29.storyfinder.models.DerpData;
import team29.storyfinder.R;
import android.support.v7.widget.LinearLayoutManager;

public class listActivity extends AppCompatActivity {

    private RecyclerView recView;
    private DerpAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recView = (RecyclerView) findViewById(R.id.rec_list);
        //Check out GridLayoutManager and StaggeredGridLayoutManager for more options
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DerpAdapter(DerpData.getListData(), this);
        recView.setAdapter(adapter);
    }

}