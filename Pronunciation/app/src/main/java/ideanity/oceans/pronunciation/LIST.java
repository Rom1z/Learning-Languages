package ideanity.oceans.pronunciation;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class LIST extends ListActivity implements OnClickListener {

    static final String[] TOPICS = new String[]{"Lesson 1: English Word Pronunciation",
            "Lesson 2: Word Stress and Syllables",
            "Lesson 3: Long E sound (meet, see)",
            "Lesson 4: Short I Sound (sit, hit)",
            "Lesson 5: UH Sound (put, foot)",
            "Lesson 6: OO Sound (moon, blue)",
            "Lesson 7: Short E sound (pen, bed)",
            "Lesson 8: Schwa Sound (the, about)",
            "Lesson 9: UR Sound (turn, learn)",
            "Lesson 10: OH Sound (four, store)",
            "Lesson 11: Short A Sound (cat, fat)",
            "Lesson 12: UH Sound (but, luck)",
            "Lesson 13: Soft A Sound",
            "Lesson 14: Long O Sound",
            "Lesson 15: Long A Sound",};

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list, TOPICS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                // TODO Auto-generated method stub

                Bundle b = new Bundle();
                String selectedValue = (String) getListAdapter().getItem(position);

                //------------ Conditions -------------------------------------
                if (selectedValue.equals("Lesson 1: English Word Pronunciation")) {
                    b.putString("pme1", "1");

                }
                if (selectedValue.equals("Lesson 2: Word Stress and Syllables")) {
                    b.putString("pme1", "2");

                }
                if (selectedValue.equals("Lesson 3: Long E sound (meet, see)")) {
                    b.putString("pme1", "3");

                }
                if (selectedValue.equals("Lesson 4: Short I Sound (sit, hit)")) {
                    b.putString("pme1", "4");

                }
                if (selectedValue.equals("Lesson 5: UH Sound (put, foot)")) {
                    b.putString("pme1", "5");

                }
                if (selectedValue.equals("Lesson 6: OO Sound (moon, blue)")) {
                    b.putString("pme1", "6");

                }
                if (selectedValue.equals("Lesson 7: Short E sound (pen, bed)")) {
                    b.putString("pme1", "7");

                }
                if (selectedValue.equals("Lesson 8: Schwa Sound (the, about)")) {
                    b.putString("pme1", "8");

                }
                if (selectedValue.equals("Lesson 9: UR Sound (turn, learn)")) {
                    b.putString("pme1", "9");

                }
                if (selectedValue.equals("Lesson 10: OH Sound (four, store)")) {
                    b.putString("pme1", "10");

                }
                if (selectedValue.equals("Lesson 11: Short A Sound (cat, fat)")) {
                    b.putString("pme1", "11");

                }
                if (selectedValue.equals("Lesson 12: UH Sound (but, luck)")) {
                    b.putString("pme1", "12");

                }
                if (selectedValue.equals("Lesson 13: Soft A Sound")) {
                    b.putString("pme1", "13");

                }
                if (selectedValue.equals("Lesson 14: Long O Sound")) {
                    b.putString("pme1", "14");

                }
                if (selectedValue.equals("Lesson 15: Long A Sound")) {
                    b.putString("pme1", "15");

                }

                Intent intent = new Intent(LIST.this, TUTORIAL.class);
                intent.putExtras(b);
                startActivity(intent);

            }

        });


    }


    public void onClick(View arg0) {
        // TODO Auto-generated method stub

    }

}
