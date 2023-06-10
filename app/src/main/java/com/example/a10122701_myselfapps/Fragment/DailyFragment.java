package com.example.a10122701_myselfapps.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.a10122701_myselfapps.Adapter.DailyAdapter;
import com.example.a10122701_myselfapps.Adapter.FriendlistAdapter;
import com.example.a10122701_myselfapps.Model.DailyModel;
import com.example.a10122701_myselfapps.Model.FriendlistModel;
import com.example.a10122701_myselfapps.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    private StaggeredGridLayoutManager manager;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerViewDaily.setLayoutManager(manager);

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.daily_wakeup, "Wake Up");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.daily_eat, "Eat");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.daily_school, "Studying");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.daily_playwithfriends, "Friends Time");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.daily_gohome, "Go Home");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.daily_rest, "Rest");
        dailyModel.add(daily6);
        DailyModel daily7 = new DailyModel(R.drawable.daily_playgame, "Play Game");
        dailyModel.add(daily7);
        DailyModel daily8 = new DailyModel(R.drawable.daily_sleep, "Sleep");
        dailyModel.add(daily8);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.frienddefault, "Daniel");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.frienddefault, "Jek");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.frienddefault, "Alvin");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.frienddefault, "Kipel");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.frienddefault, "Rara");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.frienddefault, "Zen");
        friendlistModel.add(friendlist6);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}