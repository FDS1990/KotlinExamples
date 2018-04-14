import javafx.scene.control.Button
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import tornadofx.*

class MyView : View() {

    override val root = VBox()

    init {
        with(root) {
            this += Button("Press Me").apply {
                action { println("Hello world!") }
            }
        }
    }
}
