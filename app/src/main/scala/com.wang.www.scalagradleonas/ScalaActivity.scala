package com.wang.www.scalagradleonas

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.{Button, TextView}
import com.wang.www.rs.JavaActivity
import org.scaloid.common._


/**
  * Created by 7 on 2016/10/19.
  */
class ScalaActivity extends Activity with SActivity {
  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.main)

    val title = findViewById(R.id.title).asInstanceOf[TextView]
    title.setText("Hello Scala!")

    find[Button](R.id.button).onClick((v: View) =>
      startActivity[JavaActivity]
    )

  }
}