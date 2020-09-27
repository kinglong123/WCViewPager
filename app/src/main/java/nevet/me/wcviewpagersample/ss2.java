package nevet.me.wcviewpagersample;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lanjl on 2020/9/25.
 */
public class ss2 extends Fragment {

    public static ss2 newInstance() {

        Bundle args = new Bundle();

        ss2 fragment = new ss2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





    }
    RecyclerView mRecyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.llres,container,false);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setText(getString(R.string.lorem_medium));
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_channel_icon);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AppHomePageViewAddapter mIconViewAddapter = new AppHomePageViewAddapter(getContext());

        mIconViewAddapter.setDisplayType(2);

        LinearLayoutManager layoutManager =null;

        layoutManager  = new GridLayoutManager(getContext(), 5);


        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setNestedScrollingEnabled(false);
        ArrayList<String> list = new ArrayList<String>();
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        list.add("11111");
        mIconViewAddapter.setData(list);
        mRecyclerView.setAdapter(mIconViewAddapter);
    }
}
