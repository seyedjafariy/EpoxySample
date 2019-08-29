package com.worldsnas.epoxysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.carousel
import com.worldsnas.aio.carouselNoSnap
import kotlinx.android.synthetic.main.activity_part_two.*

class PartTwoActivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        epoxyRecyclerView.withModels {
            carouselNoSnap {
                id("horizontal no snap list")
                //using model function you can add views
                models(
                    listOf(
                        MyViewModel_().id("first")
                    )
                )
            }

            //using extension to add a carousel to our list
            carousel {
                //like any other epoxy model carousel needs id
                id("horizontal list")
                //using model function you can add views
                models(
                    listOf(
                        MyViewModel_().id("first")
                    )
                )

            }
            //no need to add it to the controller as it's been done for us by the extension
            myView {
                //need to set an id to every model we create
                id("first model")

                //name property
                nameProp("name")

                //call back
                clickListener {

                }

                //normal click listener
                clickListener { view ->

                }

                //generated listener for our model
                clickListener { model, parentView, clickedView, position ->

                }

                //setting title on our model
                title("" as CharSequence)
                title("")
            }
        }
    }
}