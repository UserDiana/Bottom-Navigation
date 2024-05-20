package com.example.custombuttombar


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout;
import android.widget.TextView
import com.example.custombuttombar.MainActivity
import android.view.animation.Animation


        class MainActivity : AppCompatActivity() {
            private lateinit var binding: MainActivity
            private var selectedTab: Int = 0

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val homeLayout = findViewById<LinearLayout>(R.id.homeLayout)
                val likeLayout = findViewById<LinearLayout>(R.id.likeLayout)
                val notificationLayout = findViewById<LinearLayout>(R.id.notificationLayout)
                val profileLayout = findViewById<LinearLayout>(R.id.profileLayout)

                val homeImage: ImageView = findViewById(R.id.homeImage)
                val likeImage: ImageView = findViewById(R.id.likeImage)
                val notificationImage: ImageView = findViewById(R.id.notificationImage)
                val profileImage: ImageView = findViewById(R.id.profileImage)

                val homeTxt: TextView = findViewById(R.id.homeTxt)
                val likeTxt: TextView = findViewById(R.id.likeTxt)
                val notificationTxt: TextView = findViewById(R.id.notificationTxt)
                val profileTxt: TextView = findViewById(R.id.profileTxt)


                //set home fragment by default
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                    .commit()


                homeLayout.setOnClickListener {
                    //check if home is already selected or not
                    if (selectedTab != 1) {

                        //set home fragment
                        supportFragmentManager.beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                            .commit()

                        //unselect other tabs expect home tab
                        likeTxt.visibility = View.GONE
                        notificationTxt.visibility = View.GONE
                        profileTxt.visibility = View.GONE

                        likeImage.setImageResource(R.drawable.like_icon)
                        notificationImage.setImageResource(R.drawable.notification_icon)
                        profileImage.setImageResource(R.drawable.profile_icon)

                        likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                        notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                        profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                        //select home tab
                        homeTxt.visibility = View.VISIBLE
                        homeImage.setImageResource(R.drawable.home_selected_icon)
                        homeLayout.setBackgroundResource(R.drawable.round_back_home_100)

                        //create animation
                        //
                        //
                        //
                        // Configurar los valores iniciales y finales de la animación de escala
                        val fromX = 0.8f
                        val toX = 1.0f
                        val fromY = 1f
                        val toY = 1f
                        val pivotX = Animation.RELATIVE_TO_SELF
                        val pivotY = Animation.RELATIVE_TO_SELF
                        val pivotXValue = 0.0f
                        val pivotYValue = 0.0f

                        // Crear la animación de escala
                        val scaleAnimation = ScaleAnimation(
                            fromX, toX,
                            fromY, toY,
                            pivotX, pivotXValue,
                            pivotY, pivotYValue
                        ).apply {
                            //duration = 200 // duración de la animación en milisegundos
                            fillAfter = true // para que la animación mantenga su estado final
                        }
                        // Suponiendo que tienes una vista a la que aplicar la animación
                        // view.startAnimation(scaleAnimation)
                        //scaleAnimation.duration = 200
                        scaleAnimation.fillAfter = true
                        homeLayout.startAnimation(scaleAnimation)

                        // set 1st tab as selected
                        //selectedTab =1;
                        var selectedTab = 1



                    }
                }
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //---------------------------------------------------------------------------------------

                likeLayout.setOnClickListener {
                    // Accion al hacer clic en likeLayout
                    homeLayout.setOnClickListener {
                        //check if like tab is already selected or not
                        if (selectedTab != 2) {

                            //set like fragment
                            supportFragmentManager.beginTransaction()
                                .setReorderingAllowed(true)
                                .replace(R.id.fragmentContainer, LikesFragments::class.java, null)
                                .commit()

                            //unselect other tabs expect like tab
                            homeTxt.visibility = View.GONE
                            notificationTxt.visibility = View.GONE
                            profileTxt.visibility = View.GONE

                            homeImage.setImageResource(R.drawable.home_icon)
                            notificationImage.setImageResource(R.drawable.notification_icon)
                            profileImage.setImageResource(R.drawable.profile_icon)

                            homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            //select home tab
                            likeTxt.visibility = View.VISIBLE
                            likeImage.setImageResource(R.drawable.like_selected_icon)
                            likeLayout.setBackgroundResource(R.drawable.round_back_like_100)

                            //create animation
                            //
                            //
                            //
                            // Configurar los valores iniciales y finales de la animación de escala
                            val fromX = 0.8f
                            val toX = 1.0f
                            val fromY = 1f
                            val toY = 1f
                            val pivotX = Animation.RELATIVE_TO_SELF
                            val pivotY = Animation.RELATIVE_TO_SELF
                            val pivotXValue = 1.0f
                            val pivotYValue = 0.0f

                            // Crear la animación de escala
                            val scaleAnimation = ScaleAnimation(
                                fromX, toX,
                                fromY, toY,
                                pivotX, pivotXValue,
                                pivotY, pivotYValue
                            ).apply {
                                //duration = 200 // duración de la animación en milisegundos
                                fillAfter = true // para que la animación mantenga su estado final
                            }
                            // Suponiendo que tienes una vista a la que aplicar la animación
                            // view.startAnimation(scaleAnimation)
                            //scaleAnimation.duration = 200
                            scaleAnimation.fillAfter = true
                            likeLayout.startAnimation(scaleAnimation)

                            // set 2nd tab as selected
                            //selectedTab =1;
                            var selectedTab = 2
                        }
                    }
                }

                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //---------------------------------------------------------------------------------------


                notificationLayout.setOnClickListener {
                    // Acción al hacer clic en notificationLayout
                    homeLayout.setOnClickListener {
                        //check if notification tab is already selected or not
                        if (selectedTab != 3) {
                            //set notification fragment
                            supportFragmentManager.beginTransaction()
                                .setReorderingAllowed(true)
                                .replace(R.id.fragmentContainer, NotificationFragment::class.java, null)
                                .commit()

                            //unselect other tabs expect notification tab
                            homeTxt.visibility = View.GONE
                            likeTxt.visibility = View.GONE
                            profileTxt.visibility = View.GONE

                            homeImage.setImageResource(R.drawable.home_icon)
                            likeImage.setImageResource(R.drawable.like_icon)
                            profileImage.setImageResource(R.drawable.profile_icon)

                            homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            //select home tab
                            notificationTxt.visibility = View.VISIBLE
                            notificationImage.setImageResource(R.drawable.notification_selected_icon)
                            notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100)

                            //create animation
                            //
                            //
                            //
                            // Configurar los valores iniciales y finales de la animación de escala
                            val fromX = 0.8f
                            val toX = 1.0f
                            val fromY = 1f
                            val toY = 1f
                            val pivotX = Animation.RELATIVE_TO_SELF
                            val pivotY = Animation.RELATIVE_TO_SELF
                            val pivotXValue = 1.0f
                            val pivotYValue = 0.0f

                            // Crear la animación de escala
                            val scaleAnimation = ScaleAnimation(
                                fromX, toX,
                                fromY, toY,
                                pivotX, pivotXValue,
                                pivotY, pivotYValue
                            ).apply {
                                ///duration = 200 // duración de la animación en milisegundos
                                fillAfter = true // para que la animación mantenga su estado final
                            }
                            // Suponiendo que tienes una vista a la que aplicar la animación
                            // view.startAnimation(scaleAnimation)
                            //scaleAnimation.duration = 200
                            scaleAnimation.fillAfter = true
                            notificationLayout.startAnimation(scaleAnimation)

                            // set 3th tab as selected
                            //selectedTab =1;
                            var selectedTab = 3
                        }
                    }
                }
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //---------------------------------------------------------------------------------------


                profileLayout.setOnClickListener {
                    // Acción al hacer clic en profileLayout
                    homeLayout.setOnClickListener {
                        //check if profile tab is already selected or not
                        if (selectedTab != 4) {

                            //set profile fragment
                            supportFragmentManager.beginTransaction()
                                .setReorderingAllowed(true)
                                .replace(R.id.fragmentContainer, ProfileFragment::class.java, null)
                                .commit()

                            //unselect other tabs expect profile tab
                            homeTxt.visibility = View.GONE
                            likeTxt.visibility = View.GONE
                            notificationTxt.visibility = View.GONE

                            homeImage.setImageResource(R.drawable.home_icon)
                            likeImage.setImageResource(R.drawable.like_icon)
                            notificationImage.setImageResource(R.drawable.notification_icon)

                            homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                            //select home tab
                            profileTxt.visibility = View.VISIBLE
                            profileImage.setImageResource(R.drawable.profile_selected_icon)
                            profileLayout.setBackgroundResource(R.drawable.round_back_profile_100)

                            //create animation
                            //
                            //
                            //
                            // Configurar los valores iniciales y finales de la animación de escala
                            val fromX = 0.8f
                            val toX = 1.0f
                            val fromY = 1f
                            val toY = 1f
                            val pivotX = Animation.RELATIVE_TO_SELF
                            val pivotY = Animation.RELATIVE_TO_SELF
                            val pivotXValue = 1.0f
                            val pivotYValue = 0.0f

                            // Crear la animación de escala
                            val scaleAnimation = ScaleAnimation(
                                fromX, toX,
                                fromY, toY,
                                pivotX, pivotXValue,
                                pivotY, pivotYValue
                            ).apply {
                                //duration = 200 // duración de la animación en milisegundos
                                fillAfter = true // para que la animación mantenga su estado final
                            }
                            // Suponiendo que tienes una vista a la que aplicar la animación
                            // view.startAnimation(scaleAnimation)
                            //scaleAnimation.duration = 200
                            scaleAnimation.fillAfter = true
                            profileLayout.startAnimation(scaleAnimation)

                            // set 4th tab as selected
                            //selectedTab =1;
                            var selectedTab = 4
                        }
                    }
                }
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //----------------------------------------------------------------------------------------
                //---------------------------------------------------------------------------------------
            }
        }




