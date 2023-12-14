package com.example.myapplication.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.entidades.Ventas;

import java.util.ArrayList;

public class ListaVentasAdapter extends RecyclerView.Adapter<ListaVentasAdapter.VentasViewHolder> {

    ArrayList<Ventas> listaVentas;

    public ListaVentasAdapter(ArrayList<Ventas> listaVentas){
        this.listaVentas = listaVentas;
    }

    @NonNull
    @Override
    public VentasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_ventas, null, false);
        return new VentasViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VentasViewHolder holder, int position) {
        holder.viewNombre.setText(listaVentas.get(position).getNombrep());
        holder.viewCodigo.setText(listaVentas.get(position).getCodigop());
        holder.viewCantida.setText(listaVentas.get(position).getCantidadp());
        holder.viewPrecioUnitario.setText((int) listaVentas.get(position).getValoru());
        holder.viewPrecioTotal.setText((int) listaVentas.get(position).getValort());

    }

    @Override
    public int getItemCount() {
        return listaVentas.size();
    }

    public class VentasViewHolder extends RecyclerView.ViewHolder {

        TextView  viewNombre, viewCodigo, viewCantida, viewPrecioUnitario, viewPrecioTotal;

        public VentasViewHolder(@NonNull View itemView) {
            super(itemView);

            viewNombre = itemView.findViewById(R.id.viewNombre);
            viewCodigo = itemView.findViewById(R.id.viewCodigo);
            viewCantida = itemView.findViewById(R.id.viewCantida);
            viewPrecioUnitario= itemView.findViewById(R.id.viewPrecioUnitario);
            viewPrecioTotal = itemView.findViewById(R.id.viewPrecioTotal);
        }
    }
}
