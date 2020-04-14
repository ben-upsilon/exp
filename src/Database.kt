package ben.upsilon

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction


object Q {
fun init(){
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")
    transaction {
        addLogger(StdOutSqlLogger)

        SchemaUtils.create (Tasks, TaskGroups)
    }
}

}
object Tasks :Table(){
   val id= integer("id").autoIncrement()
    val name = varchar("name",1024)
}

object TaskGroups:Table(){
    val id= integer("id").autoIncrement()
    val name=varchar("name",1024)
}

