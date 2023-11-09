package net.spx.demorecyclerview.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.spx.demorecyclerview.DTO.CatDTO;
import net.spx.demorecyclerview.R;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {
    Context context;
    ArrayList<CatDTO> listCat;

    public CatAdapter(Context context, ArrayList<CatDTO> listCat) {
        this.context = context;
        this.listCat = listCat;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return null;
        LayoutInflater inflater = ((Activity) context ).getLayoutInflater();
        View v = inflater.inflate(R.layout.row_cat, parent, false);
        return  new CatViewHolder(v );
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        // gắn dữ liệu vào giao diện:
        CatDTO objCat = listCat.get(position);
        holder.tv_id.setText(  objCat.getId() + ""   );// chuyển về chuỗi với ữ liệu so
        holder.tv_name.setText( objCat.getName() );
    }

    @Override
    public int getItemCount() {
        return listCat.size() ;  // không quên return size
    }

    class CatViewHolder extends RecyclerView.ViewHolder{

        TextView tv_id, tv_name;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_name = itemView.findViewById(R.id.tv_name);
        }
    }
}
