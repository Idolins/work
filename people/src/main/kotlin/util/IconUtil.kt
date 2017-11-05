/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package util

/**
 * Created by young on 2017/11/5.
 */
object IconUtil {
    fun getIcon(suffix: String): String {

        val iconType = when (suffix) {
            "png" -> "img.png"
            "jpg" -> "img.png"
            "ppt" -> "ppt.png"
            "pptx" -> "ppt.png"
            "doc" -> "word.png"
            "docx" -> "word.png"
            "md" -> "markdown.png"
            "py" -> "python.png"
            "sql" -> "sql.png"
            else -> "na.png"
        }

        return "icon/$iconType"
    }
}