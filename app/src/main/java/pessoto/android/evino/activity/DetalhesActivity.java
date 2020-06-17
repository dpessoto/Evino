package pessoto.android.evino.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import pessoto.android.evino.R;

public class DetalhesActivity extends AppCompatActivity {

    private TextView textNomeVinho, textDescricao;
    private ImageView imageVinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        textNomeVinho = findViewById(R.id.textNomeVinho);
        textDescricao = findViewById(R.id.textDescricao);
        imageVinho = findViewById(R.id.imageVinho);

        //Recuperar os dados
        Bundle dados = getIntent().getExtras();
        String nomeVinho = dados.getString("nome");

        //configurar o dado recebido
        textNomeVinho.setText(nomeVinho);

    }
}
