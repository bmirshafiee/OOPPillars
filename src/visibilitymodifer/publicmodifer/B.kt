package visibilitymodifer.publicmodifer

open class B{

    fun createInstanceA(){
        val a = A()
        a.aProperty
        a.aFunction()

        val a2 = visibilitymodifer.protectedmodifier.A()
        a2.createInstanceA()

    }
}