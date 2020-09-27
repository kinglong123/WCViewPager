package nevet.me.wcviewpagersample;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by lanjl on 2018/8/1.
 *
 * VIEWpage 方式展示盒子 frament 里的 Addapter
 */
@Deprecated
public class AppHomePageViewAddapter
        extends RecyclerView.Adapter<AppHomePageViewAddapter.ViewHolder> {

    private Context mActivity;

    private boolean isHorizontal;

    private int mDisplayType;

    private boolean isHomePage;

    private List<String> mSectionDataLists;




    public AppHomePageViewAddapter(Context activity) {
        mActivity = activity;

    }




    public void setData(List<String> sectionDataLists) {
        mSectionDataLists = sectionDataLists;
    }


    public void setIsHorizontal(boolean horizontal) {
        isHorizontal = horizontal;
    }


    public void setDisplayType(int displayType) {
        mDisplayType = displayType;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ll, parent, false);
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        v.setBackgroundColor(color);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTvName.setText(mSectionDataLists.get(position));

    }


    @Override
    public int getItemCount() {
        return mSectionDataLists == null ? 0 : mSectionDataLists.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {



        TextView mTvName;



        public ViewHolder(View view) {
            super(view);


            mTvName = (TextView) view.findViewById(R.id.tv);



        }
    }

}
