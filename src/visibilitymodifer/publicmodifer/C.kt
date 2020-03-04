package visibilitymodifer.publicmodifer

class C : A(){

    fun createInstanceA(){
        val a = A()
        a.aFunction()
        a.aProperty
    }
}