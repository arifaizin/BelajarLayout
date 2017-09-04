package id.co.imastudio.belajarlayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    // 1 Kenalin
    Button linear, frame, constraint, table, relative;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // 2 sambungin
        linear = (Button) findViewById(R.id.btn_linear);
        frame = (Button) findViewById(R.id.btn_frame);
        constraint = (Button) findViewById(R.id.btn_constraint);
        table = (Button) findViewById(R.id.btn_table);
        relative = (Button) findViewById(R.id.btn_relative);

        // 3 ngapain
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
                pindah = new Intent(MenuActivity.this, LinearActivity.class);
                startActivity(pindah);
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertpopup = new AlertDialog.Builder(MenuActivity.this);
                alertpopup.setTitle("Judul Alert");
                alertpopup.setMessage("Message Alert");
                alertpopup.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //kalau yes
                        Intent pindah = new Intent(MenuActivity.this, FrameActivity.class);
                        startActivity(pindah);
                    }
                });

                alertpopup.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //kalau no
                    }
                });
                alertpopup.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertpopup.show();
            }
        });

        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(pindah);
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, TableActivity.class);
                startActivity(pindah);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MenuActivity.this, RelativeActivity.class);
                startActivity(pindah);
            }
        });


    }
}
