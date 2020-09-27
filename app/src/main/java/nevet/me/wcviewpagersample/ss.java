package nevet.me.wcviewpagersample;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by lanjl on 2020/9/25.
 */
public class ss extends Fragment {

    public static ss newInstance() {

        Bundle args = new Bundle();

        ss fragment = new ss();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view=  inflater.inflate(R.layout.ll,container,false);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setText(getString(R.string.lorem_short));
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
        return view;



    }
}
