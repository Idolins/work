package service

import domain.SignInfo

/**
 * Created by young on 2017/11/9.
 */
interface SignService {
    fun sign(signInfo: SignInfo): String
}