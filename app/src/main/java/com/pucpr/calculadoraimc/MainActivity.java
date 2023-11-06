// Importa as bibliotecas necessárias.
package com.pucpr.calculadoraimc;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

// Classe principal da atividade.
public class MainActivity extends AppCompatActivity {

    // Declaração de variáveis para os elementos de interface gráfica.
    EditText heightEditText;
    EditText weightEditText;
    EditText resultEditText;
    float result;

    // Ciclo ce vida da Activity, Método chamado quando a atividade é criada.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da atividade com base no arquivo XML "activity_main".
        heightEditText = findViewById(R.id.heightEditText); // Associa a variável ao elemento de interface gráfica correspondente.
        weightEditText = findViewById(R.id.weightEditText);
        resultEditText = findViewById(R.id.resultEditText);

        Log.d("lifecicle", "onCreate()"); // Registra uma mensagem de log com a identificação "lifecycle" durante a criação da atividade (util para debug no logcat).
    }

    // Ciclo ce vida da Activity, Método chamado quando a atividade está prestes a se tornar visível.
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecicle", "onStart()"); // Registra uma mensagem de log no início do ciclo de vida da atividade.
    }

    // Ciclo ce vida da Activity, Método chamado quando a atividade se torna visível e interativa para o usuário.
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecicle", "onResume()"); // Registra uma mensagem de log quando a atividade se torna visível e interativa.
    }

    // Ciclo ce vida da Activity, Método chamado quando a atividade perde o foco, mas ainda é visível.
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecicle", "onPause()"); // Registra uma mensagem de log quando a atividade perde o foco.
    }

    // Ciclo ce vida da Activity, Método chamado quando a atividade não está mais visível.
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecicle", "onStop()"); // Registra uma mensagem de log quando a atividade não está mais visível.
    }

    // Ciclo ce vida da Activity, Método chamado antes da destruição da atividade.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecicle", "onDestroy()"); // Registra uma mensagem de log antes da destruição da atividade.
    }

    // Método para obter um número em formato float a partir de um EditText com base no ID fornecido.
    public float getMeasureFromEditText(int id) {
        String aux;
        if (id == 1) {
            aux = weightEditText.getText().toString();
        } if (id == 2){
            aux = heightEditText.getText().toString();
        }else {
            aux = resultEditText.getText().toString();
        }

        return Float.parseFloat(aux);  // Converte o texto para float e o retorna.
    }

    // Método chamado quando o botão na interface do usuário é clicado e realiza uma operação matemática.
    public void imcCalculatorButtonOnClick(View v) {
        float weight = getMeasureFromEditText(1);
        float height = getMeasureFromEditText(2);

        result = weight / (height * height);

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        startActivity(intent);

        //resultEditText.setText(String.valueOf(result)); // Exibe o resultado no EditText de resultado.
    }
}