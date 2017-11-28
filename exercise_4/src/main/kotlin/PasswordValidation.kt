import org.mindrot.jbcrypt.BCrypt
import javax.swing.JOptionPane
import javax.swing.JPasswordField


fun main(args: Array<String>) {
    val salt = BCrypt.gensalt()
    val map: MutableMap<String, String> = HashMap();
    map.put(BCrypt.hashpw("abc$123", salt), "");

    val jPasswordField = JPasswordField()
    val message = "What is the password?"
    var passwordEntered = (JOptionPane.showConfirmDialog(null, jPasswordField, message,
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
    if (passwordEntered) {
        println("password is " + String(jPasswordField.password))
        if (map.containsKey(BCrypt.hashpw(String(jPasswordField.password), salt))) {
            println("Welcome!");
        } else {
            println("I don't know you.")
        }
    }
}