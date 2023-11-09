package net.spx.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.spx.demorecyclerview.Adapter.CatAdapter;
import net.spx.demorecyclerview.DAO.CatDAO;
import net.spx.demorecyclerview.DTO.CatDTO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<CatDTO> listCat;
    CatDAO dao;
    RecyclerView rc_cat;
    CatAdapter catAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new CatDAO(this);
        listCat = dao.getList();

        rc_cat = findViewById(R.id.rc_cat);

        catAdapter = new CatAdapter(this, listCat);

        rc_cat.setAdapter( catAdapter );

    }
}