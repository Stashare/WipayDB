package ke.co.stashare.wipaydb;

/**
 * Created by Ken Wainaina on 27/03/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import ke.co.stashare.wipaydb.Adapter.ElementsAdapter;
import ke.co.stashare.wipaydb.Models.Elements;

public class MainLoadMore extends AppCompatActivity implements ElementsAdapter.Callbacks{

    private List<Elements> mainList = new ArrayList<>();
    private List<Elements> dummyList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ElementsAdapter elementsAdapter;
    DividerItemDecoration mDividerItemDecoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_more);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(llm);

        mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                llm.getOrientation());
        recyclerView.addItemDecoration(mDividerItemDecoration);


        // added all elements to main list
        for(int i = 0; i<3; ++i) {
            Elements elements = new Elements();
            elements.setIcon(R.mipmap.ic_launcher);
            elements.setName("Element "+i);

            mainList.add(elements);
        }

        // now only add number of elements for the first show i.e. 6
        for(int i = 0; i<1; ++i) {
            dummyList.add(mainList.get(i));
        }

        elementsAdapter = new ElementsAdapter(dummyList);
        elementsAdapter.setCallback(this);
        elementsAdapter.setWithFooter(true); //enabling footer to show
        recyclerView.setAdapter(elementsAdapter);

    }

    @Override
    public void onClickLoadMore() {
        elementsAdapter.setWithFooter(false); // hide footer

        // now add remaining elements
        for(int i = 1; i<mainList.size(); ++i) {
            dummyList.add(mainList.get(i));
        }

        elementsAdapter.notifyDataSetChanged(); // more elements will be added
    }
}

