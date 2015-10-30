package com.victor.m.eventregistrationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
/**
 *
 * @author victorgichohi
 *
 */
public class MainActivity extends Activity {
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set grid view item
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
        Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.personal);

        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"House"));
        gridArray.add(new Item(userIcon,"Friend"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"Personal"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"Building"));
        gridArray.add(new Item(userIcon,"User"));
        gridArray.add(new Item(homeIcon,"Home"));
        gridArray.add(new Item(userIcon,"xyz"));


        gridView = (GridView) findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position,
                                    long arg3) {
                Toast.makeText(getApplicationContext(),gridArray.get(position).getTitle(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}


//Read more: http://www.androidhub4you.com/2013/07/custom-grid-view-example-in-android.html#ixzz3q2lC3Wa4
