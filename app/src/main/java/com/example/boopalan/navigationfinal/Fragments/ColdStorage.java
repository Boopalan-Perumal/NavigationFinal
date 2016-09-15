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
public class ColdStorage extends Fragment {
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

    public ColdStorage() {
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
    public static ColdStorage newInstance(String param1, String param2) {
        ColdStorage fragment = new ColdStorage();
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
        mAdapter = new ColdStorageAdapter(new String[]{"MEAT AND MARINE","FRUITS AND VEGETABLES","CHEMICALS AND PHARAMACEUTICALS"},new String[]{"Once caught, marine products are highly perishable. Sea foods for export typically need to be quickly frozen after initial processing and kept frozen until consumed by the consumer. With a sea of expertise in IQF, Blast chiller/freezer rooms , large refrigerated warehouses and reefer transportation ensuring invaluable cold chain components ,optimized for meat and marine products , let our customers  getting the best out of our turn-key solutions.\n" +
                "The engineering expertise employ the most durable material coupled with design precision in all our products depict the highest value for our customer’s business .The chiller rooms for meat and marine products range from 0° to -5° C  and Freezer rooms ranging from -15° to -20° C with ultra low freezing at -40° C and below.\n","With a vast repertoire of  F V products for all cuisines, cold chain has so far been the deterrent for growth. Our customers come to us for solutions from farm gate to retail. Customized solutions for each of the processes have been successfully executed in the past for minimal processing to shelf life preservation.\n" +
                "Farm cooling  has been a challenge in a country like India and we have MASTERED the art of farm cooling, sorting, grading, packing and storage of highly perishable products. We have believed in excellence in customizing solutions, irrespective of the size of the customer.\n","Typically like food, health has been a major concern for India, one of the largest young populated nations in the world. With ever increasing risks of modern day life it is imperative to use cold chain in attaining a disease free India by appropriate vaccines,immunization and life saving drugs. We offer tailor-made solutions for process chilling, cold stores for factory and distribution. The importance of precision components for accuracy ensures a trouble free, long standing product life with temperature mapping."});
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