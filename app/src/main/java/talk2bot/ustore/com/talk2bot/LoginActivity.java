package talk2bot.ustore.com.talk2bot;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private Button btnLogin;
    private EditText edtEmail;
    private EditText edtPassword;
    private static LoginActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        instance = this;
        btnLogin = (Button)findViewById(R.id.btnLogin);
        edtEmail = (EditText)findViewById(R.id.editTextEmail);
        edtPassword = (EditText)findViewById(R.id.editTextPassword);
        edtEmail.setTextColor(Color.BLACK);
        edtPassword.setTextColor(Color.BLACK);
        edtEmail.setText("alison.carrera@outlook.com");
        edtPassword.setText("1234");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtEmail.getText().toString().equals("alison.carrera@outlook.com") && edtPassword.getText().toString().equals("1234"))
                {
                    getContext().getWindow().setExitTransition(new Slide());
                    Intent intent = new Intent(getContext(), ChatListActivity.class);
                    getContext().startActivity(intent,
                            ActivityOptions
                                    .makeSceneTransitionAnimation(getContext()).toBundle());
                }
                else
                {
                    new AlertDialog.Builder(getContext())
                            .setTitle("Ops..")
                            .setMessage("Your email or password are wrong.")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            }
        });


    }

    public static LoginActivity getContext()
    {
        return instance;
    }
}
