package com.pucpr.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
        TextView resultadoEditText;
        TextView orientationEditText;
        MainActivity mainActivity = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultadoEditText = findViewById(R.id.resultEditText);
        orientationEditText = findViewById(R.id.orientationEditText);

        resultImc();
    }

    public void resultImc() {
        float result = mainActivity.result;
       //float result = mainActivity.getMeasureFromEditText(3);
        //float resultado = getMeasureFloatFromEditText();

        if (16 > result) {
            resultadoEditText.setText("Magreza Grau III");
            orientationEditText.setText("");
        }
        if (result >= 16 && result <= 1.69) {
            resultadoEditText.setText("Magreza Grau II");
            orientationEditText.setText("");
        }
        if (result >= 17 && result <= 18.4) {
            resultadoEditText.setText("Magreza Grau I");
            orientationEditText.setText("");
        }
        if (result >= 18.5 && result <= 24.9) {
            resultadoEditText.setText("Adequado");
            orientationEditText.setText("");
        }
        if (result >= 25 && result <= 29.9) {
            resultadoEditText.setText("Pré-Obeso");
            orientationEditText.setText("");
        }
        if (result >= 30 && result <= 34.9) {
            resultadoEditText.setText("Obesidade Grau I");
            orientationEditText.setText("");
        }
        if (result >= 35 && result <= 39.9) {
            resultadoEditText.setText("Obesidade Grau II");
            orientationEditText.setText("");
        }
        if (result == 40) {
            resultadoEditText.setText("Obesidade Grau III");
            orientationEditText.setText("");
        }
    }

        public float getMeasureFloatFromEditText() {
            String resultado = resultadoEditText.getText().toString();
            return Float.parseFloat(resultado);
        }

}