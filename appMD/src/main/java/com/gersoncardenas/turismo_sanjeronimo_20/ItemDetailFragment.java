package com.gersoncardenas.turismo_sanjeronimo_20;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.gersoncardenas.turismo_sanjeronimo_20.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
        View rootView;

        // Show the dummy content as text in a TextView.
        //if (mItem != null) {
        //(FragmentManager)rootView.findViewById(R.id.fragment).;
        if(mItem.item_name == "HOTELS"){
            rootView = inflater.inflate(R.layout.fragment_hotel, container, false);
            return rootView;

        }else if(mItem.item_name == "BARES"){
            rootView = inflater.inflate(R.layout.fragment_bar, container, false);
            return rootView;

        }else if(mItem.item_name == "TOURIST SITES"){
            rootView = inflater.inflate(R.layout.fragment_tour, container, false);
            return rootView;

        }else if(mItem.item_name == "SAN JERÓNIMO..."){
            rootView = inflater.inflate(R.layout.fragment_town, container, false);
            return rootView;

        }else if(mItem.item_name == "ABOUT US..."){
            rootView = inflater.inflate(R.layout.fragment_about, container, false);
            return rootView;

        }else{
            rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
            return rootView;
        }
        //}

        //return rootView;
    }
}
