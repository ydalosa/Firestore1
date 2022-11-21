package com.dalosa.crudfirestore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.noteViewHolder> {

    private ShowNoteActivity activity;
    private List<NoteModel> notesList;


    public NoteAdapter(ShowNoteActivity activity, List<NoteModel> notesList) {
        this.activity = activity;
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public noteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.item_note, parent, false);

        return new noteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull noteViewHolder holder, int position) {
        holder.title.setText(notesList.get(position).getTitle());
        holder.content.setText(notesList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class noteViewHolder extends RecyclerView.ViewHolder {
        TextView title, content;

        public noteViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvShowTitle);
            content = itemView.findViewById(R.id.tvShowContent);
        }
    }
}
