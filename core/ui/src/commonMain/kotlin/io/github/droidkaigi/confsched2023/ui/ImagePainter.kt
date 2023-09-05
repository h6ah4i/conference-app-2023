package io.github.droidkaigi.confsched2023.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import com.seiko.imageloader.LocalImageLoader
import com.seiko.imageloader.model.ImageRequest
import com.seiko.imageloader.model.ImageRequestBuilder
import com.seiko.imageloader.rememberImagePainter

@Composable
fun rememberAsyncImagePainter(url: String, maxImageSize: Int = -1): Painter {
    val request = remember(url, maxImageSize) {
        ImageRequest{
            data(url)
            options {
                if (maxImageSize > 0) this.maxImageSize = maxImageSize
            }
        }
    }
    return rememberImagePainter(request = request)
}
