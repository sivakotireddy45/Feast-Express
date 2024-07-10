package com.example.feastexpress1.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feastexpress1.R;
import com.example.feastexpress1.adapters.DailyMealAdapter;
import com.example.feastexpress1.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.daily_meal_fragment,container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% OFF","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","50% OFF","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","30% OFF","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","10% OFF","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffee","30% OFF","Description"));


        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();


        return root;
    }
}