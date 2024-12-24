import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val mssv: String,
    val name: String,
    val dateOfBirth: Date,
    val email: String
)