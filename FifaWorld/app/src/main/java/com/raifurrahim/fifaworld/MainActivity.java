package com.raifurrahim.fifaworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.raifurrahim.fifaworld.Adapter.FlagAdapter;
import com.raifurrahim.fifaworld.Details.DetailsActivity;
import com.raifurrahim.fifaworld.View.Flag;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private FlagAdapter flagAdapter;
    private String[]description;
    private String[]name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.emptyView);
         Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        listView = findViewById(R.id.listView);
        final ArrayList<Flag>arrayList = new ArrayList<>();


        description = getResources().getStringArray(R.array.item_description);
        name = getResources().getStringArray(R.array.item_name);

        arrayList.add(new Flag(R.drawable.abkhazia,name[0],description[0]));
        arrayList.add(new Flag(R.drawable.afghanistan,name[1],description[1]));
        arrayList.add(new Flag(R.drawable.albania,name[2],description[2]));
        arrayList.add(new Flag(R.drawable.algeria,name[3],description[3]));
        arrayList.add(new Flag(R.drawable.angola,name[4],description[4]));
        arrayList.add(new Flag(R.drawable.argentina,name[5],description[0]));
        arrayList.add(new Flag(R.drawable.armenia,name[6],description[1]));
        arrayList.add(new Flag(R.drawable.aruba,name[7],description[2]));
        arrayList.add(new Flag(R.drawable.australia,name[8],description[3]));
        arrayList.add(new Flag(R.drawable.austria,name[9],description[4]));
        arrayList.add(new Flag(R.drawable.azerbaijan,name[10],description[0]));
        arrayList.add(new Flag(R.drawable.bahrain,name[11],description[1]));
        arrayList.add(new Flag(R.drawable.bangladesh,name[12],description[2]));
        arrayList.add(new Flag(R.drawable.barbados,name[13],description[3]));
        arrayList.add(new Flag(R.drawable.belarus,name[14],description[4]));
        arrayList.add(new Flag(R.drawable.belgium,name[15],description[0]));
        arrayList.add(new Flag(R.drawable.bhutan,name[16],description[1]));
        arrayList.add(new Flag(R.drawable.bolivia,name[17],description[2]));
        arrayList.add(new Flag(R.drawable.bosnia_and_herzegovina,name[18],description[3]));
        arrayList.add(new Flag(R.drawable.botswana,name[19],description[4]));
        arrayList.add(new Flag(R.drawable.brazil,name[20],description[0]));
        arrayList.add(new Flag(R.drawable.brunei,name[21],description[1]));
        arrayList.add(new Flag(R.drawable.bulgaria,name[22],description[2]));
        arrayList.add(new Flag(R.drawable.burundi,name[23],description[3]));
        arrayList.add(new Flag(R.drawable.cambodia,name[24],description[4]));
        arrayList.add(new Flag(R.drawable.cameroon,name[25],description[0]));
        arrayList.add(new Flag(R.drawable.canada,name[26],description[1]));
        arrayList.add(new Flag(R.drawable.chile,name[27],description[2]));
        arrayList.add(new Flag(R.drawable.china,name[28],description[3]));
        arrayList.add(new Flag(R.drawable.colombia,name[29],description[4]));
        arrayList.add(new Flag(R.drawable.comoros,name[30],description[0]));
        arrayList.add(new Flag(R.drawable.croatia,name[31],description[1]));
        arrayList.add(new Flag(R.drawable.cuba,name[32],description[2]));
        arrayList.add(new Flag(R.drawable.cyprus,name[33],description[3]));
        arrayList.add(new Flag(R.drawable.czech_republic,name[34],description[4]));

        arrayList.add(new Flag(R.drawable.denmark,name[35],description[0]));
        arrayList.add(new Flag(R.drawable.dominica,name[36],description[1]));

        arrayList.add(new Flag(R.drawable.ecuador,name[37],description[2]));
        arrayList.add(new Flag(R.drawable.egypt,name[38],description[3]));
        arrayList.add(new Flag(R.drawable.england,name[39],description[4]));
        arrayList.add(new Flag(R.drawable.estonia,name[40],description[0]));
        arrayList.add(new Flag(R.drawable.ethiopia,name[41],description[1]));

        arrayList.add(new Flag(R.drawable.fiji,name[42],description[2]));
        arrayList.add(new Flag(R.drawable.finland,name[43],description[3]));
        arrayList.add(new Flag(R.drawable.france,name[44],description[4]));

        arrayList.add(new Flag(R.drawable.gambia,name[45],description[0]));
        arrayList.add(new Flag(R.drawable.germany,name[46],description[1]));
        arrayList.add(new Flag(R.drawable.ghana,name[47],description[2]));
        arrayList.add(new Flag(R.drawable.greece,name[48],description[3]));
        arrayList.add(new Flag(R.drawable.greenland,name[49],description[4]));
        arrayList.add(new Flag(R.drawable.grenada,name[50],description[0]));
        arrayList.add(new Flag(R.drawable.guatemala,name[51],description[1]));
        arrayList.add(new Flag(R.drawable.guyana,name[52],description[2]));

        arrayList.add(new Flag(R.drawable.haiti,name[53],description[3]));
        arrayList.add(new Flag(R.drawable.hawaii,name[54],description[4]));
        arrayList.add(new Flag(R.drawable.honduras,name[55],description[0]));
        arrayList.add(new Flag(R.drawable.hong_kong,name[56],description[1]));
        arrayList.add(new Flag(R.drawable.hungary,name[57],description[2]));

        arrayList.add(new Flag(R.drawable.iceland,name[58],description[3]));
        arrayList.add(new Flag(R.drawable.india,name[59],description[4]));
        arrayList.add(new Flag(R.drawable.indonesia,name[60],description[0]));
        arrayList.add(new Flag(R.drawable.iran,name[61],description[1]));
        arrayList.add(new Flag(R.drawable.iraq,name[62],description[2]));
        arrayList.add(new Flag(R.drawable.ireland,name[63],description[3]));
        arrayList.add(new Flag(R.drawable.italy,name[64],description[4]));
        arrayList.add(new Flag(R.drawable.ivory_coast,name[65],description[0]));

        arrayList.add(new Flag(R.drawable.jamaica,name[66],description[1]));
        arrayList.add(new Flag(R.drawable.japan,name[67],description[2]));
        arrayList.add(new Flag(R.drawable.jordan,name[68],description[3]));

        arrayList.add(new Flag(R.drawable.kenya,name[69],description[4]));
        arrayList.add(new Flag(R.drawable.kiribati,name[70],description[0]));
        arrayList.add(new Flag(R.drawable.kuwait,name[71],description[1]));
        arrayList.add(new Flag(R.drawable.kyrgyzstan,name[72],description[2]));

        arrayList.add(new Flag(R.drawable.laos,name[73],description[3]));
        arrayList.add(new Flag(R.drawable.latvia,name[74],description[4]));
        arrayList.add(new Flag(R.drawable.lebanon,name[75],description[0]));
        arrayList.add(new Flag(R.drawable.liberia,name[76],description[1]));
        arrayList.add(new Flag(R.drawable.libya,name[77],description[2]));
        arrayList.add(new Flag(R.drawable.lithuania,name[78],description[3]));

        arrayList.add(new Flag(R.drawable.madagascar,name[79],description[4]));
        arrayList.add(new Flag(R.drawable.malawi,name[80],description[0]));
        arrayList.add(new Flag(R.drawable.malaysia,name[81],description[1]));
        arrayList.add(new Flag(R.drawable.maldives,name[82],description[2]));
        arrayList.add(new Flag(R.drawable.mali,name[83],description[3]));
        arrayList.add(new Flag(R.drawable.malta,name[84],description[4]));
        arrayList.add(new Flag(R.drawable.mexico,name[85],description[0]));
        arrayList.add(new Flag(R.drawable.monaco,name[86],description[1]));
        arrayList.add(new Flag(R.drawable.mongolia,name[87],description[2]));
        arrayList.add(new Flag(R.drawable.morocco,name[88],description[3]));
        arrayList.add(new Flag(R.drawable.myanmar,name[89],description[4]));

        arrayList.add(new Flag(R.drawable.namibia,name[90],description[0]));
        arrayList.add(new Flag(R.drawable.nepal,name[91],description[1]));
        arrayList.add(new Flag(R.drawable.netherlands,name[92],description[2]));
        arrayList.add(new Flag(R.drawable.new_zealand,name[93],description[3]));
        arrayList.add(new Flag(R.drawable.niger,name[94],description[4]));
        arrayList.add(new Flag(R.drawable.nigeria,name[95],description[0]));
        arrayList.add(new Flag(R.drawable.north_korea,name[96],description[1]));
        arrayList.add(new Flag(R.drawable.norway,name[97],description[2]));

        arrayList.add(new Flag(R.drawable.oman,name[98],description[3]));
        arrayList.add(new Flag(R.drawable.ossetia,name[99],description[4]));

        arrayList.add(new Flag(R.drawable.pakistan,name[100],description[0]));
        arrayList.add(new Flag(R.drawable.palau,name[101],description[1]));
        arrayList.add(new Flag(R.drawable.palestine,name[102],description[2]));
        arrayList.add(new Flag(R.drawable.panama,name[103],description[3]));
        arrayList.add(new Flag(R.drawable.paraguay,name[104],description[4]));
        arrayList.add(new Flag(R.drawable.peru,name[105],description[0]));
        arrayList.add(new Flag(R.drawable.philippines,name[106],description[1]));
        arrayList.add(new Flag(R.drawable.portugal,name[107],description[2]));

        arrayList.add(new Flag(R.drawable.qatar,name[108],description[3]));

        arrayList.add(new Flag(R.drawable.romania,name[109],description[4]));
        arrayList.add(new Flag(R.drawable.russia,name[110],description[0]));
        arrayList.add(new Flag(R.drawable.rwanda,name[111],description[1]));

        arrayList.add(new Flag(R.drawable.salvador,name[112],description[2]));
        arrayList.add(new Flag(R.drawable.samoa,name[113],description[3]));
        arrayList.add(new Flag(R.drawable.saudi_arabia,name[114],description[4]));
        arrayList.add(new Flag(R.drawable.scotland,name[115],description[0]));
        arrayList.add(new Flag(R.drawable.senegal,name[116],description[1]));
        arrayList.add(new Flag(R.drawable.serbia,name[117],description[2]));
        arrayList.add(new Flag(R.drawable.seychelles,name[118],description[3]));
        arrayList.add(new Flag(R.drawable.singapore,name[119],description[4]));
        arrayList.add(new Flag(R.drawable.slovakia,name[120],description[0]));
        arrayList.add(new Flag(R.drawable.slovenia,name[121],description[1]));
        arrayList.add(new Flag(R.drawable.somalia,name[122],description[2]));
        arrayList.add(new Flag(R.drawable.south_africa,name[123],description[3]));
        arrayList.add(new Flag(R.drawable.south_korea,name[124],description[4]));
        arrayList.add(new Flag(R.drawable.south_sudan,name[125],description[0]));
        arrayList.add(new Flag(R.drawable.spain,name[126],description[1]));
        arrayList.add(new Flag(R.drawable.sri_lanka,name[127],description[2]));
        arrayList.add(new Flag(R.drawable.sudan,name[128],description[3]));
        arrayList.add(new Flag(R.drawable.suriname,name[129],description[4]));
        arrayList.add(new Flag(R.drawable.swaziland,name[130],description[0]));
        arrayList.add(new Flag(R.drawable.sweden,name[131],description[1]));
        arrayList.add(new Flag(R.drawable.switzerland,name[132],description[2]));
        arrayList.add(new Flag(R.drawable.syria,name[133],description[3]));

        arrayList.add(new Flag(R.drawable.taiwan,name[134],description[4]));
        arrayList.add(new Flag(R.drawable.tajikistan,name[135],description[0]));
        arrayList.add(new Flag(R.drawable.tanzania,name[136],description[1]));
        arrayList.add(new Flag(R.drawable.thailand,name[137],description[2]));
        arrayList.add(new Flag(R.drawable.togo,name[138],description[3]));
        arrayList.add(new Flag(R.drawable.tonga,name[139],description[4]));
        arrayList.add(new Flag(R.drawable.tunisia,name[140],description[0]));
        arrayList.add(new Flag(R.drawable.turkey,name[141],description[1]));
        arrayList.add(new Flag(R.drawable.turkmenistan,name[142],description[2]));

        arrayList.add(new Flag(R.drawable.uganda,name[143],description[3]));
        arrayList.add(new Flag(R.drawable.ukraine,name[144],description[4]));
        arrayList.add(new Flag(R.drawable.united_arab_emirates,name[145],description[0]));
        arrayList.add(new Flag(R.drawable.united_kingdom,name[146],description[1]));
        arrayList.add(new Flag(R.drawable.united_states_america,name[147],description[2]));
        arrayList.add(new Flag(R.drawable.uruguay,name[148],description[3]));
        arrayList.add(new Flag(R.drawable.uzbekistn,name[149],description[4]));

        arrayList.add(new Flag(R.drawable.venezuela,name[150],description[0]));
        arrayList.add(new Flag(R.drawable.vietnam,name[151],description[1]));

        arrayList.add(new Flag(R.drawable.wales,name[152],description[2]));

        arrayList.add(new Flag(R.drawable.yemen,name[153],description[3]));

        arrayList.add(new Flag(R.drawable.zimbabwe,name[154],description[3]));

        flagAdapter = new FlagAdapter(this,arrayList);

        listView.setAdapter(flagAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("movie_name",arrayList.get(i).getmName());
                intent.putExtra("movie_details",arrayList.get(i).getmDescription());

                intent.putExtra("movie_poster",arrayList.get(i).getmImage());
                startActivity(intent);

            }
        });

        listView.setEmptyView(textView);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem mSearch = menu.findItem(R.id.action_search);

        SearchView mSearchView = (SearchView)mSearch.getActionView();
        mSearchView.setQueryHint("Search");

        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                flagAdapter.getFilter().filter(s);

                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);

    }
}
