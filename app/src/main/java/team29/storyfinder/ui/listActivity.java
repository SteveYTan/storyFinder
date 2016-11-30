package team29.storyfinder.ui;

/**
 * Created by Leca on 11/30/16.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import team29.storyfinder.adapters.DerpAdapter;
import team29.storyfinder.models.DerpData;
import team29.storyfinder.R;
import team29.storyfinder.models.listItem;

import android.support.v7.widget.LinearLayoutManager;
import java.util.ArrayList;

public class listActivity extends AppCompatActivity implements DerpAdapter.ItemClickCallback{
    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE = "EXTRA_QUOTE";
    private static final String EXTRA_ATTR = "EXTRA_ATTR";

    private RecyclerView recView;
    private DerpAdapter adapter;
    private ArrayList listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listData = (ArrayList) DerpData.getListData();

        recView = (RecyclerView) findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DerpAdapter(DerpData.getListData(), this);
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);
    }

    @Override
    public void onItemClick(int p) {
        listItem item = (listItem) listData.get(p);

        Intent i = new Intent(this, detailActivity.class);

        Bundle extras = new Bundle();
        extras.putString(EXTRA_QUOTE, item.getTitle());
        extras.putString(EXTRA_ATTR, item.getDescription());
        i.putExtra(BUNDLE_EXTRAS, extras);

        startActivity(i);
    }

}