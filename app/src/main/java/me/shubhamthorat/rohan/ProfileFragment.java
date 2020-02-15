package me.shubhamthorat.rohan;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment()    ;
        return fragment;
    }

    public ViewFlipper v_flipper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    public void flipperImage(int image) {
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(getActivity(), android.R.anim.slide_in_left);
        v_flipper.setInAnimation(getActivity(), android.R.anim.slide_out_right);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int image[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3, R.drawable.logo};
        v_flipper = view.findViewById(R.id.v_flipper);
        if (!v_flipper.isFlipping())
            v_flipper.startFlipping();
        for (int i = 0; i < image.length; i++) {
            flipperImage(image[i]);
        }
//        TextView textView = view.findViewById(R.id.textView4);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), Moreinfo.class);
////        startActivity(intent);
//            }
//        });
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }



//    public void Moreinfo (View view) {
//        Intent intent = new Intent(getActivity(), Moreinfo.class);
//        startActivity(intent);
//
//    }
}