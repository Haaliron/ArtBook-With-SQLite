package com.haliron.artbookdemo;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.haliron.artbookdemo.databinding.RecylerRowBinding;

import java.util.ArrayList;

public class ArtAdapter extends RecyclerView.Adapter<ArtAdapter.ArtHolder>
{
    ArrayList<Art> artArrayList;

    public ArtAdapter(ArrayList<Art> artArrayList)
    {
        this.artArrayList = artArrayList;
    }

    @NonNull
    @Override
    public ArtHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        RecylerRowBinding recylerRowBinding = RecylerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ArtHolder(recylerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtHolder holder, int position)
    {
        holder.binding.recyclerViewTextView.setText(artArrayList.get(position).name);
    }

    @Override
    public int getItemCount()
    {
        return artArrayList.size();
    }

    public class ArtHolder extends RecyclerView.ViewHolder
    {
        private RecylerRowBinding binding;

        public  ArtHolder(RecylerRowBinding binding)
        {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
