class Dialog private constructor(
    private var dialogId: Int? = null,
    private var positiveButton: String? = null
) {
    data class Builder(
        private var dialogId: Int? = null,
        private var positiveButton: String? = null
    ){
        fun trackDialogById(dialogId: Int) = apply {
            this.dialogId = dialogId
        }

        fun withPositiveButton(positiveButton: String?) = apply {
            this.positiveButton = positiveButton
        }

        fun build() = Dialog(
            dialogId = this.dialogId,
            positiveButton = this.positiveButton
        )
    }

    fun show(){
        println("Show Dialog ID $dialogId with $positiveButton")

    }
}



fun main(){
    val dialog: Dialog = Dialog.Builder()
        .trackDialogById(78)
        .withPositiveButton("save")
        .build()
    dialog.show()

}