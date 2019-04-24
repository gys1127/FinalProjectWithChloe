package com.android.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AccountSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_account_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_main_page:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_add_blog:
                intent = new Intent(this, EditBlogActivity.class);
                // TODO: fill in creator's email
                intent.putExtra(Constants.BLOG_FOR_EDIT_PAGE, new Blog(""));
                startActivity(intent);
                return true;
            case R.id.menu_sign_out:
                // TODO: sign out
                return true;
            case R.id.about_this_app:
                intent = new Intent(this, AboutThisAppActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}