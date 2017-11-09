/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package action

import java.util.ArrayList
import java.util.Random

/**
 * Created by young on 2017/11/5.
 */
object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        val card = ArrayList<Int>()
        val poke = Array(13) { IntArray(4) }
        // i 牌面
        for (i in 0..12) {
            // j 表示花色 按照 红桃 0 黑桃 1 方块 2 梅花 3
            for (j in 0..3) {
                // 1 代表未使用的牌
                poke[i][j] = 1
                //                System.out.println("牌面是 "+i+"花色是"+j);
            }
        }
        var flag: Boolean = true
        while (flag) {
            val r = Random()
            val a = r.nextInt(52)
            // 随机的 牌面和花色
            val num = a / 4
            val type = a % 4

            if (poke[num][type] == 1) {
                println("牌面是" + (num + 1) + "花色是" + type)
                card.add(poke[num][type])
            }
            // 标记已经使用
            poke[num][type] = 0
            if (card.size >= 5) {
                flag = false
            }
        }

    }

}
