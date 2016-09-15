package com.example.boopalan.navigationfinal.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Selection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.boopalan.navigationfinal.Adapters.AboutAdapter;
import com.example.boopalan.navigationfinal.Adapters.ColdStorageAdapter;
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
public class About extends Fragment {
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

    public About() {
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
    public static About newInstance(String param1, String param2) {
        About fragment = new About();
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
        mAdapter = new AboutAdapter(new String[]{"MISSION","VISION","COMPANY PROFILE","CLIENTELE"},new String[]{"Innovate and Excel in delivering customized and cost effective solutions with products and services and to remain a value added partner to our customers.","To consistently provide world class solutions for the benefit of Agri- business community.","Our Team members have “hands-on” experience in setting up major infrastructure facilities like the state-of-art CA cold store " +
                "cum Pack-house Facilities for Fruits and Vegetables,Processing Units,Specialized Pack-house for Fruits and Vegetables.\n" + "Techno-economic feasibility studies for a wide range of activities covering new projects, technologies, developing solutions for specific region, product activity, infrastructure development in association with renowned international firms. At “FRIGOSCAN” we specialize in developing solutions for  Agribusiness and Cold chain  Development in India in close association with leading international experts  by providing the following integrated services Infrastructure Projects\n" +
                "Feasibility Study\n" +
                "Linkages\n" +
                "Technology Selection"+
                "Turnkey Project Management","Our Beautifull Clients"});
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