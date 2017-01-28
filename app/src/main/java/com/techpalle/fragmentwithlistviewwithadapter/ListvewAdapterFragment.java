package com.techpalle.fragmentwithlistviewwithadapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListvewAdapterFragment extends Fragment {
    ListView listView;
    ArrayList<Employee> al;
    Myadapter myadapter;
    Employee employee;

    public void catcData(String no, String name, String sal){
        employee = new Employee(no, name, sal);
        al.add(employee);
        myadapter.notifyDataSetChanged();
    }

    public ListvewAdapterFragment() {
        // Required empty public constructor
    }

    public class Myadapter extends BaseAdapter{
        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int i) {
            return al.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            employee = al.get(i);
            View v = getActivity().getLayoutInflater().inflate(R.layout.row, null);
            TextView tv1 = (TextView) v.findViewById(R.id.text_view_number);
            TextView tv2 = (TextView) v.findViewById(R.id.text_view_name);
            TextView tv3 = (TextView) v.findViewById(R.id.text_view_salary);
            tv1.setText(employee.getEnumber());
            tv2.setText(employee.getEname());
            tv3.setText(employee.getEsalary());
            return v;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_listvew_adapter, container, false);
        listView = (ListView) v.findViewById(R.id.list_view);
        al = new ArrayList<Employee>();
        myadapter = new Myadapter();
        listView.setAdapter(myadapter);
        return v;
    }

}
