package com.example.boopalan.navigationfinal.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.boopalan.navigationfinal.Adapters.ColdStorageAdapter;
import com.example.boopalan.navigationfinal.Adapters.FoodStorageAdapter;
import com.example.boopalan.navigationfinal.Adapters.HomeAdapter;
import com.example.boopalan.navigationfinal.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ColdStorage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ColdStorage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodStorage extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public FoodStorage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTwo.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodStorage newInstance(String param1, String param2) {
        FoodStorage fragment = new FoodStorage();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.recycler_view,container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);


        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new FoodStorageAdapter(new String[]{"FOOD PARKS","READY TO EAT(RTE)","READY TO COOK(RTC)","READY TO SERVE(RTS)","INDIVIDUALLY COOK FROZEN FOODS(IQF)"},new String[]{"The concept of Food parks albeit new to India is to have an integrated approach covering all aspects of food with common facilities backing individual enterprises. We at Frigoscan believe in providing real time value to food parks right from the concept stage till operations. Our insight into the industry could be of great value to budding entrepreneurs.","With nuclear families and a growing young population India’s need for food depends a lot on ready to cook and convenient foods. Frigoscan understands the true value in bridging the traditional cooking methods with that of safe, hygiene food factories. Ready to eat ( RTE) foods deliver regular supplies at affordable prices. Frigoscan has hands on experience in setting up of various RTE units across the country.","Ready To Cook Foods ( RTC ) have found a very easy way to the modern kitchen . Frigoscan has developed process technologies, Equipment preservation methodologies for our customers, creating  value addition.Our commitment to Food processing is total and exclusive in delivering time cost effective solutions.","Frigoscan has been in the forefront of development of ready to serve products. The ready to serve beverages have a huge acceptance in both urban and rural markets creating very high employment opportunities.Frigoscan attaches special emphasis in enduring and ensuring the true values of our native fruit flavors with food safety as a focal point.","One of the most ancient methods of preserving food was to either heat or freeze the product for shelf life. However, as the times have changed and so also is the need for regulated industrial activity in preparing food,  individually quick frozen Foods ( IQF )  have come to the forefront. Frigoscan has been one of the pioneers in setting up a few IQF units in India covering Fruits/ Vegetables / Green leaves / herbs / marine products to name a few. The latest international trend is to have frozen cooked food and pulp for year round processing.Frigoscan with its international partners is committed to serving our customers sharing most of our experiences in handling frozen Foods."});
        mRecyclerView.setAdapter(mAdapter);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}