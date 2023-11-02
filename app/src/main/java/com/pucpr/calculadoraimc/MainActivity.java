package com.pucpr.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText heightEditText;
    EditText weightEditText;
    EditText resultEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Define o layout da atividade com base no arquivo XML "activity_main".

        // Associa as variáveis aos elementos de interface gráfica correspondentes no layout XML.
        heightEditText = findViewById(R.id.heightEditText);     // Declaração de variável para o primeiro campo de entrada height
        weightEditText = findViewById(R.id.heightEditText);
        resultEditText = findViewById(R.id.resultEditText);
    }

    // Método para obter um número em formato float a partir de um EditText com base no ID fornecido.
    protected float getMeasureEditText(int id){
        String aux;
        if(id = 1){
            aux = weightEditText.getText().toString();
        }else{
            aux = heightEditText.getText().toString();
        }
        return Float.parseFloat(aux);  // Converte o texto para float e o retorna.
    }
    // Os métodos abaixo são chamados quando os botões na interface do usuário são clicados e realizam operações matemáticas.
    public void imcCalculator(View v){
        float Weight = getMeasureEditText(1);
        float height = getMeasureEditText(2);

        float result = Weight / (height*height);

        resultEditText.setText(String.valueOf(result)); // Exibe o resultado no EditText de resultado.

    }
}