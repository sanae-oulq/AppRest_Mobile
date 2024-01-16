package com.example.restapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends AppCompatActivity {
    List<RestaurantModel> list = new ArrayList<RestaurantModel>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_actrivity);
        String cat = getIntent().getStringExtra("cat");
        TextView textView = findViewById(R.id.txtview);
        textView.setText(cat + " Restaurents List");
        ListView ListView = findViewById(R.id.listview);

        if (cat.equals("EL Jadida")) {
            RestaurantModel restaurantModel = new RestaurantModel("L'Araucaria",
                    " 102 Av. Mohamed VI, El Jadida 24040");
            list.add(restaurantModel);
            RestaurantModel restaurantModel1 = new RestaurantModel("Belle Vue",
                    "46 Av. Mohamed V, El Jadida 24000");
            list.add(restaurantModel1);
            RestaurantModel restaurantModel3 = new RestaurantModel("Restaurant Chrono",
                    "Av. Annakhil, El Jadida 24000");
            list.add(restaurantModel3);
            RestaurantModel restaurantModel2 = new RestaurantModel("Ali BaBa",
                    "N1, El Jadida 24000");
            list.add(restaurantModel2);
            RestaurantModel restaurantModel4 = new RestaurantModel("Restaurant O'mexico",
                    "2 Av. Brahim Roudani, El Jadida");
            list.add(restaurantModel4);
            RestaurantModel restaurantModel5 = new RestaurantModel("La Portugaise",
                    "El Jadida");
            list.add(restaurantModel5);

            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(RestaurantActivity.this,
                    R.layout.list_layout, list);
            Log.e("List size", list.size() + "");
            ListView.setAdapter(restaurantAdapter);
        }

        if (cat.equals("Casablanca")) {
            RestaurantModel restaurantModel = new RestaurantModel("L'artiste Casablanca",
                    "54 Rue Jean Jaurès, Casablanca 20250");
            list.add(restaurantModel);
            RestaurantModel restaurantModel1 = new RestaurantModel("restaurant à casablanca",
                    "14 Rue du Soldat Maurice Ben Hammou, Casablanca 20250");
            list.add(restaurantModel1);
            RestaurantModel restaurantModel3 = new RestaurantModel("Cabestan Ocean View",
                    "Phare d'El hank، 90 Boulevard de la Corniche, Casablanca 20000");
            list.add(restaurantModel3);
            RestaurantModel restaurantModel2 = new RestaurantModel("Sushi Thai Casablanca",
                    "Rue Franklin, Casablanca 20100");
            list.add(restaurantModel2);

            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(RestaurantActivity.this,
                    R.layout.list_layout, list);
            Log.e("List size", list.size() + "");
            ListView.setAdapter(restaurantAdapter);
        }
        if (cat.equals("Meknes")) {
            RestaurantModel restaurantModel = new RestaurantModel("La Maison De La Pizza",
                    "magasin, résidence farah, Immeubles 4, 7 Boulevard Bir Anzarane, Meknès 50000");
            list.add(restaurantModel);
            RestaurantModel restaurantModel1 = new RestaurantModel("Black PEPPER Meknès",
                    "résidence Naim, Av. de La Gare, Meknès 50000");
            list.add(restaurantModel1);
            RestaurantModel restaurantModel3 = new RestaurantModel("الطاهي",
                    "LA TOURAINE SAADA, AV BIR ANZARANE, Meknès 50000");
            list.add(restaurantModel3);
            RestaurantModel restaurantModel2 = new RestaurantModel("O'Maystro restaurant",
                    "résidence Arreda, Magasin 1,2, Rue de Fes, Meknès 50000");
            list.add(restaurantModel2);

            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(RestaurantActivity.this,
                    R.layout.list_layout, list);
            Log.e("List size", list.size() + "");
            ListView.setAdapter(restaurantAdapter);
        }
        if (cat.equals("Merrakech")) {
            RestaurantModel restaurantModel = new RestaurantModel("L'mida Marrakech",
                    "NKHEL, 78 BIS D.El Maâden, Marrakech 40030");
            list.add(restaurantModel);
            RestaurantModel restaurantModel1 = new RestaurantModel("Chez zaza",
                    "Bab Ftouh, 40000, 21, Marrakech");
            list.add(restaurantModel1);
            RestaurantModel restaurantModel3 = new RestaurantModel("Mythe Restaurant",
                    "Derb Semmarine, Marrakech 40000");
            list.add(restaurantModel3);
            RestaurantModel restaurantModel2 = new RestaurantModel("Restaurant Luma Marrakech",
                    "à coté de mandaloun, Bd Mohamed VI, Marrakech 40000");
            list.add(restaurantModel2);

            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(RestaurantActivity.this,
                    R.layout.list_layout, list);
            Log.e("List size", list.size() + "");
            ListView.setAdapter(restaurantAdapter);
        }
    }
    void addRestaurents(String name, String address) {
        RestaurantModel restaurantModel = new RestaurantModel(name, address);

        list.add(restaurantModel);
    }

    void addAdapter() {

        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(RestaurantActivity.this, R.layout.list_layout, list);
        Log.e("list size", list.size() + "");
        listView.setAdapter(restaurantAdapter);

    }
}