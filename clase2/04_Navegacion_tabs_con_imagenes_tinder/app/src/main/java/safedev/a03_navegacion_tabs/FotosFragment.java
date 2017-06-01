package safedev.a03_navegacion_tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.andtinder.model.CardModel;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FotosFragment extends Fragment implements CardModel.OnCardDimissedListener {
    private CardContainer contenedorCartas;

    public FotosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fotos, container, false);

        //cambios en la vista antes de devolverla como salida
        contenedorCartas = (CardContainer)vista.findViewById(R.id.contenedorCartas);
        CardModel card1 = new CardModel("German", "SafeDev", getActivity().getDrawable(R.drawable.uff0));
        CardModel card2 = new CardModel("Juan", "SafeDev", getActivity().getDrawable(R.drawable.foto));

        //Asocio las tarjetas al evento que tengo implementado en esta clase
        card1.setOnCardDimissedListener(this);
        card2.setOnCardDimissedListener(this);

        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(getActivity());
        adapter.add(card1);
        adapter.add(card2);
        contenedorCartas.setAdapter(adapter);

        return vista;
    }

    @Override
    public void onLike() {
        Toast.makeText(getActivity(), "Me Gusta", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDislike() {
        Toast.makeText(getActivity() ,"No me Gusta", Toast.LENGTH_SHORT).show();
    }
}
