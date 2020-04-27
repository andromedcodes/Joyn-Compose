package de.joyn.joyncompose.ui

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.layout.Column
import androidx.ui.layout.Stack
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.layout.preferredHeight
import androidx.ui.layout.preferredWidth
import androidx.ui.layout.sizeIn
import androidx.ui.material.Button
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import de.joyn.joyncompose.R
import de.joyn.joyncompose.parseColor
import de.joyn.joyncompose.theme.Colors


@Composable
fun HeroCard(
    modifier: Modifier = Modifier,
    @DrawableRes backgroundImage: Int,
    @DrawableRes artLogo: Int,
    @DrawableRes brandLogo: Int,
    vibrantColor: String = "#FFFFFF",
    buttonText: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.plus(modifier).preferredHeight(440.dp)
            .preferredWidth(320.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.Gray
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Stack(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    asset = imageResource(id = backgroundImage),
                    contentScale = ContentScale.Crop
                )
                Image(
                    asset = vectorResource(id = R.drawable.ic_hero_gradient),
                    modifier = Modifier.matchParentSize(),
                    colorFilter = ColorFilter.tint(vibrantColor.parseColor())
                )
                Box(modifier = Modifier.padding(top = 20.dp).gravity(Alignment.TopEnd)) {
                    Image(
                        modifier = Modifier.sizeIn(maxHeight = 14.dp, maxWidth = 40.dp)
                            .gravity(Alignment.TopEnd),
                        asset = imageResource(id = brandLogo)
                    )
                }
                Image(
                    asset = imageResource(id = artLogo),
                    modifier = Modifier.gravity(Alignment.BottomCenter)
                        .padding(start = 60.dp, end = 60.dp, bottom = 101.dp)
                )
                Button(
                    modifier = Modifier.padding(
                        start = 20.dp,
                        end = 20.dp,
                        bottom = 30.dp
                    ).gravity(Alignment.BottomCenter)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(2.dp),
                    onClick = onClick,
                    backgroundColor = Colors.LIGHT_WHITE.color(),
                    contentColor = Color.White
                ) {
                    Text(text = buttonText)
                }
            }
        }
    }
}

@Preview
@Composable
private fun HeroCardPreview() {
    HeroCard(
        backgroundImage = R.drawable.hero_image,
        artLogo = R.drawable.edge_of_tomorrow,
        brandLogo = R.drawable.pro_sieben_white,
        vibrantColor = "#587591",
        buttonText = "Watch Now"
    ) {}
}