package fr.wildcodeschool.blablawild2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        TripModel tripModel = getIntent().getParcelableExtra(ItinerarySearchActivity.EXTRA_TRIP);
        this.setTitle(String.format(getString(R.string.departure_to_destination), tripModel.getDeparture(), tripModel.getDestination()));

        ListView listTrip = findViewById(R.id.list_trip);
        ArrayList<TripModel> tripList = new ArrayList<>();

        tripList.add(new TripModel("Eric", "Cartman", "21/02/2017"));
        tripList.add(new TripModel("Stan", "Marsh", "21/02/2017"));
        tripList.add(new TripModel("Kenny", "Broflovski", "21/02/2017"));
        tripList.add(new TripModel("Kyle", "McCormick", "21/02/2017"));
        tripList.add(new TripModel("Wendy", "Testaburger", "21/02/2017"));

        TripAdapter adapter = new TripAdapter(this, tripList);
        listTrip.setAdapter(adapter);
    }
}
