package service.serviceImp

import dao.SignDao
import dao.daoImp.SignDaoImp
import domain.SignInfo
import service.SignService

/**
 * Created by young on 2017/11/9.
 */
class SignServiceImp : SignService {

    private val ERROR = 2
    private lateinit var signDao: SignDao

    override fun sign(signInfo: SignInfo): String {
        signDao = SignDaoImp()
        // 计算范围

        val defualtLatitude: Double = 112.457627
        val defualtLongitude = 38.012849

        val range = Math.sqrt(Math.pow((defualtLatitude - signInfo.latitude), 2.0) + Math.pow((defualtLongitude - signInfo.longitude), 2.0))
        println("范围为 $range")
        // 每百米误差
        return if (range > 0.0015 * ERROR) {
            // 签到失败
            "error"
        } else {
            signDao.save(signInfo)
            "success"
        }
    }
}