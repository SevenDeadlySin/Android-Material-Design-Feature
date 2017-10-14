package com.example.raksa.materialtabstablayoutdemo.data;

import android.support.v4.app.Fragment;

import com.example.raksa.materialtabstablayoutdemo.fragment.FifthFragment;
import com.example.raksa.materialtabstablayoutdemo.fragment.FirstFragment;
import com.example.raksa.materialtabstablayoutdemo.fragment.FourthFragment;
import com.example.raksa.materialtabstablayoutdemo.fragment.SecondFragment;
import com.example.raksa.materialtabstablayoutdemo.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raksa on 10/6/2017.
 */

public class MyData {


    //FragmentList Data
    public static List<Fragment> getFragmentList(){

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new FirstFragment());
        fragmentList.add(new SecondFragment());
        fragmentList.add(new ThirdFragment());
        fragmentList.add(new FourthFragment());
        fragmentList.add(new FifthFragment());
        return  fragmentList;
    }

    //TitleList Data
    public static List<String> getTitleList(){

        List<String> titleList = new ArrayList<>();
        titleList.add("One");
        titleList.add("Two");
        titleList.add("Three");
        titleList.add("Four");
        titleList.add("Five");

        return titleList;
    }

}
