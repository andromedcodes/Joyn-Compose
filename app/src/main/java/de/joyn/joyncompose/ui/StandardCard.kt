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
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.Spacer
import androidx.ui.layout.Stack
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.layout.preferredHeight
import androidx.ui.layout.preferredSize
import androidx.ui.layout.preferredWidth
import androidx.ui.layout.width
import androidx.ui.material.LinearProgressIndicator
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import de.joyn.joyncompose.R
import de.joyn.joyncompose.parseColor

@Composable
fun StandardCard(
    backgroundColor: Color,
    @DrawableRes backgroundImage: Int,
    @DrawableRes artLogo: Int,
    @DrawableRes brandLogo: Int
) {
    Box(
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.preferredWidth(width = 160.dp)
            .preferredHeight(237.dp),
        backgroundColor = backgroundColor
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier.preferredHeight(120.dp).fillMaxWidth(),
                backgroundColor = "#4c000000".parseColor(),
                shape = RoundedCornerShape(topLeft = 4.dp, topRight = 4.dp)
            ) {
                Stack(modifier = Modifier.fillMaxSize()) {
                    Image(
                        asset = imageResource(id = backgroundImage),
                        contentScale = ContentScale.Crop
                    )
                    Box(
                        modifier = Modifier.preferredSize(width = 22.dp, height = 26.dp)
                            .gravity(Alignment.TopEnd).padding(top = 14.dp)
                    ) {
                        Image(
                            asset = imageResource(id = brandLogo),
                            modifier = Modifier
                                .preferredSize(width = 12.dp, height = 12.dp)
                        )
                    }
                    Box(
                        backgroundColor = "#4c000000".parseColor(),
                        modifier = Modifier.preferredHeight(3.dp).fillMaxWidth()
                            .gravity(Alignment.BottomStart)
                    ) {
                        LinearProgressIndicator(
                            progress = 0.5f,
                            color = Color.White
                        )
                    }
                }
            }
            Box(
                modifier = Modifier.preferredSize(width = 140.dp, height = 72.dp)
                    .gravity(Alignment.CenterHorizontally)
                    .padding(10.dp)
            ) {
                Image(
                    asset = imageResource(id = artLogo),
                    modifier = Modifier.padding(10.dp)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp, start = 10.dp),
                verticalGravity = Alignment.CenterVertically
            ) {
                Image(asset = vectorResource(id = R.drawable.ic_play))
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "S1 E2",
                    style = TextStyle(color = Color.White, fontSize = 13.sp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun preview() {
    StandardCard(
        backgroundColor = "#7b1118".parseColor(),
        backgroundImage = R.drawable.gntm,
        artLogo = R.drawable.gntm_art_logo,
        brandLogo = R.drawable.pro_sieben_white
    )
}