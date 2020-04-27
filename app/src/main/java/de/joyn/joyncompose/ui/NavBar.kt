package de.joyn.joyncompose.ui

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.Spacer
import androidx.ui.layout.Stack
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.layout.preferredHeight
import androidx.ui.layout.size
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import de.joyn.joyncompose.R

@Composable
fun NavBar(
    hexColor: Color,
    logo: VectorAsset,
    leftIcon: VectorAsset,
    rightIcon: VectorAsset? = null
) {
    Stack(modifier = Modifier.preferredHeight(120.dp).fillMaxWidth()) {
        Image(
            asset = vectorResource(id = R.drawable.ic_navbar_gradient),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth,
            colorFilter = ColorFilter.tint(hexColor)
        )
        Column(modifier = Modifier.matchParentSize()) {
            Spacer(modifier = Modifier.preferredHeight(24.dp))
            Row(
                modifier = Modifier.preferredHeight(56.dp)
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalGravity = Alignment.CenterVertically
            ) {
                Image(
                    asset = leftIcon,
                    modifier = Modifier.size(24.dp)
                )
                Image(asset = logo)
                if (rightIcon != null) {
                    Image(
                        asset = rightIcon,
                        modifier = Modifier.size(24.dp)
                    )
                } else {
                    Box(modifier = Modifier.size(24.dp))
                }
            }
        }
    }
}

@Preview
@Composable
private fun NavBarPreview() {
    NavBar(
        hexColor = Color.Gray,
        leftIcon = vectorResource(id = R.drawable.ic_account),
        logo = vectorResource(id = R.drawable.ic_logo)
    )
}