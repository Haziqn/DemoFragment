package com.example.irsyadfaris.demofragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    Button buttonAddTextFrag2;
    TextView textViewFrag2;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        textViewFrag2 = (TextView) view.findViewById(R.id.tvFrag2);
        buttonAddTextFrag2 = (Button) view.findViewById(R.id.btnAddTextFrag2);

        buttonAddTextFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = textViewFrag2.getText().toString() + "\n + New Data f2";
                textViewFrag2.setText(data);
            }
        });
        return view;
    }
}
