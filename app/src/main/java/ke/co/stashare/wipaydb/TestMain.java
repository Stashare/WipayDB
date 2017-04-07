package ke.co.stashare.wipaydb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import ke.co.stashare.wipaydb.Adapter.ElementsAdapter;
import ke.co.stashare.wipaydb.Models.Elements;

/**
 * Created by Ken Wainaina on 28/03/2017.
 */

public class TestMain extends AppCompatActivity {

    private List<Elements> mainList = new ArrayList<>();

    private RecyclerView recyclerView;
    private ElementsAdapter elementsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        int columns = 2;
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this, columns);

        recyclerView.addItemDecoration(new GridDividerDecoration(this));
        recyclerView.setLayoutManager(gridLayoutManager);

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return elementsAdapter.isPositionFooter(position) ? gridLayoutManager.getSpanCount() : 1;
            }
        });

    }

    **/
    }
}
