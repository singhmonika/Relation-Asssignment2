package com.almanac.demo.relation;

import android.app.ListActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class MainActivity extends ListActivity {

    String[] names = {"Mr.Cool Dad", "Mrs.Lovely Mom", "Mr.Handsome Bro", "Ms.Caring Di", "Mr.Rocking Dadu", "Mrs.Cutie Dadi"};
    String[] realations = {"Dad", "Mom", "Brother", "Sister", "Grandpa", "Grandma"};
    Integer[] ImageIds = {R.drawable.father, R.drawable.mom, R.drawable.bro, R.drawable.sister, R.drawable.grandpa, R.drawable.grandma};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomizedList adptr = new CustomizedList(this,names,realations, ImageIds);
        setListAdapter(adptr);


}
}
