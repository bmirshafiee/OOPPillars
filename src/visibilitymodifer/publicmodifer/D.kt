package visibilitymodifer.publicmodifer

class D : B(){

    fun createInstanceOfA(){
        val a = A()

        a.aProperty
        a.aFunction()
    }
}