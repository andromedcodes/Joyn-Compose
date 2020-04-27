package de.joyn.joyncompose.screens

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import de.joyn.joyncompose.R
import de.joyn.joyncompose.parseColor
import de.joyn.joyncompose.ui.HeroCard
import de.joyn.joyncompose.ui.StandardCard

@Composable
fun HomeScreen() {
    VerticalScroller() {
        Column {
            HorizontalScroller(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    HeroCard(
                        modifier = Modifier.fillMaxWidth(),
                        backgroundImage = R.drawable.hero_image,
                        artLogo = R.drawable.edge_of_tomorrow,
                        brandLogo = R.drawable.pro_sieben_white,
                        vibrantColor = "#587591",
                        buttonText = "Watch Now"
                    ) {}

                    HeroCard(
                        backgroundImage = R.drawable.hero_image,
                        artLogo = R.drawable.edge_of_tomorrow,
                        brandLogo = R.drawable.pro_sieben_white,
                        vibrantColor = "#587591",
                        buttonText = "Watch Now"
                    ) {}
                }
            }

            HorizontalScroller {
                Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                    StandardCard(
                        backgroundColor = "#7b1118".parseColor(),
                        backgroundImage = R.drawable.gntm,
                        artLogo = R.drawable.gntm_art_logo,
                        brandLogo = R.drawable.pro_sieben_white
                    )

                    StandardCard(
                        backgroundColor = "#7b1118".parseColor(),
                        backgroundImage = R.drawable.gntm,
                        artLogo = R.drawable.gntm_art_logo,
                        brandLogo = R.drawable.pro_sieben_white
                    )

                    StandardCard(
                        backgroundColor = "#7b1118".parseColor(),
                        backgroundImage = R.drawable.gntm,
                        artLogo = R.drawable.gntm_art_logo,
                        brandLogo = R.drawable.pro_sieben_white
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun preview() {
    HomeScreen()
}