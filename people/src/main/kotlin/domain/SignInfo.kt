package domain

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

/**
 * Created by young on 2017/11/9.
 */
@Entity
@Table(name = "signInfo")
class SignInfo {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    var id: Int = 0

    var longitude: Double = 0.0
    var latitude: Double = 0.0
    lateinit var date: Date

    @ManyToOne(targetEntity = User::class)
    @JoinColumn(name = "uid")
    lateinit var user: User
}