package com.example.a10122701_myselfapps.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.a10122701_myselfapps.AboutDialog;
import com.example.a10122701_myselfapps.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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

    ImageView ivFacebook, ivInstagram, ivTwitter, ivYoutube, ivTelegram, ivMap;
    TextView tvPhone, tvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        ivFacebook = root.findViewById(R.id.iv_facebook);
        ivInstagram = root.findViewById(R.id.iv_instagram);
        ivTwitter = root.findViewById(R.id.iv_twitter);
        ivYoutube = root.findViewById(R.id.iv_youtube);
        ivTelegram = root.findViewById(R.id.iv_telegram);
        ivMap = root.findViewById(R.id.iv_map);
        tvPhone = root.findViewById(R.id.tv_phone);
        tvAbout = root.findViewById(R.id.tv_about);

        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent();
                fb.setAction(Intent.ACTION_VIEW);
                fb.addCategory(Intent.CATEGORY_BROWSABLE);
                fb.setData(Uri.parse("https://www.facebook.com/"));
                startActivity(fb);
            }
        });

        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig = new Intent();
                ig.setAction(Intent.ACTION_VIEW);
                ig.addCategory(Intent.CATEGORY_BROWSABLE);
                ig.setData(Uri.parse("https://www.instagram.com/"));
                startActivity(ig);
            }
        });

        ivTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tw = new Intent();
                tw.setAction(Intent.ACTION_VIEW);
                tw.addCategory(Intent.CATEGORY_BROWSABLE);
                tw.setData(Uri.parse("https://twitter.com/"));
                startActivity(tw);
            }
        });

        ivYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yt = new Intent();
                yt.setAction(Intent.ACTION_VIEW);
                yt.addCategory(Intent.CATEGORY_BROWSABLE);
                yt.setData(Uri.parse("https://youtube.com/"));
                startActivity(yt);
            }
        });

        ivTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tg = new Intent();
                tg.setAction(Intent.ACTION_VIEW);
                tg.addCategory(Intent.CATEGORY_BROWSABLE);
                tg.setData(Uri.parse("https://telegram.com/"));
                startActivity(tg);
            }
        });

        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent();
                map.setAction(Intent.ACTION_VIEW);
                map.addCategory(Intent.CATEGORY_BROWSABLE);
                map.setData(Uri.parse("https://www.google.com/maps/place/Bandung,+Bandung+City,+West+Java/@-6.9034424,107.5607543,12z/data=!3m1!4b1!4m6!3m5!1s0x2e68e6398252477f:0x146a1f93d3e815b2!8m2!3d-6.9174639!4d107.6191228!16zL20vMDF6bGw4?entry=ttu"));
                startActivity(map);
            }
        });

        tvPhone.setText(" 087741135698");
        Linkify.addLinks(tvPhone, Linkify.PHONE_NUMBERS);

        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutDialog aboutDialog = new AboutDialog();
                aboutDialog.show(getFragmentManager(),"AboutDialogFragment");
            }
        });

        return root;
    }
}