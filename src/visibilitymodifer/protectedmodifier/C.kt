package visibilitymodifer.protectedmodifier

class C : A(){

    fun createInstanceAProtected(){
        val a = A()
        a.createInstanceA()
        aProperty
        aFunction()

        createInstanceA()
    }
}