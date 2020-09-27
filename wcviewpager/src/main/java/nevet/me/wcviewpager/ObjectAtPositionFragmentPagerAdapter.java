package nevet.me.wcviewpager;
/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Raanan Nevet
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

/**
 * Simple implementation of @see ObjectAtPositionInterface can be extended by any custom adapter
 */
public abstract class ObjectAtPositionFragmentPagerAdapter extends FragmentPagerAdapter implements ObjectAtPositionInterface {
    protected SparseArray<Object> objects = new SparseArray<>();

    public ObjectAtPositionFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public final Object instantiateItem(ViewGroup container, int position) {
        Object object = super.instantiateItem(container, position);
        objects.put(position, object);
        return object;
    }



    @Override
    public final void destroyItem(ViewGroup container, int position, Object object) {
        objects.remove(position);
        super.destroyItem(container, position, object);
    }

    @Override
    public Object getObjectAtPosition(int position) {

        return objects.get(position);
    }


}
