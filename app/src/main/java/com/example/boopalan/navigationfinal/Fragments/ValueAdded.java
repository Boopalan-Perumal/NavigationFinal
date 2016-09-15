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
import com.example.boopalan.navigationfinal.Adapters.ValueAddedAdapter;
import com.example.boopalan.navigationfinal.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ColdStorage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ColdStorage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ValueAdded extends Fragment {
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

    public ValueAdded() {
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
    public static ValueAdded newInstance(String param1, String param2) {
        ValueAdded fragment = new ValueAdded();
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
        mAdapter = new ValueAddedAdapter(new String[]{"QUALITY CONTROL LABS","UTILITIES","PROCESSING EQUIPMENTS","MATERIAL HANDLING EQUIPMENTS","INTERNAL FOOD AUDITS"},new String[]{"It is imperative that all types of food manufacturing units should have a quality control lab which should be able to control various parameters like microbial, aerial and other forms of likely food spoilers.\n" +
                "We at Frigoscan, are committed in not only delivering world class equipment matching international norms but disseminate crucial information in safe handling of food.\n","Frigoscan with its engineering expertize and industry experience provides our customers  cutting edge solutions not only in design but performance for one of the vital ingredients of a successful facility planning management. Utilities are designed in optimizing customer’s input vs. market demand graph which is of significance when it comes to operational and maintenance cost. This paves the way for ensuring profits.","The key to optimized utilization of resources namely raw material, manpower and synchronization with utilities lies in  striking a balance of selecting the right kind of processing equipment while it is important for a supplier to meet the demands of present keeping in mind of the future. Our expertise with considerable experience in operation of various food processing units has taught us to be precise and concise when it comes to deliverance.","The greatest asset for a food processing unit lies in its resource utilization perspective and Frigoscan leaves no stone unturned in designing proper material handling equipment. The difference in terms of profit ratio could be huge if manpower resources required for handling as critical a product as food.\n" +
                "We believe in customizing the needs of the customer to that of the quality of handling.\n","One of the major concerns of exporters and food handlers from Asia have been the consistency of food which is more ethnic. Frigoscan understands this concept and uses it’s expertize in helping our customers plan and execute internal food audits in a consistent manner to achieve constancy.\n" +
                "IF safe food is heaven Food audits have a huge role to play and We at Frigoscan are committed to deliver the best quality food to mankind\n"});
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