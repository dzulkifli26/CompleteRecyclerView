package com.dzu.adidasbestcollection.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dzu.adidasbestcollection.R;
import com.dzu.adidasbestcollection.adapters.ItemListAdapter;
import com.dzu.adidasbestcollection.models.Adidas;
import com.dzu.adidasbestcollection.models.AdidasData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Adidas> list;

    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";

    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
//        list.addAll(AdidasData.getListData());
//        showRecyclerViewList();

        if (savedInstanceState == null) {
            setActionBarTitle("List Mode");
            list.addAll(AdidasData.getListData());
            showRecyclerViewList();
        }
    }

    // menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        String title = null;
        switch (itemId) {
            case R.id.about_us:
                Intent i = new Intent(this, AboutUs.class);
                startActivity(i);
        }
        mode = itemId;
    }


    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


    private void showRecyclerViewList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemListAdapter listAdapter = new ItemListAdapter(this);
        listAdapter.setListAdidas(list);
        recyclerView.setAdapter(listAdapter);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }
}
