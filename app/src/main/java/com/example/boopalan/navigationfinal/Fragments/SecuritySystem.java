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
import com.example.boopalan.navigationfinal.Adapters.SecuritySystemAdapter;
import com.example.boopalan.navigationfinal.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ColdStorage.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ColdStorage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecuritySystem extends Fragment {
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

    public SecuritySystem() {
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
    public static SecuritySystem newInstance(String param1, String param2) {
        SecuritySystem fragment = new SecuritySystem();
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
        mAdapter = new SecuritySystemAdapter(new String[]{"CLOSED CIRCUIT TELEVISION","DIGITAL VIDEO RECORDER (DVR)","NETWORK VIDEO RECORDER","ACCESS CONTROL SYSTEM","BIOMETRIC SYSTEM","BIOMETRIC DOOR LOCKS","FIRE ALARM SYSTEM","BURGLAR ALARM SYSTEM","FIRE EXTINGUISHER","SPRINKLER SYSTEM","HYDRANT SYSTEM","GUARD TOUR SYSTEM"},new String[]{"With Digital CCTV technology there is no need to replay hours of tape to search for an incident. CCTV footage can be searched by simply entering a date and time, applying a mouse pointer to a timeline on a monitor screen, or searching for activity in a specified area.\n" +
                "We at Frigoscan , offer the industry’s most comprehensive selection of Analog and Network Cameras and provide customized and cost effective solutions to our customer requirements.\n" +
                "Whether its analog or IP system our expertise will enable you to keep your premises absolutely safe and secure .\n","Digital Video Recorder stores the information captured by the CCTV. DVR’s deliver sharper images, with no loss of quality over time. DVR’s allow you to store more information using less space. Plus, events captured with DVRs can easily be downloaded, recorded to an external storage or duplicated when an additional copy is required.\n" +
                "Digital video surveillance can give you the ability to quickly and easily view access points in multiple areas of your facility.\n","Unlike its predecessor, NVR utilises  a software program that records video in a digital format to an external hard drive or other mass storage device\n" +
                "An NVR is not limited to be in the same area as your cameras cabling to one section. The unit can be placed virtually anywhere, it simply just needs to be on the same LAN network as the IP based cameras. In real terms, a network video recorder are distinct from digital video recorders as their input is assigned to a network\n","Access Control systems are designed to permit the free flow of authorized movement into any business, whilst denying entry to unwanted visitors and staff. Access control systems can be integrated into other systems in your store, such as time and attendance records,  CCTV systems and fire alarms which will activate when a door is opened to provide usual proof of who is entering the building.\n" +
                "Access Control systems can do more than simply allow authorized people in and out of your premises. Sensitive areas such as a manager’s office room ,stock rooms or server rooms may need special protection.\n","Our completely automated time and attendance solutions reduce labour costs by enforcing pay and work rules — consistently and accurately — across the organisation. Labour-intensive time card tracking, data entry, and approval processing are simplified. And that reduces the administrative time associated with attendance exceptions and employee inquiries — all while minimizing over-payments and compliance risk.\n" +
                "At Frigoscan, we put the right information at your fingertips by giving you the latest and most detailed labor activity data, you will finally know how productive your workforce is and have the information to make swift corrections when needed.\n","Biometric door locks are one of the best ways to keep your commercial outfits and  belongings safe and secure. Rather than relying on a key that can be copied or stolen, your personal, unique fingerprint is the biometric ‘key’ to enter the premises.\n" +
                "Biometric fingerprint door locks have gained tremendous benefits compared to conventional key door locks, combination door locks, keyless keypad lock or card reader door locks. Thus, biometric finger print door locks surpass security protection, convenience, and speed.\n" +
                "A very simple, easy to install and powerful door handle and lock with fingerprint key-less entry features. It’s simple enough to look great on any house and function quite normally, but it has powerful security features that makes your premises very difficult to enter illegitimately.\n" +
                "These digital door locks can also be integrated with video door phones and home automation systems to offer additional security.\n","We provide a complete range of advanced conventional and addressable fire alarm systems, detectors, signaling devices, accessories and service tools for any new or retrofit application.\n" +
                "Conventional fire alarm system provides the earliest practicable fire detection and warning. This system consists of smoke or heat detectors at designated locations,to detect smoke or heat at the earliest during any outbreak of fire.\n" +
                "Addressable fire alarm system combines the hybrid capabilities of both intelligent addressable and convenient fire alarm system.An addressable system can spot out the exact location of fire to the control room.\n","When it comes to our customer’s safety, we let nothing stand in the way of our professionally trained team immediately working to help ensure your safety.\n" +
                "There are standalone calling type systems as well as auto dialler types which enable the  system to transmit a signal to stored contacts in case of any intrusion or fire. By sending timely alerts, it ensures you keep the system charged at all times.\n" +
                "Using your phone, you can even arm or disarm it. The inbuilt siren goes off on sensing a threat. All this, to provide you an assurance that your premises are secure, wherever you are.\n","A potential fire can often be controlled before it really takes hold, if the right fire equipment is close at hand. Fire extinguishers are our first line of defence in case of a fire accident.\n" +
                "Based on the area of application different types of Fire extinguishers are installed.Some of the types of Fire extinguishers used are Water , Wet Chemical , Foam , Dry powder , and Carbon dioxide.\n","Sprinkler systems can automatically detect a fire, transmit an alarm and control the fire.\n" +
                "Wet Pipe Sprinkler Systems are the most common systems and are used in buildings where there is no risk of freezing.\n" +
                "Dry Pipe Sprinkler Systems are filled with air under pressure at all times and the water is held back by the control valve outside of the protected area.\n" +
                "Deluge and recycling are sprinkler systems only used in special cases for industrial risks.\n","In a building, a fire hydrant system is a safety measure or emergency equipment required in some buildings that comprises a series of components that when assembled together provide a source of water to assist fire authorities in a fire.\n" +
                "Putting it another way, a fire hydrant system is a water supply with a sufficient pressure and flow delivered through pipes throughout a building to strategically located network of valves for fire-fighting purposes.\n","Ever wondered whether the guard you recruited is actually on Patrol or skipping his work. This integrated system provides you the time and position of your guard by scanning specific Checkpoints.\n" +
                "The Systems we provide will get updated firmware and you can  expand the capabilities of your patrol system as your needs increase.\n" +
                "Our professionals can help you select the best suited system to your requirements.\n"});
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