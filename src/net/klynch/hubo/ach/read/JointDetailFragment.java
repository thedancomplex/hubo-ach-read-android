package net.klynch.hubo.ach.read;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.klynch.hubo.ach.read.dummy.JointContent;

/**
 * A fragment representing a single Joint detail screen. This fragment is either contained in a
 * {@link JointListActivity} in two-pane mode (on tablets) or a {@link JointDetailActivity} on
 * handsets.
 */
public class JointDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment represents.
     */
    public static final String ARG_JOINT_ID = "joint_id";

    /**
     * The joint this fragment is presenting.
     */
    private JointContent.Joint mJoint;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment (e.g. upon
     * screen orientation changes).
     */
    public JointDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_JOINT_ID)) {
            // Load the content specified by the fragment arguments.
            // Should consider using a Loader to load content from a content provider.
            mJoint = JointContent.JOINT_MAP.get(getArguments().getString(ARG_JOINT_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joint_detail, container, false);

        // Show the joint as text in a TextView.
        if (mJoint != null) {
            ((TextView) rootView.findViewById(R.id.joint_detail)).setText(mJoint.id);
        }

        return rootView;
    }
}
