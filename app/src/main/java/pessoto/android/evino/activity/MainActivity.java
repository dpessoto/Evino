package pessoto.android.evino.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import pessoto.android.evino.R;

public class MainActivity extends AppCompatActivity {

    private ListView listVinhos;
    private String[] vinhos = {
            "Divin Marquis 2019", "Fuenteviña Pinot Noir",
            "Fundo Las Lagunas Reserva Pinot Noir 2019", "Alto Vez Vinho Verde Branco DOC",
            "Famiglia Castellani Chianti Riserva DOCG 2015", "Villa Pampini Vino Bianco",
            "Primi Luis Gurpegui Gran Reserva Navarra D.O. 2007", "Ajimez Vino Blanco 2018",
            "Divin Marquis 2019", "Fuenteviña Pinot Noir",
            "Fundo Las Lagunas Reserva Pinot Noir 2019", "Alto Vez Vinho Verde Branco DOC",
            "Famiglia Castellani Chianti Riserva DOCG 2015", "Villa Pampini Vino Bianco",
            "Primi Luis Gurpegui Gran Reserva Navarra D.O. 2007", "Ajimez Vino Blanco 2018"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listVinhos = findViewById(R.id.listVinhos);

        Toast.makeText(getApplicationContext(),"clique em algum vinho, para ver a descrição",
                Toast.LENGTH_LONG).show();

        //Adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                R.layout.simple_list,
                android.R.id.text1,
                vinhos
        );

        //Adicionar adaptador para a lista
        listVinhos.setAdapter(adaptador);

        //adicionar click na lista
        listVinhos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String vinhoSelecionado = (String) listVinhos.getItemAtPosition(i);

                Toast.makeText(getApplicationContext(),vinhoSelecionado,
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), DetalhesActivity.class);

                //passar dados para DetalhesActivity
                intent.putExtra("nome", vinhoSelecionado);

                startActivity(intent);

            }
        });
    }


    public void sair(View view) {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}
