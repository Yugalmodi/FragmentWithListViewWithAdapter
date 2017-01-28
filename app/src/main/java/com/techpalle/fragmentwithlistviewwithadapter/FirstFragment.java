package com.techpalle.fragmentwithlistviewwithadapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    EditText editTextNumber, editTextName, editTextSalary;
    Button button;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        editTextNumber = (EditText) v.findViewById(R.id.edit_text_number);
        editTextName = (EditText) v.findViewById(R.id.edit_text_name);
        editTextSalary = (EditText) v.findViewById(R.id.edit_text_salary);
        button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.buttonclick(editTextNumber.getText().toString(),
                        editTextName.getText().toString(),editTextSalary.getText().toString());
            }
        });
        return v;
    }

}
